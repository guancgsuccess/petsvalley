package com.petsvalley.service;


import com.petsvalley.entity.Apply;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface ApplyService {
    PageModel<Apply> getApplyByPage( PageModel<Apply> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Apply> getApplyByPageDate( PageModel<Apply> page, Integer userId, Date to, Date from1 );

    Integer getCountManage( );

    PageModel<Apply> getApplyByPageManage( PageModel<Apply> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Apply> getApplyByPageDateManage( PageModel<Apply> page, Date to2, Date from2 );

    int acceptUpdate( Integer msgid ,Integer userid );

    int refuseUpdate( Integer msgid,Integer userid );

}
