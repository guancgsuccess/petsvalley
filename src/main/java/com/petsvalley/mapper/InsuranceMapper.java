package com.petsvalley.mapper;

import com.petsvalley.entity.Insurance;
import com.petsvalley.entity.InsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceMapper {
    long countByExample( InsuranceExample example );

    int deleteByExample( InsuranceExample example );

    int deleteByPrimaryKey( Integer insId );

    int insert( Insurance record );

    int insertSelective( Insurance record );

    List<Insurance> selectByExample( InsuranceExample example );

    Insurance selectByPrimaryKey( Integer insId );

    int updateByExampleSelective( @Param("record") Insurance record, @Param("example") InsuranceExample example );

    int updateByExample( @Param("record") Insurance record, @Param("example") InsuranceExample example );

    int updateByPrimaryKeySelective( Insurance record );

    int updateByPrimaryKey( Insurance record );
}