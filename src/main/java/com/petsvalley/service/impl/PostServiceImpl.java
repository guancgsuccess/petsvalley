package com.petsvalley.service.impl;

import com.petsvalley.entity.Post;
import com.petsvalley.entity.PostExample;
import com.petsvalley.mapper.PostMapper;
import com.petsvalley.service.PostService;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.PostUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public Integer save(Post post) {
        int rows=postMapper.insert(post);
        return rows;
    }

    @Override
    public Post getByPostId(Integer id) {
        Post post=postMapper.selectByPrimaryKey(id);
        return post;
    }

    @Override
    public List<Post> getByPage(PageModel<PostUtil> pageModel,String name,String spare) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        example.setLimit(pageModel.getPageSize());
        example.setOffset((long)pageModel.getStartRecord());
        criteria.andPostStateEqualTo(0);

        PostExample.Criteria criteria1=example.createCriteria();
        if (!name.equals("pets")){
            criteria.andPostTitleLike("%"+name+"%");
            example.or(criteria);
            criteria1.andPostStateEqualTo(0);
            criteria1.andPostContentLike("%"+name+"%");
            example.or(criteria1);
        }
        if (spare.equals("2")||spare.equals("4")){
            criteria.andPostSpareEqualTo(spare);
        }
        if (spare.equals("3")){
            example.setOrderByClause("post_count desc");
        }
        List<Post> postList=postMapper.selectByExample(example);
        return postList;
    }

  /*  @Override
    public PageModel<Post> getByPage(PageModel<Post> pageModel) {
        pageModel.setTotalRecord(postService.recordCount());
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());
        pageModel.setTotalPages(pageModel.getTotalRecord()%pageModel.getPageSize()==0 ? pageModel.getTotalRecord()/pageModel.getPageSize():pageModel.getTotalRecord()/pageModel.getPageSize()+1);
        pageModel.setEndRecord(pageModel.getCurrentPageCode()*pageModel.getPageSize()-1);
        List<Post> userList=userDao.getByPage(pageModel);
        pageModel.setModelList(userList);
        return pageModel;
    }*/

    @Override
    public List<Post> getAll() {
        PostExample example=new PostExample();
        List<Post> postList= postMapper.selectByExample(example);
        return postList;
    }

    @Override
    public List<Post> getAllById(Integer id) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo(id);
        List<Post> postList= postMapper.selectByExample(example);
        return postList;
    }

    @Override
    public List<Post> getByTitle(String title) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostTitleLike(title);
        List<Post> postList=postMapper.selectByExample(example);
        return postList;
    }

    @Override
    public Integer delete(Integer id) {
        int rows=postMapper.deleteByPrimaryKey(id);
        return rows;
    }

    @Override
    public int recordCount(String spare) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo(0);
        criteria.andPostSpareEqualTo(spare);
     int recordCount=(int)postMapper.countByExample(example);
        return recordCount;
    }

    @Override
    public int recordCount2() {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo(0);
        int recordCount=(int)postMapper.countByExample(example);
        return recordCount;
    }

    @Override
    public int recordCount3(String name) {
        PostExample example=new PostExample();
        PostExample.Criteria criteria=example.createCriteria();
        criteria.andPostStateEqualTo(0);
        PostExample.Criteria criteria1=example.createCriteria();
        if (!name.equals("pets")){
            criteria.andPostTitleLike("%"+name+"%");
            example.or(criteria);
            criteria1.andPostStateEqualTo(0);
            criteria1.andPostContentLike("%"+name+"%");
            example.or(criteria1);
        }
        int recordCount=(int)postMapper.countByExample(example);
        return recordCount;
    }

    @Override
    public int updatePostCountOfAdd(int postId) {
        PostExample postExample=new PostExample();
        PostExample.Criteria criteria=postExample.createCriteria();
        criteria.andPostIdEqualTo(postId);
        Post post=postMapper.selectByPrimaryKey(postId);
        post.setPostCount(post.getPostCount()+1);
        postMapper.updateByExampleSelective(post,postExample);
        return 0;
    }

    @Override
    public int updatePostOfReduce(int postId) {
        PostExample postExample=new PostExample();
        PostExample.Criteria criteria=postExample.createCriteria();
        criteria.andPostIdEqualTo(postId);
        Post post=postMapper.selectByPrimaryKey(postId);
        post.setPostCount(post.getPostCount()-1);
        postMapper.updateByExampleSelective(post,postExample);
        return 0;
    }

    @Override
    public List<Post> getByCommCount() {
        PostExample postExample=new PostExample();
        PostExample.Criteria criteria=postExample.createCriteria();
        postExample.setOrderByClause("post_count desc");
        postExample.setLimit(6);
        postExample.setOffset((long)0);
        criteria.andPostStateEqualTo(0);
        List<Post> postList=postMapper.selectByExample(postExample);
        return postList;
    }

}
