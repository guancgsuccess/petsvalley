package com.petsvalley.service;

import com.petsvalley.entity.Pet;
import com.petsvalley.util.PageModel;

import java.util.Date;
import java.util.List;

public interface PetService {

    //by 华荣晟

    /**
     * 通过用户id获取用户所有宠物
     * @param custId
     * @return
     */
    List<Pet> getPetsByCustId(Integer custId);

    /**
     * 通过petId获取Pet
     * @param petId
     * @return
     */
    Pet getPetByPetId(Integer petId);

    //by 孟继升

    PageModel<Pet> getPetByPage(PageModel<Pet> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate(Integer userId, Date to, Date from1 );

    PageModel<Pet> getPetByPageDate( PageModel<Pet> page, Integer userId, Date to, Date from1 );

    Pet get( Integer msgid );

    int updatePet( Pet pet );

    int addPet( Pet pet );

    List<Pet> getAllByCustid( Integer userId );

    Integer getCountManage( );

    PageModel<Pet> getPetByPageManage( PageModel<Pet> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Pet> getPetByPageDateManage( PageModel<Pet> page, Date to2, Date from2 );

}
