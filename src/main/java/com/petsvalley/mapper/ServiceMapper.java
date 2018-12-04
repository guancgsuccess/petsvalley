package com.petsvalley.mapper;

import com.petsvalley.entity.Service;
import com.petsvalley.entity.ServiceExample;
import com.petsvalley.util.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper {
    long countByExample( ServiceExample example );

    int deleteByExample( ServiceExample example );

    int deleteByPrimaryKey( Integer serviceId );

    int insert( Service record );

    int insertSelective( Service record );

    List<Service> selectByExample( ServiceExample example );

    Service selectByPrimaryKey( Integer serviceId );

    int updateByExampleSelective( @Param("record") Service record, @Param("example") ServiceExample example );

    int updateByExample( @Param("record") Service record, @Param("example") ServiceExample example );

    int updateByPrimaryKeySelective( Service record );

    int updateByPrimaryKey( Service record );

    //by 华荣晟

    /**
     * 分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByPage(PageModel<Service> pageModel);

    /**
     * 查询服务总数
     * @return
     */
    Integer selectCount();

    /**
     * 按积分降序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByRewardDesc(PageModel<Service> pageModel);

    /**
     * 按积分升序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByRewardAsc(PageModel<Service> pageModel);

    /**
     * 按发布时间降序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByTimeDesc(PageModel<Service> pageModel);

    /**
     * 按发布时间升序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByTimeAsc(PageModel<Service> pageModel);

    /**
     * 按需求人数降序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByNoDesc(PageModel<Service> pageModel);

    /**
     * 按需求人数升序分页查询服务
     * @param pageModel
     * @return
     */
    List<Service> selectByNoAsc(PageModel<Service> pageModel);

}