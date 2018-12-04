package com.petsvalley.service.impl;

import com.petsvalley.entity.Img;
import com.petsvalley.entity.ImgExample;
import com.petsvalley.mapper.ImgMapper;
import com.petsvalley.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {

    //by 荀传跃

    @Autowired
    private ImgMapper imgMapper;
    @Override
    public int save(Img img) {
        int rows=imgMapper.insert(img);
        return rows;
    }

    @Override
    public List<Img> getByPostId(int postId) {
        ImgExample imgExample = new ImgExample();
        ImgExample.Criteria criteria = imgExample.createCriteria();
        criteria.andPostIdEqualTo(postId);
        List<Img> imgList = imgMapper.selectByExample(imgExample);
        return imgList;
    }

    //by 华荣晟

    @Autowired
    private ImgMapper mapper;

    @Override
    public List<Img> getFindPetImages(Integer custId, Integer petId) {
        return mapper.selectFindPetImages(custId,petId);
    }

    @Override
    public List<Img> getClaimImages(Integer custId, String claimSpare) {
        return mapper.selectClaimImages(custId,claimSpare);
    }

    @Override
    public List<Img> getFosterImages(Integer custId, Integer petId) {
        return mapper.selectFosterImages(custId,petId);
    }

}
