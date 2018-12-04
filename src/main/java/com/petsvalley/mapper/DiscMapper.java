package com.petsvalley.mapper;

import com.petsvalley.entity.Disc;
import com.petsvalley.entity.DiscExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscMapper {
    long countByExample( DiscExample example );

    int deleteByExample( DiscExample example );

    int deleteByPrimaryKey( Integer discId );

    int insert( Disc record );

    int insertSelective( Disc record );

    List<Disc> selectByExample( DiscExample example );

    Disc selectByPrimaryKey( Integer discId );

    int updateByExampleSelective( @Param("record") Disc record, @Param("example") DiscExample example );

    int updateByExample( @Param("record") Disc record, @Param("example") DiscExample example );

    int updateByPrimaryKeySelective( Disc record );

    int updateByPrimaryKey( Disc record );
}