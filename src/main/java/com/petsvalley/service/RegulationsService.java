package com.petsvalley.service;

import com.petsvalley.entity.Regulations;
import com.petsvalley.util.PageModel;

import java.util.List;

public interface RegulationsService {
    //查询所有
    public List<Regulations> getAll(PageModel<Regulations> pageModel);

    //发表新帖
    public int save(Regulations regulations);

    //删除帖子
    public int delete(Integer id);

    //总记录数
    public int recordCount();

    public Regulations getOne(Integer id);
}
