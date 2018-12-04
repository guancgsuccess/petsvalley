package com.petsvalley.mapper;

import com.petsvalley.entity.PetType;
import com.petsvalley.entity.PetTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetTypeMapper {
    long countByExample( PetTypeExample example );

    int deleteByExample( PetTypeExample example );

    int deleteByPrimaryKey( Integer typeId );

    int insert( PetType record );

    int insertSelective( PetType record );

    List<PetType> selectByExample( PetTypeExample example );

    PetType selectByPrimaryKey( Integer typeId );

    int updateByExampleSelective( @Param("record") PetType record, @Param("example") PetTypeExample example );

    int updateByExample( @Param("record") PetType record, @Param("example") PetTypeExample example );

    int updateByPrimaryKeySelective( PetType record );

    int updateByPrimaryKey( PetType record );

    //by 华荣晟

    /**
     * 通过宠物id查找宠物类别
     * @param petId
     * @return
     */
    PetType selectByPetId(Integer petId);

}