package com.petsvalley.mapper;

import com.petsvalley.entity.InsuranceCategory;
import com.petsvalley.entity.InsuranceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceCategoryMapper {
    long countByExample( InsuranceCategoryExample example );

    int deleteByExample( InsuranceCategoryExample example );

    int deleteByPrimaryKey( Integer icId );

    int insert( InsuranceCategory record );

    int insertSelective( InsuranceCategory record );

    List<InsuranceCategory> selectByExample( InsuranceCategoryExample example );

    InsuranceCategory selectByPrimaryKey( Integer icId );

    int updateByExampleSelective( @Param("record") InsuranceCategory record, @Param("example") InsuranceCategoryExample example );

    int updateByExample( @Param("record") InsuranceCategory record, @Param("example") InsuranceCategoryExample example );

    int updateByPrimaryKeySelective( InsuranceCategory record );

    int updateByPrimaryKey( InsuranceCategory record );
}