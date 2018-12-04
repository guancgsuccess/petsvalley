package com.petsvalley.service;

import com.petsvalley.entity.Pet;

public interface SystemMessageService {

    /**
     * 保存对寻宠信息的回复信息
     * @param content
     * @param phone
     * @param pet
     * @return
     */
    String saveFindPetContactMessage(String content,String phone,Pet pet);

    /**
     * 保存认领宠物的回复信息
     * @param content
     * @param phone
     * @param custId
     * @return
     */
    String saveClaimPetContactMessage(String content,String phone,Integer custId);

}
