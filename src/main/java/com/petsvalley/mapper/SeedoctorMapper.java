package com.petsvalley.mapper;

import com.petsvalley.entity.Seedoctor;
import com.petsvalley.entity.SeedoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedoctorMapper {
    long countByExample( SeedoctorExample example );

    int deleteByExample( SeedoctorExample example );

    int deleteByPrimaryKey( Integer docId );

    int insert( Seedoctor record );

    int insertSelective( Seedoctor record );

    List<Seedoctor> selectByExample( SeedoctorExample example );

    Seedoctor selectByPrimaryKey( Integer docId );

    int updateByExampleSelective( @Param("record") Seedoctor record, @Param("example") SeedoctorExample example );

    int updateByExample( @Param("record") Seedoctor record, @Param("example") SeedoctorExample example );

    int updateByPrimaryKeySelective( Seedoctor record );

    int updateByPrimaryKey( Seedoctor record );
}