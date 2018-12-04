package com.petsvalley.service.impl;

import com.petsvalley.entity.SystemMessage;
import com.petsvalley.entity.SystemMessageExample;
import com.petsvalley.mapper.SystemMessageMapper;
import com.petsvalley.service.MessageService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private SystemMessageMapper messageMapper;

    @Override
    public PageModel<SystemMessage> getMessageByPage( PageModel<SystemMessage> page,String userId ){
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageSpareEqualTo( userId );
        criteria.andSystemMessageStatueEqualTo( 0 );
        example.setOrderByClause( "system_message_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( messageMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCount(String userId ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageStatueEqualTo( 0 );
        criteria.andSystemMessageSpareEqualTo( userId );
        return  (int ) messageMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
       SystemMessage message=new SystemMessage();
       message.setSystemMessageId( msgid );
       message.setSystemMessageStatue( 1 );
        return messageMapper.updateByPrimaryKeySelective( message );
    }

    @Override
    public Integer getCountByDate( String userId, Date to, Date from1 ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageTimeBetween( from1,to );
        criteria.andSystemMessageStatueEqualTo( 0 );
        criteria.andSystemMessageSpareEqualTo( userId );
        return  (int ) messageMapper.countByExample( example );
    }

    @Override
    public PageModel<SystemMessage> getMessageByPageDate( PageModel<SystemMessage> page, String userId, Date to, Date from1 ) {
        System.out.println("from+"+from1+"to+"+to);
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageTimeBetween( from1,to );
        criteria.andSystemMessageSpareEqualTo( userId );
        criteria.andSystemMessageStatueEqualTo( 0 );
        example.setOrderByClause( "system_message_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( messageMapper.selectByExample( example ));
        System.out.println( messageMapper.selectByExample( example ));
        return page;
    }

    @Override
    public Integer getCountManage( ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageStatueEqualTo( 0 );
        /*   criteria.andApplySpareEqualTo( 0+"" );*/
        return  (int ) messageMapper.countByExample( example );
    }

    @Override
    public PageModel<SystemMessage> getSystemMessageByPageManage( PageModel<SystemMessage> page ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageStatueEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "system_message_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( messageMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageTimeBetween( from2,to2 );
        /*criteria.andApplySpareEqualTo( 0+"" );*/
        criteria.andSystemMessageStatueEqualTo( 0 );
        return  (int) messageMapper.countByExample( example);
    }

    @Override
    public PageModel<SystemMessage> getSystemMessageByPageDateManage( PageModel<SystemMessage> page, Date to2, Date from2 ) {
        SystemMessageExample example=new SystemMessageExample();
        SystemMessageExample.Criteria criteria=example.createCriteria();
        criteria.andSystemMessageTimeBetween( from2,to2 );
        criteria.andSystemMessageStatueEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "system_message_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( messageMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( SystemMessage message ) {
        return messageMapper.insert( message );
    }
}
