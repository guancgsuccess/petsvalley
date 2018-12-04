package com.petsvalley.mapper;

import com.petsvalley.entity.SystemMessage;
import com.petsvalley.entity.SystemMessageExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemMessageMapper {
    long countByExample( SystemMessageExample example );

    int deleteByExample( SystemMessageExample example );

    int deleteByPrimaryKey( Integer systemMessageId );

    int insert( SystemMessage record );

    int insertSelective( SystemMessage record );

    List<SystemMessage> selectByExample( SystemMessageExample example );

    SystemMessage selectByPrimaryKey( Integer systemMessageId );

    int updateByExampleSelective( @Param("record") SystemMessage record, @Param("example") SystemMessageExample example );

    int updateByExample( @Param("record") SystemMessage record, @Param("example") SystemMessageExample example );

    int updateByPrimaryKeySelective( SystemMessage record );

    int updateByPrimaryKey( SystemMessage record );
}