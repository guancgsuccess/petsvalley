package com.petsvalley.service;


import com.petsvalley.entity.Macth;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface MatchService {
    PageModel<Macth> getMatchByPage( PageModel<Macth> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Macth> getMatchByPageDate( PageModel<Macth> page, Integer userId, Date to, Date from1 );

}
