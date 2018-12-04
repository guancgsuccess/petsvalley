package com.petsvalley.mapper;

import com.petsvalley.entity.Foster;
import com.petsvalley.entity.FosterExample;
import com.petsvalley.util.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FosterMapper {
    long countByExample( FosterExample example );

    int deleteByExample( FosterExample example );

    int deleteByPrimaryKey( Integer fosterId );

    int insert( Foster record );

    int insertSelective( Foster record );

    List<Foster> selectByExample( FosterExample example );

    Foster selectByPrimaryKey( Integer fosterId );

    int updateByExampleSelective( @Param("record") Foster record, @Param("example") FosterExample example );

    int updateByExample( @Param("record") Foster record, @Param("example") FosterExample example );

    int updateByPrimaryKeySelective( Foster record );

    int updateByPrimaryKey( Foster record );

    //by 华荣晟

    /**
     * 根据条件查询寄养信息
     * @param fosterState 寄养状态
     * @param pageModel 分页
     * @param petDisc 宠物类别
     * @return
     */
    List<Foster> selectFosterList(Integer fosterState,PageModel<Foster> pageModel,String petDisc);

    /**
     * 查询寄养信息总数
     * @param fosterState 寄养状态
     * @param petDisc 宠物类别
     * @return
     */
    Integer selectCount(Integer fosterState,String petDisc);

    /**
     * 更新寄养信息状态
     * @param fosterId
     * @param fosterState
     * @return
     */
    Integer updateFosterState(Integer fosterId,Integer fosterState);

    /**
     * 根据宠物id查询宠物寄养信息
     * @param petId
     * @return
     */
    Foster selectFosterByPetId(Integer petId);

}