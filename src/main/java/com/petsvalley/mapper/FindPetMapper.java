package com.petsvalley.mapper;

import com.petsvalley.entity.FindPet;
import com.petsvalley.entity.FindPetExample;
import com.petsvalley.util.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FindPetMapper {
    Integer countByExample( FindPetExample example );

    Integer deleteByExample( FindPetExample example );

    Integer deleteByPrimaryKey( Integer fpId );

    Integer insert( FindPet record );

    Integer insertSelective( FindPet record );

    List<FindPet> selectByExample( FindPetExample example );

    FindPet selectByPrimaryKey( Integer fpId );

    Integer updateByExampleSelective( @Param("record") FindPet record, @Param("example") FindPetExample example );

    Integer updateByExample( @Param("record") FindPet record, @Param("example") FindPetExample example );

    Integer updateByPrimaryKeySelective( FindPet record );

    Integer updateByPrimaryKey( FindPet record );

    //by 华荣晟

    /**
     * 分页查询寻宠信息
     * @param pageModel
     * @return
     */
    List<FindPet> selectByPage(PageModel<FindPet> pageModel);

    /**
     * 查询寻宠信息总数
     * @return
     */
    Integer selectCount();

    /**
     * 根据寻宠状态查询寻宠信息总数
     * @param fpState
     * @return
     */
    Integer selectCountByCondition(Integer fpState);

    /**
     * 按条件查询寻宠信息
     * @param pageModel 分页
     * @param fpState 寻宠状态
     * @return
     */
    List<FindPet> selectByCondition(PageModel<FindPet> pageModel, Integer fpState);

    /**
     * 查询某用户发布的所有寻宠信息
     * @param custId
     * @return
     */
    List<FindPet> selectByCustId(Integer custId);

    /**
     * 根据宠物id查询出该宠物的寻宠信息
     * @param petId
     * @return
     */
    FindPet selectFindPetByPetId(Integer petId);

}