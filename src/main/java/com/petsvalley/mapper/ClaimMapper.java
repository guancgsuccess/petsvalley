package com.petsvalley.mapper;

import com.petsvalley.entity.Claim;
import com.petsvalley.entity.ClaimExample;
import com.petsvalley.util.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimMapper {
    long countByExample( ClaimExample example );

    int deleteByExample( ClaimExample example );

    int deleteByPrimaryKey( Integer claimId );

    int insert( Claim record );

    int insertSelective( Claim record );

    List<Claim> selectByExample( ClaimExample example );

    Claim selectByPrimaryKey( Integer claimId );

    int updateByExampleSelective( @Param("record") Claim record, @Param("example") ClaimExample example );

    int updateByExample( @Param("record") Claim record, @Param("example") ClaimExample example );

    int updateByPrimaryKeySelective( Claim record );

    int updateByPrimaryKey( Claim record );

    //by 华荣晟

    /**
     * 根据认领状态查询认领信息总数
     * @param claimState
     * @return
     */
    Integer selectCountByState(@Param("claimState") Integer claimState);

    /**
     * 按分页和认领状态查询所有认领信息
     * @param pageModel
     * @param claimState
     * @return
     */
    List<Claim> selectClaimList(PageModel<Claim> pageModel,Integer claimState);

    /**
     * 查询用户发布的认领信息
     * @param custId
     * @return
     */
    List<Claim> selectClaimByCustId(Integer custId);

    /**
     * 查询出所有认领信息
     * @return
     */
    List<Claim> selectAllClaim();

}