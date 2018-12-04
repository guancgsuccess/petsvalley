package com.petsvalley.mapper;

import com.petsvalley.entity.BeautyRoom;
import com.petsvalley.entity.BeautyRoomExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeautyRoomMapper {
    long countByExample( BeautyRoomExample example );

    int deleteByExample( BeautyRoomExample example );

    int deleteByPrimaryKey( Integer beautyId );

    int insert( BeautyRoom record );

    int insertSelective( BeautyRoom record );

    List<BeautyRoom> selectByExample( BeautyRoomExample example );

    BeautyRoom selectByPrimaryKey( Integer beautyId );

    int updateByExampleSelective( @Param("record") BeautyRoom record, @Param("example") BeautyRoomExample example );

    int updateByExample( @Param("record") BeautyRoom record, @Param("example") BeautyRoomExample example );

    int updateByPrimaryKeySelective( BeautyRoom record );

    int updateByPrimaryKey( BeautyRoom record );
}