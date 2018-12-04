package com.petsvalley.mapper;

import com.petsvalley.entity.AfterSaleService;
import com.petsvalley.entity.AfterSaleServiceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AfterSaleServiceMapper {
    long countByExample( AfterSaleServiceExample example );

    int deleteByExample( AfterSaleServiceExample example );

    int deleteByPrimaryKey( Integer assId );

    int insert( AfterSaleService record );

    int insertSelective( AfterSaleService record );

    List<AfterSaleService> selectByExample( AfterSaleServiceExample example );

    AfterSaleService selectByPrimaryKey( Integer assId );

    int updateByExampleSelective( @Param("record") AfterSaleService record, @Param("example") AfterSaleServiceExample example );

    int updateByExample( @Param("record") AfterSaleService record, @Param("example") AfterSaleServiceExample example );

    int updateByPrimaryKeySelective( AfterSaleService record );

    int updateByPrimaryKey( AfterSaleService record );
}