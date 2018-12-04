package com.petsvalley.mapper;

import com.petsvalley.entity.Regulations;
import com.petsvalley.entity.RegulationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegulationsMapper {
    long countByExample( RegulationsExample example );

    int deleteByExample( RegulationsExample example );

    int deleteByPrimaryKey( Integer regId );

    int insert( Regulations record );

    int insertSelective( Regulations record );

    List<Regulations> selectByExample( RegulationsExample example );

    Regulations selectByPrimaryKey( Integer regId );

    int updateByExampleSelective( @Param("record") Regulations record, @Param("example") RegulationsExample example );

    int updateByExample( @Param("record") Regulations record, @Param("example") RegulationsExample example );

    int updateByPrimaryKeySelective( Regulations record );

    int updateByPrimaryKey( Regulations record );
}