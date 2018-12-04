package com.petsvalley.service;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.FindPet;
import com.petsvalley.util.PageModel;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import java.util.Date;

public interface FindPetService {

    //by 华荣晟

    /**
     * 通过page获取寻宠信息FindPet的PageModel
     * @param page
     * @return
     */
    PageModel<FindPet> getByPage(Integer page);

    /**
     * 发布寻宠信息
     * @param findPet
     * @return 返回发布信息
     */
    String releaseFindPet(FindPet findPet, Customer customer, MultipartFile[] files,String path);

    /**
     * 获取寻宠FindPet详情
     * @return
     */
    FindPet getFindPetByFpId(Integer fpId);

    /**
     * 通过fpState和page查询寻宠信息FindPet的PageModel
     * @param fpState
     * @param page
     * @return
     */
    PageModel<FindPet> getByCondition(Integer fpState,Integer page);

    /**
     * 通过用户id查询其所有寻宠信息FindPet
     * @param custId
     * @return
     */
    List<FindPet> getByCustId(Integer custId);

    /**
     * 修改寻宠信息
     * @param findPet
     * @return
     */
    String setFindPet(Customer customer,FindPet findPet,String path,MultipartFile[] files);

    //by 孟继升

    PageModel<FindPet> getFindPetByPage( PageModel<FindPet> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate( Integer userId, Date to, Date from1 );

    PageModel<FindPet> getFindPetByPageDate( PageModel<FindPet> page, Integer userId, Date to, Date from1 );


}
