package com.petsvalley.mapper;

import com.petsvalley.entity.Img;
import com.petsvalley.entity.ImgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgMapper {

    long countByExample( ImgExample example );

    int deleteByExample( ImgExample example );

    int deleteByPrimaryKey( Integer imgId );

    int insert( Img record );

    int insertSelective( Img record );

    List<Img> selectByExample( ImgExample example );

    Img selectByPrimaryKey( Integer imgId );

    int updateByExampleSelective( @Param("record") Img record, @Param("example") ImgExample example );

    int updateByExample( @Param("record") Img record, @Param("example") ImgExample example );

    int updateByPrimaryKeySelective( Img record );

    int updateByPrimaryKey( Img record );

    //by 华荣晟

    /**
     * 查询寻宠宠物信息图片
     * @param custId 用户id
     * @param petId 宠物id
     * @return
     */
    List<Img> selectFindPetImages(Integer custId,Integer petId);

    /**
     * 查询寄养信息图片
     * @param custId 用户id
     * @param petId 宠物id
     * @return
     */
    List<Img> selectFosterImages(Integer custId,Integer petId);

    /**
     * 查询认领信息图片
     * @param custId 用户id
     * @param claimSpare 认领信息标识
     * @return
     */
    List<Img> selectClaimImages(Integer custId,String claimSpare);
}