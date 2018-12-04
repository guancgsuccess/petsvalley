package com.petsvalley.service.impl;


import com.petsvalley.entity.Post;
import com.petsvalley.entity.PostExample;
import com.petsvalley.mapper.PostMapper;
import com.petsvalley.service.MyPostService;
import com.petsvalley.service.MyPostService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyPostServiceImpl implements MyPostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public PageModel<Post> getMyPostByPage( PageModel<Post> page, Integer userId ){
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        criteria.andPostStateEqualTo( 0 );
        example.setOrderByClause( "post_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( postMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int ) postMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Post post=new Post();
        post.setPostId( msgid );
        post.setPostState( 1 );
        return postMapper.updateByPrimaryKeySelective( post );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostTimeBetween( from1,to );
        criteria.andPostStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int ) postMapper.countByExample( example );
    }

    @Override
    public PageModel<Post> getMyPostByPageDate( PageModel<Post> page, Integer userId, Date to, Date from1 ) {

        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostTimeBetween( from1,to );
        criteria.andCustIdEqualTo( userId );
        criteria.andPostStateEqualTo( 0 );
        example.setOrderByClause( "post_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( postMapper.selectByExample( example ));
        System.out.println( postMapper.selectByExample( example ));
        return page;
    }

    @Override
    public Integer getCountManage( ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo( 0 );
        return  (int ) postMapper.countByExample( example );
    }

    @Override
    public PageModel<Post> getPostByPageManage( PageModel<Post> page ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo( 0 );
        example.setOrderByClause( "post_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( postMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostTimeBetween( from2,to2 );
        criteria.andPostStateEqualTo( 0 );
        return  (int) postMapper.countByExample( example);
    }

    @Override
    public PageModel<Post> getPostByPageDateManage( PageModel<Post> page, Date to2, Date from2 ) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostTimeBetween( from2,to2 );
        criteria.andPostStateEqualTo( 0 );
        example.setOrderByClause( "post_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( postMapper.selectByExample( example ));
        return page;
    }
}
