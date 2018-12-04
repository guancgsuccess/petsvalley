package com.petsvalley.mapper;

import com.petsvalley.entity.Pet;
import com.petsvalley.entity.PetExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetMapper {
    long countByExample( PetExample example );

    int deleteByExample( PetExample example );

    int deleteByPrimaryKey( Integer petId );

    int insert( Pet record );

    int insertSelective( Pet record );

    List<Pet> selectByExample( PetExample example );

    Pet selectByPrimaryKey( Integer petId );

    int updateByExampleSelective( @Param("record") Pet record, @Param("example") PetExample example );

    int updateByExample( @Param("record") Pet record, @Param("example") PetExample example );

    int updateByPrimaryKeySelective( Pet record );

    int updateByPrimaryKey( Pet record );

    //by 华荣晟

    /**
     * 根据用户id查询出用户所有宠物
     * @param custId 宠物id
     * @return
     */
    List<Pet> selectByCustId(Integer custId);

    /**
     * 判断宠物是否是该用户的
     * @param custId 用户id
     * @param petId 宠物id
     * @return
     */
    Integer selectIsMyPet(Integer custId,Integer petId);

    /**
     * 更新宠物状态
     * @param petId 宠物id
     * @param petState 更新后的状态
     * @return
     */
    Integer updatePetState(Integer petId,Integer petState);

}