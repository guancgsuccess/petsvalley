package com.petsvalley.service;

import com.petsvalley.entity.Appeal;
import com.petsvalley.entity.SystemMessage;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface AppealService {

    PageModel<Appeal> getAppealByPage( PageModel<Appeal> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Appeal> getAppealByPageDate( PageModel<Appeal> page, Integer userId, Date to, Date from1 );

    int insert( Appeal appeal );

    int refuseUpdate( Integer msgid, int userid );

    int acceptUpdate( Integer msgid, int userid );

    Integer getCountManage( );

    PageModel<Appeal> getAppealByPageManage( PageModel<Appeal> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Appeal> getAppealByPageDateManage( PageModel<Appeal> page, Date to2, Date from2 );

}
