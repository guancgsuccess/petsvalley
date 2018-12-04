package com.petsvalley.service.impl;

import com.petsvalley.entity.Pet;
import com.petsvalley.entity.SystemMessage;
import com.petsvalley.mapper.SystemMessageMapper;
import com.petsvalley.service.SystemMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SystemMessageServiceImpl implements SystemMessageService {

    @Autowired
    private SystemMessageMapper mapper;

    @Override
    public String saveFindPetContactMessage(String content, String phone, Pet pet) {

        String msg = "您发布的宠物："+pet.getPetName()+" 的寻宠信息有人回复，具体内容如下："+content+"    他的联系方式："+phone;
        SystemMessage systemMessage = new SystemMessage();
        systemMessage.setSystemMessageContent(msg);
        systemMessage.setSystemMessageTime(new Date());
        systemMessage.setSystemMessageTitle("寻宠信息回复");
        systemMessage.setSystemMessageSpare(pet.getCustId().toString());
        systemMessage.setSystemMessageStatue(0);
        Integer row = mapper.insert(systemMessage);
        if(row==1)
            return "发送信息成功";
        else
            return "发送信息失败，请重试";

    }

    @Override
    public String saveClaimPetContactMessage(String content, String phone,Integer custId) {

        String msg = "您发布的认领信息有人回复，具体内容如下："+content+"    他的联系方式："+phone;
        SystemMessage systemMessage = new SystemMessage();
        systemMessage.setSystemMessageContent(msg);
        systemMessage.setSystemMessageTime(new Date());
        systemMessage.setSystemMessageTitle("认领信息回复");
        systemMessage.setSystemMessageSpare(custId.toString());
        systemMessage.setSystemMessageStatue(0);
        Integer row = mapper.insert(systemMessage);
        if(row==1)
            return "发送信息成功";
        else
            return "发送信息失败，请重试";

    }

}
