package com.petsvalley.mapper;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.CommentExample;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    long countByExample( CommentExample example );

    int deleteByExample( CommentExample example );

    int deleteByPrimaryKey( Integer commId );

    int insert( Comment record );

    int insertSelective( Comment record );

    List<Comment> selectByExample( CommentExample example );

    Comment selectByPrimaryKey( Integer commId );

    int updateByExampleSelective( @Param("record") Comment record, @Param("example") CommentExample example );

    int updateByExample( @Param("record") Comment record, @Param("example") CommentExample example );

    int updateByPrimaryKeySelective( Comment record );

    int updateByPrimaryKey( Comment record );
}