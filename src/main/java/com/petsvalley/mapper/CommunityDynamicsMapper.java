package com.petsvalley.mapper;

import com.petsvalley.entity.CommunityDynamics;
import com.petsvalley.entity.CommunityDynamicsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunityDynamicsMapper {
    long countByExample( CommunityDynamicsExample example );

    int deleteByExample( CommunityDynamicsExample example );

    int deleteByPrimaryKey( Integer cdId );

    int insert( CommunityDynamics record );

    int insertSelective( CommunityDynamics record );

    List<CommunityDynamics> selectByExample( CommunityDynamicsExample example );

    CommunityDynamics selectByPrimaryKey( Integer cdId );

    int updateByExampleSelective( @Param("record") CommunityDynamics record, @Param("example") CommunityDynamicsExample example );

    int updateByExample( @Param("record") CommunityDynamics record, @Param("example") CommunityDynamicsExample example );

    int updateByPrimaryKeySelective( CommunityDynamics record );

    int updateByPrimaryKey( CommunityDynamics record );
}