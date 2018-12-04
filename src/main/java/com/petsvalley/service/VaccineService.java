package com.petsvalley.service;


import com.petsvalley.entity.Punishment;
import com.petsvalley.entity.Vaccine;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface VaccineService {
    PageModel<Vaccine> getVaccineByPage( PageModel<Vaccine> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Vaccine> getVaccineByPageDate( PageModel<Vaccine> page, Integer userId, Date to, Date from1 );

    int insert( Vaccine vaccine );

    Integer getCountManage( );

    PageModel<Vaccine> getVaccineByPageManage( PageModel<Vaccine> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Vaccine> getVaccineByPageDateManage( PageModel<Vaccine> page, Date to2, Date from2 );

}
