package com.petsvalley.mapper;

import com.petsvalley.entity.Hospital;
import com.petsvalley.entity.HospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalMapper {
    long countByExample( HospitalExample example );

    int deleteByExample( HospitalExample example );

    int deleteByPrimaryKey( Integer hosId );

    int insert( Hospital record );

    int insertSelective( Hospital record );

    List<Hospital> selectByExample( HospitalExample example );

    Hospital selectByPrimaryKey( Integer hosId );

    int updateByExampleSelective( @Param("record") Hospital record, @Param("example") HospitalExample example );

    int updateByExample( @Param("record") Hospital record, @Param("example") HospitalExample example );

    int updateByPrimaryKeySelective( Hospital record );

    int updateByPrimaryKey( Hospital record );
}