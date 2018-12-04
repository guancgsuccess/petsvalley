package com.petsvalley.mapper;

import com.petsvalley.entity.Protuct;
import com.petsvalley.entity.ProtuctExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtuctMapper {
    long countByExample( ProtuctExample example );

    int deleteByExample( ProtuctExample example );

    int deleteByPrimaryKey( Integer proId );

    int insert( Protuct record );

    int insertSelective( Protuct record );

    List<Protuct> selectByExample( ProtuctExample example );

    Protuct selectByPrimaryKey( Integer proId );

    int updateByExampleSelective( @Param("record") Protuct record, @Param("example") ProtuctExample example );

    int updateByExample( @Param("record") Protuct record, @Param("example") ProtuctExample example );

    int updateByPrimaryKeySelective( Protuct record );

    int updateByPrimaryKey( Protuct record );
}