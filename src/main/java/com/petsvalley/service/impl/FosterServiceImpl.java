package com.petsvalley.service.impl;

import com.petsvalley.entity.*;
import com.petsvalley.mapper.*;
import com.petsvalley.service.FosterService;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.RandomNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class FosterServiceImpl implements FosterService {

    //by 华荣晟

    @Autowired
    private FosterMapper mapper;
    @Autowired
    private PetTypeMapper petTypeMapper;
    @Autowired
    private PetMapper petMapper;
    @Autowired
    private ImgMapper imgMapper;
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public Map<Integer,Object> getFosterList(String condition, Integer page, String petDisc) {

        Integer fosterState=0;
        if(condition!=null) {
            if (condition.equals("未寄养"))
                fosterState = 0;
            else if (condition.equals("已寄养"))
                fosterState = 1;
        }

        if(petDisc!=null && petDisc.equals("所有种类"))
            petDisc=null;

        if(page==null)
            page=1;
        PageModel<Foster> pageModel = new PageModel<>();
        pageModel.setCurrentPageCode(page);
        pageModel.setTotalRecord(mapper.selectCount(fosterState,petDisc));
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());

        List<Foster> fosterList = mapper.selectFosterList(fosterState,pageModel,petDisc);
        List<PetType> petTypeList = new ArrayList<>();
        for(Foster foster:fosterList){
            PetType petType = petTypeMapper.selectByPetId(foster.getFosterPetId());
            petTypeList.add(petType);
        }

        pageModel.setModelList(fosterList);

        Map<Integer,Object> map = new HashMap<>();
        map.put(0,pageModel);
        map.put(1,petTypeList);

        return map;

    }

    @Override
    public Foster getFosterByFosterId(Integer fosterId) {
        return mapper.selectByPrimaryKey(fosterId);
    }

    @Override
    public String saveFosterApply(Customer customer,Integer fosterId,String applyReason) {
        if(customer == null)
            return "请登录";

        Foster foster = mapper.selectByPrimaryKey(fosterId);
        if(foster.getFosterState()==1)
            return "该宠物已被领养";

        //判断是否是自己的宠物
        if(petMapper.selectIsMyPet(customer.getCustId(),foster.getFosterPetId())==1)
            return "不能领养自己的宠物";

        Apply apply = new Apply();
        apply.setFosterId(fosterId);
        apply.setApplyCustId(customer.getCustId());
        apply.setApplyState(0);
        apply.setApplyTime(new Date());
        apply.setApplyClassify("申请领养宠物");
        apply.setApplySchedule("待审批");
        apply.setApplySpare(applyReason);

        Integer row = applyMapper.insert(apply);
        if(row==1)
            return "申请成功，请等待管理员审批";
        else
            return "申请失败，请重新申请";
    }

    @Override
    public String saveFoster(Customer customer, Foster foster, String path, MultipartFile[] files) {
        if(mapper.selectFosterByPetId(foster.getFosterPetId())!=null){
            return "该宠物已经发布过寄养信息，请耐心等待。";
        }
        Pet pet = petMapper.selectByPrimaryKey(foster.getFosterPetId());
        if(pet.getPetState()==1)
            return "该宠物已丢失，不能发布寄养信息。";

        foster.setFosterCustId(customer.getCustId());
        foster.setFosterState(0);

        for(int i = 0;i<files.length;i++){
            //文件上传
            Integer index = files[i].getOriginalFilename().indexOf(".");
            String suffix = files[i].getOriginalFilename().substring(index);
            String fileName = RandomNameUtil.getRandomFileName()+foster.getFosterPetId()+suffix;

            Img img = new Img();

            if(i==0)
                foster.setFosterPhoto("/upload/"+fileName);
            else{
                img.setPath("/upload/"+fileName);
                img.setImgState(0);
                img.setImgType(1);
                img.setCustId(customer.getCustId());
                img.setPetId(foster.getFosterPetId());
                imgMapper.insert(img);
            }

            File test = new File(path +"/"+ fileName);

            try {
                files[i].transferTo(test); //保存文件
            } catch (IOException e) {
                e.printStackTrace();
                return "上传图片失败，请重新发布";
            }
        }
        Integer row = mapper.insert(foster);
        if(row==1){
            petMapper.updatePetState(foster.getFosterPetId(),2);
            return "发布成功";
        }else
            return "发布失败，请重新发布";
    }

    //by 孟继升

    @Autowired
    private FosterMapper fosterMapper;
    @Override
    public PageModel<Foster> getFosterByPage( PageModel<Foster> page, Integer userId ){
        FosterExample example=new FosterExample();
        FosterExample.Criteria criteria=example.createCriteria();
        criteria.andFosterCustIdEqualTo( userId );
        criteria.andFosterStateEqualTo( 0 );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( fosterMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        FosterExample example=new FosterExample();
        FosterExample.Criteria criteria=example.createCriteria();
        criteria.andFosterStateEqualTo( 0 );
        criteria.andFosterCustIdEqualTo( userId );
        return  (int ) fosterMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        return fosterMapper.deleteByPrimaryKey( msgid );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        return  getCount(userId);
    }

    @Override
    public PageModel<Foster> getFosterByPageDate( PageModel<Foster> page, Integer userId, Date to, Date from1 ) {
        return getFosterByPage(page,userId);
    }

    @Override
    public Foster queryById( Integer msgid ) {
        return fosterMapper.selectByPrimaryKey( msgid );
    }
    /*-------------------------------------------*/
}
