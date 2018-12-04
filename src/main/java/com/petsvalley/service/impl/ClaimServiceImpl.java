package com.petsvalley.service.impl;

import com.petsvalley.entity.Claim;
import com.petsvalley.entity.ClaimExample;
import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;
import com.petsvalley.mapper.ClaimMapper;
import com.petsvalley.mapper.ImgMapper;
import com.petsvalley.service.ClaimService;
import com.petsvalley.util.FingerPrint;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.RandomNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    //by 华荣晟

    @Autowired
    private ClaimMapper mapper;
    @Autowired
    private ImgMapper imgMapper;

    @Override
    public PageModel<Claim> getClaimList(Integer page, Integer claimState) {
        //根据page创建PageModel
        if(page==null)
            page=1;
        PageModel<Claim> pageModel = new PageModel<>();
        pageModel.setCurrentPageCode(page);
        pageModel.setTotalRecord(mapper.selectCountByState(claimState));
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());

        //根据pageModel和认领状态查询认领信息
        List<Claim> claimList = mapper.selectClaimList(pageModel,claimState);
        pageModel.setModelList(claimList);
        return pageModel;
    }

    @Override
    public Claim getClaimById(Integer claimId) {
        return mapper.selectByPrimaryKey(claimId);
    }

    @Override
    public List<Claim> getClaimByCustId(Integer custId) {
        return mapper.selectClaimByCustId(custId);
    }

    @Override
    public String releaseClaim(Customer customer, Claim claim,String claimTimeStr, String path, MultipartFile[] files) {

        //将时间字符串转换成Date类型并存到claim中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date claimTime = null;
        try {
            claimTime = sdf.parse(claimTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        claim.setClaimTime(claimTime);
        //设置认领信息的状态和客户id
        claim.setClaimState(0);
        claim.setCustId(customer.getCustId());

        for(int i = 0;i<files.length;i++){
            //文件上传
            //获取文件后缀名
            Integer index = files[i].getOriginalFilename().indexOf(".");
            String suffix = files[i].getOriginalFilename().substring(index);
            //随机生成不重复的文件名
            String fileName = RandomNameUtil.getRandomFileName()+claim.getCustId()+suffix;

            Img img = new Img();
            if(i==0){//将第一张图片作为主展示图片存放到认领信息中
                claim.setClaimPhoto("/upload/"+fileName);
                claim.setClaimSpare(fileName);
            }
            else{//将其他图片信息另外存放到Img表中
                img.setPath("/upload/"+fileName);
                img.setImgState(0);
                img.setImgType(2);
                img.setCustId(customer.getCustId());
                img.setImgSpare(claim.getClaimSpare());
                imgMapper.insert(img);
            }

            //生成图片文件并保存
            File test = new File(path + "/" + fileName);
            try {
                files[i].transferTo(test); //保存文件
            } catch (IOException e) {
                e.printStackTrace();
                return "上传图片失败，请重新发布";
            }
        }
        Integer row = mapper.insertSelective(claim);
        if(row==1){
            return "发布成功";
        }else
            return "发布失败，请重新发布";
    }

    @Override
    public String setClaim(Customer customer, Claim claim, String path, MultipartFile[] files) {
        //查询要修改的认领信息
        Claim claim1 = mapper.selectByPrimaryKey(claim.getClaimId());

        for(int i = 0;i<files.length;i++){
            //生成随机的文件名
            Integer index = files[i].getOriginalFilename().indexOf(".");
            String suffix = files[i].getOriginalFilename().substring(index);
            String fileName = RandomNameUtil.getRandomFileName()+customer.getCustId()+suffix;

            //将添加的图片加入到Img中并保存图片文件
            Img img = new Img();
            img.setPath("/upload/"+fileName);
            img.setImgState(0);
            img.setImgType(2);
            img.setCustId(customer.getCustId());
            img.setImgSpare(claim1.getClaimSpare());
            imgMapper.insert(img);

            File test = new File(path + "/" + fileName);
            try {
                files[i].transferTo(test); //保存文件
            } catch (IOException e) {
                e.printStackTrace();
                return "上传图片失败，请重试";
            }
        }

        Integer row = mapper.updateByPrimaryKeySelective(claim);
        if(row==1)
            return "修改成功";
        else
            return "修改失败，请重试";
    }

    @Override
    public List<Claim> distinguishPhoto(String path, MultipartFile[] files) {

        //获得要识别的图片并保存
        Integer index = files[0].getOriginalFilename().indexOf(".");
        String suffix = files[0].getOriginalFilename().substring(index);
        String fileName = RandomNameUtil.getRandomFileName()+suffix;
        File test = new File(path+"/"+fileName);
        try {
            files[0].transferTo(test);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //查询所有的认领信息
        List<Claim> claimList = mapper.selectAllClaim();
        //生成要识别的图片指纹FingerPrint
        FingerPrint fp1 = null;
        try {
            fp1 = new FingerPrint(ImageIO.read(test));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Claim> claimListSim = new ArrayList<>();
        List<Float> simList = new ArrayList<>();

        //对所有认领信息图片依次生成指纹FingerPrint并与上传的图片指纹对比取出满足对比度的记录
        for(Claim claim:claimList){
            FingerPrint fp2 = null;
            try {
                fp2 = new FingerPrint(ImageIO.read(new File(path+"/"+claim.getClaimSpare())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            float sim = fp1.compare(fp2);
            if(sim>0.65){
                claimListSim.add(claim);
                simList.add(sim);
            }
        }
        //将上传的图片删除，避免浪费资源
        test.delete();

        //按照相似度对取到的记录进行排序
        for (int i = 1; i < claimListSim.size(); i++){
            float get = simList.get(i);
            Claim get1 = claimListSim.get(i);
            int j = i - 1;
            while (j >= 0 && simList.get(j) < get)
            {
                simList.set(j+1,simList.get(j));
                claimListSim.set(j+1,claimListSim.get(j));
                j--;
            }
            simList.set(j+1,get);
            claimListSim.set(j+1,get1);
        }
        if(claimListSim.size()>20){
            for(int i=20;i<claimListSim.size();i++){
                claimListSim.remove(i);
            }
        }
        return claimListSim;
    }

    //by 孟继升

    @Autowired
    private ClaimMapper claimMapper;

    @Override
    public PageModel<Claim> getClaimByPage( PageModel<Claim> page, Integer userId ){
        ClaimExample example=new ClaimExample();
        ClaimExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        criteria.andClaimStateEqualTo( 0 );
        example.setOrderByClause( "claim_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( claimMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCount(Integer userId ) {
        ClaimExample example=new   ClaimExample();
        ClaimExample.Criteria criteria=example.createCriteria();
        criteria.andClaimStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int )   claimMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        return   claimMapper.deleteByPrimaryKey(   msgid );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        ClaimExample example=new   ClaimExample();
        ClaimExample.Criteria criteria=example.createCriteria();
        criteria.andClaimTimeBetween( from1,to );
        criteria.andClaimStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int )   claimMapper.countByExample( example );
    }

    @Override
    public PageModel<  Claim> getClaimByPageDate( PageModel<Claim> page, Integer userId, Date to, Date from1 ) {

        ClaimExample example=new ClaimExample();
        ClaimExample.Criteria criteria=example.createCriteria();
        criteria.andClaimTimeBetween( from1,to );
        criteria.andCustIdEqualTo( userId );
        criteria.andClaimStateEqualTo( 0 );
        example.setOrderByClause( "claim_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( claimMapper.selectByExample( example ));
        System.out.println( claimMapper.selectByExample( example ));
        return page;
    }

}
