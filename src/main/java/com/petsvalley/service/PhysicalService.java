package com.petsvalley.service;


import com.petsvalley.entity.Apply;
import com.petsvalley.entity.Physicals;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface PhysicalService {
    PageModel<Physicals> getPhysicalByPage( PageModel<Physicals> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Physicals> getPhysicalByPageDate( PageModel<Physicals> page, Integer userId, Date to, Date from1 );

    int insert( Physicals physicals );
    Integer getCountManage( );

    PageModel<Physicals> getPhysicalsByPageManage( PageModel<Physicals> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Physicals> getPhysicalsByPageDateManage( PageModel<Physicals> page, Date to2, Date from2 );

}
