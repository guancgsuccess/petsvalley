package com.petsvalley.mapper;

import com.petsvalley.entity.Post;
import com.petsvalley.entity.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMapper {

    long countByExample( PostExample example );

    int deleteByExample( PostExample example );

    int deleteByPrimaryKey( Integer postId );

    int insert( Post record );

    int insertSelective( Post record );

    List<Post> selectByExample( PostExample example );

    Post selectByPrimaryKey( Integer postId );

    int updateByExampleSelective( @Param("record") Post record, @Param("example") PostExample example );

    int updateByExample( @Param("record") Post record, @Param("example") PostExample example );

    int updateByPrimaryKeySelective( Post record );

    int updateByPrimaryKey( Post record );

}