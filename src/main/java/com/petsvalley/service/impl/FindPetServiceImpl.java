package com.petsvalley.service.impl;

import com.petsvalley.entity.*;
import com.petsvalley.mapper.FindPetMapper;
import com.petsvalley.mapper.ImgMapper;
import com.petsvalley.mapper.PetMapper;
import com.petsvalley.service.FindPetService;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.RandomNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class FindPetServiceImpl implements FindPetService {

    //by 华荣晟

    @Autowired
    private FindPetMapper mapper;
    @Autowired
    private PetMapper petMapper;
    @Autowired
    private ImgMapper imgMapper;

    @Override
    public PageModel<FindPet> getByPage(Integer page) {

        //根据page生成pageModel
        PageModel<FindPet> pageModel = new PageModel<>();
        if(page!=null)
            pageModel.setCurrentPageCode(page);
        else
            pageModel.setCurrentPageCode(1);
        pageModel.setTotalRecord(mapper.selectCount());
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());
        //根据pageModel查询出所有寻宠信息
        List<FindPet> findPetList = mapper.selectByPage(pageModel);
        pageModel.setModelList(findPetList);
        return pageModel;

    }

    @Override
    public String releaseFindPet(FindPet findPet,Customer customer,MultipartFile[] files,String path) {

        //判断用户发布的宠物是否已经发布过寻宠信息
        if(mapper.selectFindPetByPetId(findPet.getPetId())!=null){
            return "改宠物已经发布过寻宠信息，请耐心等待。";
        }
        //获取要发布的宠物信息，判断是否已发布寄养信息
        Pet pet = petMapper.selectByPrimaryKey(findPet.getPetId());
        if(pet.getPetState()==2||pet.getPetState()==3)
            return "该宠物已发布寄养信息，不能发布寻宠信息，请先取消寄养。";

        //上传用户添加的图片
        for(int i = 0;i<files.length;i++){
            //文件上传
            //随机生成不重复的文件名
            Integer index = files[i].getOriginalFilename().indexOf(".");
            String suffix = files[i].getOriginalFilename().substring(index);
            String fileName = RandomNameUtil.getRandomFileName()+findPet.getPetId()+suffix;

            Img img = new Img();
            //将第一张图片当作主图片放入寻宠信息，其他图片放入Img中
            if(i==0)
                findPet.setPetPhoto("/upload/"+fileName);
            else{
                img.setPath("/upload/"+fileName);
                img.setImgState(0);
                img.setImgType(1);
                img.setCustId(customer.getCustId());
                img.setPetId(findPet.getPetId());
                imgMapper.insert(img);
            }

            //保存图片
            File test = new File(path + "/" + fileName);
            try {
                files[i].transferTo(test); //保存文件
            } catch (IOException e) {
                e.printStackTrace();
                return "上传图片失败，请重新发布";
            }
        }
        Integer row = mapper.insertSelective(findPet);
        if(row==1){
            petMapper.updatePetState(findPet.getPetId(),1);
            return "发布成功";
        }else
            return "发布失败，请重新发布";

    }

    @Override
    public FindPet getFindPetByFpId(Integer fpId) {
        return mapper.selectByPrimaryKey(fpId);
    }

    @Override
    public PageModel<FindPet> getByCondition(Integer fpState,Integer page) {

        if(page==null)
            page=1;
        PageModel<FindPet> pageModel = new PageModel<>();
        pageModel.setCurrentPageCode(page);

        pageModel.setTotalRecord(mapper.selectCountByCondition(fpState));
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());
        List<FindPet> findPetList = mapper.selectByCondition(pageModel,fpState);
        pageModel.setModelList(findPetList);
        return pageModel;

    }

    @Override
    public List<FindPet> getByCustId(Integer custId) {
        return mapper.selectByCustId(custId);
    }

    @Override
    public String setFindPet(Customer customer,FindPet findPet,String path,MultipartFile[] files) {

        for (int i = 0; i < files.length; i++) {
            Integer index = files[i].getOriginalFilename().indexOf(".");
            String suffix = files[i].getOriginalFilename().substring(index);
            String fileName = RandomNameUtil.getRandomFileName() + findPet.getPetId() + suffix;

            Img img = new Img();

            img.setPath("/upload/" + fileName);
            img.setImgState(0);
            img.setImgType(1);
            img.setCustId(customer.getCustId());
            img.setPetId(findPet.getPetId());
            imgMapper.insert(img);

            File test = new File(path + "/" + fileName);

            try {
                files[i].transferTo(test); //保存文件
            } catch (IOException e) {
                e.printStackTrace();
                return "上传图片失败，请重试";
            }
        }

        Integer row = mapper.updateByPrimaryKeySelective(findPet);
        if (row == 1)
            return "修改成功";
        else
            return "修改失败，请重试";
    }

    //by 孟继升

    @Autowired
    private FindPetMapper findPetMapper;

    @Override
    public PageModel<FindPet> getFindPetByPage( PageModel<FindPet> page, Integer userId ){
        FindPetExample example=new FindPetExample();
        FindPetExample.Criteria criteria=example.createCriteria();
        criteria.andFdSpareEqualTo( userId+"" );
        criteria.andFpStateEqualTo( 0 );
        example.setOrderByClause( "lost_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( findPetMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCount(Integer userId ) {
        FindPetExample example=new FindPetExample();
        FindPetExample.Criteria criteria=example.createCriteria();
        criteria.andFpStateEqualTo( 0 );
        criteria.andFdSpareEqualTo( ""+userId );
        return  findPetMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        return findPetMapper.deleteByPrimaryKey( msgid );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        FindPetExample example=new FindPetExample();
        FindPetExample.Criteria criteria=example.createCriteria();
        criteria.andLostTimeBetween( from1,to );
        criteria.andFpStateEqualTo( 0 );
        criteria.andFdSpareEqualTo( userId+"" );
        return findPetMapper.countByExample( example );
    }

    @Override
    public PageModel<FindPet> getFindPetByPageDate( PageModel<FindPet> page, Integer userId, Date to, Date from1 ) {

        FindPetExample example=new FindPetExample();
        FindPetExample.Criteria criteria=example.createCriteria();
        criteria.andLostTimeBetween( from1,to );
        criteria.andFdSpareEqualTo( userId+"");
        criteria.andFpStateEqualTo( 0 );
        example.setOrderByClause( "lost_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( findPetMapper.selectByExample( example ));
        System.out.println( findPetMapper.selectByExample( example ));
        return page;
    }

}
