package com.petsvalley.service;

import com.petsvalley.entity.Claim;
import com.petsvalley.entity.Customer;
import com.petsvalley.util.PageModel;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public interface ClaimService {

    //华荣晟

    /**
     * 根据页码page和认领状态claimState获取所有认领信息
     * @param page
     * @param claimState
     * @return
     */
    PageModel<Claim> getClaimList(Integer page, Integer claimState);

    /**
     * 根据claimId获取Claim
     * @param claimId
     * @return
     */
    Claim getClaimById(Integer claimId);

    /**
     * 根据用户id获取Claim
     * @param custId
     * @return
     */
    List<Claim> getClaimByCustId(Integer custId);

    /**
     * 发布认领信息
     * @param customer
     * @param claim
     * @param claimTimeStr
     * @param path
     * @param files
     * @return
     */
    String releaseClaim(Customer customer, Claim claim,String claimTimeStr, String path, MultipartFile[] files);

    /**
     * 修改认领信息
     * @param customer
     * @param claim
     * @param path
     * @param files
     * @return
     */
    String setClaim(Customer customer,Claim claim,String path,MultipartFile[] files);

    /**
     * 根据用户上传图片识别相似认领信息
     * @param path
     * @param files
     * @return
     */
    List<Claim> distinguishPhoto(String path,MultipartFile[] files);

    //mjs

    PageModel<Claim> getClaimByPage( PageModel<Claim> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate(Integer userId, Date to, Date from1 );

    PageModel<Claim> getClaimByPageDate( PageModel<Claim> page, Integer userId, Date to, Date from1 );

}
