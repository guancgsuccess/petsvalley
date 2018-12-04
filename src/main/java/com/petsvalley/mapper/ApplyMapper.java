package com.petsvalley.mapper;

import com.petsvalley.entity.Apply;
import com.petsvalley.entity.ApplyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyMapper {
    long countByExample( ApplyExample example );

    int deleteByExample( ApplyExample example );

    int deleteByPrimaryKey( Integer applyId );

    int insert( Apply record );

    int insertSelective( Apply record );

    List<Apply> selectByExample( ApplyExample example );

    Apply selectByPrimaryKey( Integer applyId );

    int updateByExampleSelective( @Param("record") Apply record, @Param("example") ApplyExample example );

    int updateByExample( @Param("record") Apply record, @Param("example") ApplyExample example );

    int updateByPrimaryKeySelective( Apply record );

    int updateByPrimaryKey( Apply record );

    //by 华荣晟

    /**
     * 查询所有服务的总数
     * @param serviceId
     * @return
     */
    Integer selectCountByServiceId(Integer serviceId);

    /**
     * 查询用户是否已申请过该申请
     * @param serviceId
     * @param applyCustId
     * @return
     */
    Integer selectAlreadyApply(Integer serviceId,Integer applyCustId);
}