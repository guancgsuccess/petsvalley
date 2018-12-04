package com.petsvalley.service;

import com.petsvalley.entity.Strategy;
import com.petsvalley.util.PageModel;

import java.util.List;

public interface StrategyService {
    public int save(Strategy strategy);

    public List<Strategy> getAll(PageModel<Strategy> pageModel);

    public int delete(int id);

    public int recordCount();

    public Strategy getOne(Integer id);
}
