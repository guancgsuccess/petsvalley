package com.petsvalley.mapper;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    long countByExample( CustomerExample example );

    int deleteByExample( CustomerExample example );

    int deleteByPrimaryKey( Integer custId );

    int insert( Customer record );

    int insertSelective( Customer record );

    List<Customer> selectByExample( CustomerExample example );

    Customer selectByPrimaryKey( Integer custId );

    int updateByExampleSelective( @Param("record") Customer record, @Param("example") CustomerExample example );

    int updateByExample( @Param("record") Customer record, @Param("example") CustomerExample example );

    int updateByPrimaryKeySelective( Customer record );

    int updateByPrimaryKey( Customer record );
}