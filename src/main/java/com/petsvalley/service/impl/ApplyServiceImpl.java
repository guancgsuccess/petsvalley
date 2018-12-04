package com.petsvalley.service.impl;


import com.petsvalley.entity.*;
import com.petsvalley.mapper.*;
import com.petsvalley.service.ApplyService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private SystemMessageMapper messageMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private FosterMapper fosterMapper;
    @Autowired
    private ServiceMapper serviceMapper;
    @Autowired
    private PetMapper petMapper;
    @Override
    public PageModel<Apply> getApplyByPage( PageModel<Apply> page, Integer userId ){
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyCustIdEqualTo( userId );
        criteria.andApplyStateEqualTo( 0 );
        example.setOrderByClause( "apply_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( applyMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyStateEqualTo( 0 );
        criteria.andApplyCustIdEqualTo( userId );
        return  (int ) applyMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
       Apply apply=new Apply();
        apply.setApplyId( msgid );
        apply.setApplyState( 1 );
        return applyMapper.updateByPrimaryKeySelective( apply );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyTimeBetween( from1,to );
        criteria.andApplyStateEqualTo( 0 );
        criteria.andApplyCustIdEqualTo( userId );
        return  (int ) applyMapper.countByExample( example );
    }

    @Override
    public PageModel<Apply> getApplyByPageDate( PageModel<Apply> page, Integer userId, Date to, Date from1 ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyTimeBetween( from1,to );
        criteria.andApplyCustIdEqualTo( userId );
        criteria.andApplyStateEqualTo( 0 );
        example.setOrderByClause( "apply_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( applyMapper.selectByExample( example ));
        return page;
    }
/*-------------------------------------------*/
    @Override
    public Integer getCountManage( ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyStateEqualTo( 0 );
     /*   criteria.andApplySpareEqualTo( 0+"" );*/
        return  (int ) applyMapper.countByExample( example );
    }

    @Override
    public PageModel<Apply> getApplyByPageManage( PageModel<Apply> page ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyStateEqualTo( 0 );
       /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "apply_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( applyMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyTimeBetween( from2,to2 );
        /*criteria.andApplySpareEqualTo( 0+"" );*/
        criteria.andApplyStateEqualTo( 0 );
        return  (int) applyMapper.countByExample( example);
    }

    @Override
    public PageModel<Apply> getApplyByPageDateManage( PageModel<Apply> page, Date to2, Date from2 ) {
        ApplyExample example=new ApplyExample();
        ApplyExample.Criteria criteria=example.createCriteria();
        criteria.andApplyTimeBetween( from2,to2 );
        criteria.andApplyStateEqualTo( 0 );
       /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "apply_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( applyMapper.selectByExample( example ));
        return page;
   }

    @Override
    public int acceptUpdate(  Integer msgid,Integer userid ) {
        Apply apply=new Apply();
        apply.setApplyId( msgid );
       /* apply.setApplySpare( 1+"" );*/
        apply.setApplySchedule("已接受");
        applyMapper.updateByPrimaryKeySelective( apply );
        SystemMessage message=new SystemMessage();
        SystemMessage message2=new SystemMessage();
        Apply apply1=applyMapper.selectByPrimaryKey( msgid );
        message.setSystemMessageTitle( "申请接受通知" );
        message2.setSystemMessageTitle( "用户申请通知" );
        Customer user=customerMapper.selectByPrimaryKey( apply1.getApplyCustId() );
        String gender="男";
        if(user.getCusGender()==0)gender="女";
        Integer petid=0;
        if(apply1.getServiceId()!=null){
            message.setSystemMessageSpare( apply1.getApplyCustId()+"");
            message.setSystemMessageContent( "您的申请:"+msgid+"已于1分钟前被管理员批准,详情请看<<我的申请>>" );
            message2.setSystemMessageSpare( userid+"");
            message2.setSystemMessageContent( "您发布的志愿服务:"+apply1.getServiceId()+"已由用户"
                    +user.getCustName()+"申请并审核通过,经管理员审核该用户信誉良好,基本信息如下:性别:"+gender+"年龄"+user.getCustAge()
            +"积分:"+user.getCustIntegral()+"联系电话:"+user.getCustPhone()+"邮箱:"+user.getCustEmail()+"请尽快与他联系");
          com.petsvalley.entity.Service service11=serviceMapper.selectByPrimaryKey( apply1.getServiceId() );
          user.setCustIntegral( user.getCustIntegral()+service11.getServiceReward() );
         com.petsvalley.entity.Service service= serviceMapper.selectByPrimaryKey( apply1.getServiceId() );
         service.setServiceId( null );
         service.setServiceSpare( user.getCustId()+"" );
         serviceMapper.insert( service );
          customerMapper.updateByPrimaryKey( user );
        }
        else if(apply1.getFosterId()!=null){
            message.setSystemMessageSpare( apply1.getApplyCustId()+"" );
            message.setSystemMessageContent( "您的申请:"+msgid+"已于1分钟前被管理员批准,详情请看<<我的申请>>" );
            message2.setSystemMessageSpare( ((Foster )fosterMapper.selectByPrimaryKey( apply1.getFosterId())).getFosterCustId()+"");
            message2.setSystemMessageContent( "您发布的寄养需求:"+apply1.getFosterId()+"已由用户"
                    +user.getCustName()+"申请并审核通过,经管理员审核该用户信誉良好,基本信息如下:性别:"+gender+"年龄"+user.getCustAge()
                    +"积分:"+user.getCustIntegral()+"联系电话:"+user.getCustPhone()+"邮箱:"+user.getCustEmail()+"请尽快与他联系");
        }
        message.setSystemMessageTime( new Date(  ));
        message.setSystemMessageStatue( 0 );
        message2.setSystemMessageTime( new Date(  ));
        message2.setSystemMessageStatue( 0 );
        messageMapper.insert( message );
        messageMapper.insert( message2 );
        return 0;
    }

    @Override
    public int refuseUpdate(  Integer msgid,Integer userid) {
        Apply apply=new Apply();
        apply.setApplyId( msgid );
      /*  apply.setApplySpare( 1+"" );*/
        apply.setApplySchedule("已拒绝");
        applyMapper.updateByPrimaryKeySelective( apply );
        SystemMessage message=new SystemMessage();
        Apply apply1=applyMapper.selectByPrimaryKey( msgid );
        if(apply1.getFosterId()!=null&&apply1.getFosterId()!=0){
            Foster foster = fosterMapper.selectByPrimaryKey(apply1.getFosterId());
            petMapper.updatePetState(foster.getFosterPetId(),3);
        }
        message.setSystemMessageTitle( "申请被拒通知" );
        Integer petid=0;
        message.setSystemMessageSpare( apply1.getApplyCustId()+"" );
        message.setSystemMessageContent( "您的申请:"+msgid+"已于1分钟前被管理员拒绝,详情请看<<我的申请>>" );
        message.setSystemMessageTime( new Date(  ));
        message.setSystemMessageStatue( 0 );
        messageMapper.insert( message );
        return 0;
    }
}
