package com.petsvalley.service.impl;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.CommentExample;
import com.petsvalley.entity.Customer;
import com.petsvalley.mapper.CommentMapper;
import com.petsvalley.service.CommentService;
import com.petsvalley.util.CommUtil;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    public CommentMapper commentMapper;
    @Override
    public Integer save(Comment comment) {
        Integer rows=commentMapper.insert(comment);
        return rows;
    }

    @Override
    public Integer delete(Integer commId) {
        Integer rows=commentMapper.deleteByPrimaryKey(commId);
        return rows;
    }

    @Override
    public List<Comment> getByPage(PageModel<CommUtil> pageModel, Integer postId) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        example.setLimit(pageModel.getPageSize());
        example.setOffset((long)pageModel.getStartRecord());
        criteria.andPostIdEqualTo(postId);
        List<Comment> commentList=commentMapper.selectByExample(example);
        return commentList;
    }

    @Override
    public int recordCount(int postId) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        //criteria.andCommStateEqualTo(0);
        criteria.andPostIdEqualTo(postId);
        int record=(int)commentMapper.countByExample(example);
        return record;
    }

    @Override
    public Comment getBySpare(String spare,Integer postId) {
        CommentExample commentExample=new CommentExample();
        CommentExample.Criteria criteria=commentExample.createCriteria();
        int commId=Integer.parseInt(spare);
        criteria.andCommIdEqualTo(commId);
        criteria.andPostIdEqualTo(postId);
        Comment comment= commentMapper.selectByExample(commentExample).get(0);
        return comment;
    }

    @Override
    public Comment getById(Integer id) {
        Comment comment=commentMapper.selectByPrimaryKey(id);
        return comment;
    }

    //查询层主
    @Override
    public List<Comment> getAll(PageModel<CommUtil> pageModel, Integer postId) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        example.setLimit(pageModel.getPageSize());
        example.setOffset((long)pageModel.getStartRecord());
        criteria.andPostIdEqualTo(postId);
        criteria.andCommSpareIsNull();
        List<Comment> commentList=commentMapper.selectByExample(example);
        return commentList;
    }

    //查询每层的所有子评论
    @Override
    public List<Comment> getByFloor(Integer floorId,Integer postId) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        criteria.andPostIdEqualTo(postId);
        criteria.andCommStateEqualTo(floorId);
        criteria.andCommSpareIsNotNull();
      List<Comment> commentList= commentMapper.selectByExample(example);
        return commentList;
    }

    //查询每层楼的子评论数量
    @Override
    public Integer floorCount(Integer postId, Integer commState) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        criteria.andPostIdEqualTo(postId);
        criteria.andCommStateEqualTo(commState);
        criteria.andCommSpareIsNotNull();
        Integer count=(int)commentMapper.countByExample(example);
        return count;
    }

    //查询楼层数
    @Override
    public Integer floorRecord(Integer postId) {
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        criteria.andPostIdEqualTo(postId);
        criteria.andCommSpareIsNull();
        Integer count=(int)commentMapper.countByExample(example);
        return count;
    }
}
