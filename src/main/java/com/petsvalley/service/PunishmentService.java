package com.petsvalley.service;


import com.petsvalley.entity.Punishment;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface PunishmentService {
    PageModel<Punishment> getPunishmentByPage( PageModel<Punishment> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Punishment> getPunishmentByPageDate( PageModel<Punishment> page, Integer userId, Date to, Date from1 );

    Integer getCountManage( );

    PageModel<Punishment> getPunishmentByPageManage( PageModel<Punishment> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Punishment> getPunishmentByPageDateManage( PageModel<Punishment> page, Date to2, Date from2 );

    int insert( Punishment punishment );

    Punishment getById( Integer msgid );

}
