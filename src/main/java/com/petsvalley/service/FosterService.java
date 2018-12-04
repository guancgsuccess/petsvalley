package com.petsvalley.service;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Foster;
import com.petsvalley.util.PageModel;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.Map;

public interface FosterService {

    //by 华荣晟

    /**
     * 获取寄养信息
     * @param condition
     * @param page
     * @param petDisc
     * @return
     */
    Map<Integer,Object> getFosterList(String condition, Integer page, String petDisc);

    /**
     * 根据寄养id获取寄养
     * @param fosterId
     * @return
     */
    Foster getFosterByFosterId(Integer fosterId);

    /**
     * 保存用户申请领养信息
     * @param customer
     * @param fosterId
     * @param applyReason
     * @return
     */
    String saveFosterApply(Customer customer,Integer fosterId,String applyReason);

    /**
     * 保存用户发布的寄养信息
     * @param customer
     * @param foster
     * @param path
     * @param files
     * @return
     */
    String saveFoster(Customer customer, Foster foster, String path, MultipartFile[] files);

    //by 孟继升

    PageModel<Foster> getFosterByPage(PageModel<Foster> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate(Integer userId, Date to, Date from1 );

    PageModel<Foster> getFosterByPageDate( PageModel<Foster> page, Integer userId, Date to, Date from1 );

    Foster queryById( Integer msgid );

}
