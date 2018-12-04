package com.petsvalley.service;

import com.petsvalley.entity.Img;

import java.util.List;

public interface ImgService {

    //by 荀传跃

    public int save(Img img);
    public List<Img> getByPostId(int postId);

    //by 华荣晟

    /**
     * 获取寻宠信息所有图片
     * @param custId
     * @param petId
     * @return
     */
    List<Img> getFindPetImages(Integer custId,Integer petId);

    /**
     * 获取认领信息所有图片
     * @param custId
     * @param claimSpare
     * @return
     */
    List<Img> getClaimImages(Integer custId,String claimSpare);

    /**
     * 获取寄养信息所有图片
     * @param custId
     * @param petId
     * @return
     */
    List<Img> getFosterImages(Integer custId,Integer petId);

}
