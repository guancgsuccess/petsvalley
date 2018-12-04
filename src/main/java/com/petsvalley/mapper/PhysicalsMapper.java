package com.petsvalley.mapper;

import com.petsvalley.entity.Physicals;
import com.petsvalley.entity.PhysicalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalsMapper {
    long countByExample( PhysicalsExample example );

    int deleteByExample( PhysicalsExample example );

    int deleteByPrimaryKey( Integer phyId );

    int insert( Physicals record );

    int insertSelective( Physicals record );

    List<Physicals> selectByExample( PhysicalsExample example );

    Physicals selectByPrimaryKey( Integer phyId );

    int updateByExampleSelective( @Param("record") Physicals record, @Param("example") PhysicalsExample example );

    int updateByExample( @Param("record") Physicals record, @Param("example") PhysicalsExample example );

    int updateByPrimaryKeySelective( Physicals record );

    int updateByPrimaryKey( Physicals record );
}