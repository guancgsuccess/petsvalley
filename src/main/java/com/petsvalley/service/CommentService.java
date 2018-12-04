package com.petsvalley.service;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.Customer;
import com.petsvalley.util.CommUtil;
import com.petsvalley.util.PageModel;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CommentService {
    //新建评论
    public Integer save(Comment comment);

    //删除评论
    public Integer delete(Integer commId);

    //查询一个帖子的所有评论
    public List<Comment> getByPage(PageModel<CommUtil> pageModel, Integer postId);

    //查询评论数量
    public int recordCount(int postId);

    //查询该条评论是评论谁的
    public Comment getBySpare(String commSpare,Integer custId);

    //查询评论
    public Comment getById(Integer id);

    //查询层主
    public List<Comment> getAll(PageModel<CommUtil> pageModel, Integer postId);

    //查询每层的所有子评论
    public List<Comment> getByFloor(Integer floorId,Integer postId);

    //查询每层楼的子评论数量
    public Integer floorCount(Integer postId,Integer commState);

    //查询楼层数
    public Integer floorRecord(Integer postId);
}
