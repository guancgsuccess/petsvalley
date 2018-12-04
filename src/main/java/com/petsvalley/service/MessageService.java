package com.petsvalley.service;

import com.petsvalley.entity.SystemMessage;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface MessageService {
    PageModel<SystemMessage> getMessageByPage( PageModel<SystemMessage> page,String userId );

    Integer getCount(String userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( String userId, Date to, Date from1 );

    PageModel<SystemMessage> getMessageByPageDate( PageModel<SystemMessage> page, String userId, Date to, Date from1 );

    Integer getCountManage( );

    PageModel<SystemMessage> getSystemMessageByPageManage( PageModel<SystemMessage> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<SystemMessage> getSystemMessageByPageDateManage( PageModel<SystemMessage> page, Date to2, Date from2 );

    int insert( SystemMessage message );
}
