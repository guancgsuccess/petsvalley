package com.petsvalley.service;


import com.petsvalley.entity.Post;
import com.petsvalley.util.PageModel;

import java.util.Date;

public interface MyPostService {

    PageModel<Post> getMyPostByPage( PageModel<Post> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<Post> getMyPostByPageDate( PageModel<Post> page, Integer userId, Date to, Date from1 );

    Integer getCountManage( );

    PageModel<Post> getPostByPageManage( PageModel<Post> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Post> getPostByPageDateManage( PageModel<Post> page, Date to2, Date from2 );

}
