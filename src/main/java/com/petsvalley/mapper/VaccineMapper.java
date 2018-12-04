package com.petsvalley.mapper;

import com.petsvalley.entity.Vaccine;
import com.petsvalley.entity.VaccineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineMapper {
    long countByExample( VaccineExample example );

    int deleteByExample( VaccineExample example );

    int deleteByPrimaryKey( Integer vaccId );

    int insert( Vaccine record );

    int insertSelective( Vaccine record );

    List<Vaccine> selectByExample( VaccineExample example );

    Vaccine selectByPrimaryKey( Integer vaccId );

    int updateByExampleSelective( @Param("record") Vaccine record, @Param("example") VaccineExample example );

    int updateByExample( @Param("record") Vaccine record, @Param("example") VaccineExample example );

    int updateByPrimaryKeySelective( Vaccine record );

    int updateByPrimaryKey( Vaccine record );
}