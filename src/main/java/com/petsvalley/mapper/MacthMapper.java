package com.petsvalley.mapper;

import com.petsvalley.entity.Macth;
import com.petsvalley.entity.MacthExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MacthMapper {
    long countByExample( MacthExample example );

    int deleteByExample( MacthExample example );

    int deleteByPrimaryKey( Integer macId );

    int insert( Macth record );

    int insertSelective( Macth record );

    List<Macth> selectByExample( MacthExample example );

    Macth selectByPrimaryKey( Integer macId );

    int updateByExampleSelective( @Param("record") Macth record, @Param("example") MacthExample example );

    int updateByExample( @Param("record") Macth record, @Param("example") MacthExample example );

    int updateByPrimaryKeySelective( Macth record );

    int updateByPrimaryKey( Macth record );
}