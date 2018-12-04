package com.petsvalley.service.impl;

import com.petsvalley.entity.Strategy;
import com.petsvalley.entity.StrategyExample;
import com.petsvalley.mapper.StrategyMapper;
import com.petsvalley.service.StrategyService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StrategyServiceImpl implements StrategyService {
    @Autowired
    private StrategyMapper strategyMapper;
    @Override
    public int save(Strategy strategy) {
        return strategyMapper.insert(strategy);
    }


    @Override
    public List<Strategy> getAll(PageModel<Strategy> pageModel) {
        StrategyExample example=new StrategyExample();
        StrategyExample.Criteria criteria=example.createCriteria();
        example.setLimit(pageModel.getPageSize());
        example.setOffset((long)pageModel.getStartRecord());
        criteria.andStraStateEqualTo(0);
        List<Strategy> strategies=strategyMapper.selectByExample(example);
        return strategies;
    }

    @Override
    public int delete(int id) {
        StrategyExample example=new StrategyExample();
        StrategyExample.Criteria criteria=example.createCriteria();
        criteria.andStraIdEqualTo(id);
       Strategy strategy= strategyMapper.selectByPrimaryKey(id);
       strategy.setStraState(1);
        return strategyMapper.updateByExampleSelective(strategy,example);
    }

    @Override
    public int recordCount() {
        StrategyExample example=new StrategyExample();
       int count=(int) strategyMapper.countByExample(null);
        return count;
    }

    @Override
    public Strategy getOne(Integer id) {
       Strategy strategy= strategyMapper.selectByPrimaryKey(id);
        return strategy;
    }
}
