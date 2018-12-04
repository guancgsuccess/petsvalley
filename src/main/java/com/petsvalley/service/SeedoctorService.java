package com.petsvalley.service;


import com.petsvalley.entity.Seedoctor;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface SeedoctorService {

    PageModel<Seedoctor> getSeeDoctorByPage( PageModel<Seedoctor> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Seedoctor> getSeeDoctorByPageDate( PageModel<Seedoctor> page, Integer userId, Date to, Date from1 );

    int insert( Seedoctor seedoctor );
}
