package com.petsvalley.mapper;

import com.petsvalley.entity.Strategy;
import com.petsvalley.entity.StrategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyMapper {
    long countByExample( StrategyExample example );

    int deleteByExample( StrategyExample example );

    int deleteByPrimaryKey( Integer straId );

    int insert( Strategy record );

    int insertSelective( Strategy record );

    List<Strategy> selectByExample( StrategyExample example );

    Strategy selectByPrimaryKey( Integer straId );

    int updateByExampleSelective( @Param("record") Strategy record, @Param("example") StrategyExample example );

    int updateByExample( @Param("record") Strategy record, @Param("example") StrategyExample example );

    int updateByPrimaryKeySelective( Strategy record );

    int updateByPrimaryKey( Strategy record );
}