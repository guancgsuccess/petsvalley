package com.petsvalley.mapper;

import com.petsvalley.entity.PetRoom;
import com.petsvalley.entity.PetRoomExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRoomMapper {
    long countByExample( PetRoomExample example );

    int deleteByExample( PetRoomExample example );

    int deleteByPrimaryKey( Integer petRoomId );

    int insert( PetRoom record );

    int insertSelective( PetRoom record );

    List<PetRoom> selectByExample( PetRoomExample example );

    PetRoom selectByPrimaryKey( Integer petRoomId );

    int updateByExampleSelective( @Param("record") PetRoom record, @Param("example") PetRoomExample example );

    int updateByExample( @Param("record") PetRoom record, @Param("example") PetRoomExample example );

    int updateByPrimaryKeySelective( PetRoom record );

    int updateByPrimaryKey( PetRoom record );
}