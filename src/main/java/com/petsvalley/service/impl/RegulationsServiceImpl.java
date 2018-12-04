package com.petsvalley.service.impl;

import com.petsvalley.entity.Regulations;
import com.petsvalley.entity.RegulationsExample;
import com.petsvalley.mapper.RegulationsMapper;
import com.petsvalley.service.RegulationsService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegulationsServiceImpl implements RegulationsService {
    @Autowired
    private RegulationsMapper regulationsMapper;
    @Override
    public List<Regulations> getAll(PageModel<Regulations> pageModel) {
        RegulationsExample example=new RegulationsExample();
        RegulationsExample.Criteria criteria=example.createCriteria();
        example.setLimit(pageModel.getPageSize());
        example.setOffset((long)pageModel.getStartRecord());
        criteria.andRegStateEqualTo(0);
        List<Regulations> regulationsList=regulationsMapper.selectByExample(example);
        return regulationsList;
    }

    @Override
    public int save(Regulations regulations) {
        int rows=regulationsMapper.insert(regulations);
        return rows;
    }

    @Override
    public int delete(Integer id) {
        RegulationsExample example=new RegulationsExample();
        RegulationsExample.Criteria criteria=example.createCriteria();
        criteria.andRegIdEqualTo(id);
        Regulations regulations=regulationsMapper.selectByPrimaryKey(id);
        regulations.setRegState(1);
        regulationsMapper.updateByExampleSelective(regulations,example);
        return 0;
    }

    @Override
    public int recordCount() {
        RegulationsExample example=new RegulationsExample();
        RegulationsExample.Criteria criteria=example.createCriteria();
        int count= (int)regulationsMapper.countByExample(null);
        return count;
    }

    @Override
    public Regulations getOne(Integer id) {
       Regulations regulations= regulationsMapper.selectByPrimaryKey(id);
        return regulations;
    }
}
