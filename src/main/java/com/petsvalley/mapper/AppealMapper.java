package com.petsvalley.mapper;

import com.petsvalley.entity.Appeal;
import com.petsvalley.entity.AppealExample;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppealMapper {
    long countByExample( AppealExample example );

    int deleteByExample( AppealExample example );

    int deleteByPrimaryKey( Integer aplId );

    int insert( Appeal record );

    int insertSelective( Appeal record );

    List<Appeal> selectByExample( AppealExample example );

    Appeal selectByPrimaryKey( Integer aplId );

    int updateByExampleSelective( @Param("record") Appeal record, @Param("example") AppealExample example );

    int updateByExample( @Param("record") Appeal record, @Param("example") AppealExample example );

    int updateByPrimaryKeySelective( Appeal record );

    int updateByPrimaryKey( Appeal record );
}