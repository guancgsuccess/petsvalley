package com.petsvalley.service.impl;

import com.petsvalley.entity.*;
import com.petsvalley.mapper.AppealMapper;
import com.petsvalley.mapper.CustomerMapper;
import com.petsvalley.mapper.FosterMapper;
import com.petsvalley.mapper.SystemMessageMapper;
import com.petsvalley.service.AppealService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppealServiceImpl implements AppealService {
    @Autowired
    private AppealMapper appealMapper;
    @Autowired
    private SystemMessageMapper messageMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private FosterMapper fosterMapper;
    @Override
    public PageModel<Appeal> getAppealByPage( PageModel<Appeal> page, Integer userId ){
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        criteria.andAplStateEqualTo( 0 );
        example.setOrderByClause( "apl_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( appealMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCount(Integer userId ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int ) appealMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        return appealMapper.deleteByPrimaryKey( msgid );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplTimeBetween( from1,to );
        criteria.andAplStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int ) appealMapper.countByExample( example );
    }

    @Override
    public PageModel<Appeal> getAppealByPageDate( PageModel<Appeal> page, Integer userId, Date to, Date from1 ) {

        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplTimeBetween( from1,to );
        criteria.andCustIdEqualTo( userId );
        criteria.andAplStateEqualTo( 0 );
        example.setOrderByClause( "apl_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( appealMapper.selectByExample( example ));
        System.out.println( appealMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Appeal appeal ) {
        return appealMapper.insert( appeal );
    }

    /*---------------------------------------------------*/
    @Override
    public Integer getCountManage( ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplStateEqualTo( 0 );
        return  (int ) appealMapper.countByExample( example );
    }

    @Override
    public PageModel<Appeal> getAppealByPageManage( PageModel<Appeal> page ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplStateEqualTo( 0 );
        example.setOrderByClause( "apl_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( appealMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplTimeBetween( from2,to2 );
        criteria.andAplStateEqualTo( 0 );
        return  (int) appealMapper.countByExample( example);
    }

    @Override
    public PageModel<Appeal> getAppealByPageDateManage( PageModel<Appeal> page, Date to2, Date from2 ) {
        AppealExample example=new AppealExample();
        AppealExample.Criteria criteria=example.createCriteria();
        criteria.andAplTimeBetween( from2,to2 );
        criteria.andAplStateEqualTo( 0 );
        example.setOrderByClause( "apl_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( appealMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int acceptUpdate(  Integer msgid,int userid ) {
        Appeal appeal=new Appeal();
        appeal.setAplId( msgid );
        appeal.setAplResult("已接受");
        appeal.setResultTime( new Date(  ) );
        appealMapper.updateByPrimaryKeySelective( appeal );
        SystemMessage message=new SystemMessage();
        Appeal appeal1=appealMapper.selectByPrimaryKey( msgid );
        message.setSystemMessageTitle( "申诉接受通知" );
        Customer user=customerMapper.selectByPrimaryKey( appeal1.getCustId() );
        message.setSystemMessageSpare( appeal1.getCustId()+"");
        message.setSystemMessageContent( "您的申诉:"+msgid+"已于1分钟前被管理员接受,详情请看<<我的申诉>>" );
        message.setSystemMessageTime( new Date(  ));
        message.setSystemMessageStatue( 0 );
        messageMapper.insert( message );
        return 0;
    }

    @Override
    public int refuseUpdate(  Integer msgid,int userid) {
       Appeal appeal=new Appeal();
        appeal.setAplId( msgid );
        appeal.setAplResult("已拒绝");
        appeal.setResultTime( new Date(  ) );
        appealMapper.updateByPrimaryKeySelective( appeal );
        SystemMessage message=new SystemMessage();
        Appeal appeal1=appealMapper.selectByPrimaryKey( msgid );
        message.setSystemMessageTitle( "申诉被拒通知" );
        message.setSystemMessageSpare( appeal1.getCustId()+"" );
        message.setSystemMessageContent( "您的申请:"+msgid+"已于1分钟前被管理员拒绝,详情请看<<我的申诉>>" );
        message.setSystemMessageTime( new Date(  ));
        message.setSystemMessageStatue( 0 );
        messageMapper.insert( message );
        return 0;
    }
}
