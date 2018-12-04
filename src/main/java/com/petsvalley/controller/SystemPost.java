package com.petsvalley.controller;

import com.petsvalley.entity.Regulations;
import com.petsvalley.entity.Strategy;
import com.petsvalley.service.RegulationsService;
import com.petsvalley.service.StrategyService;
import com.petsvalley.service.impl.RegulationsServiceImpl;
import com.petsvalley.service.impl.StrategyServiceImpl;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/SystemPost")
public class SystemPost {
    @Autowired
    private StrategyService strategyService;
    @Autowired
    private RegulationsService regulationsService;

    @RequestMapping("/regulations")
    public PageModel<Regulations> getAll(PageModel<Regulations> pageModel,int page){
        pageModel.setPageSize(6);
        pageModel.setCurrentPageCode(page);
        pageModel.setStartRecord((page-1)*pageModel.getPageSize());
        pageModel.setTotalRecord(regulationsService.recordCount());
        pageModel.setTotalPages(pageModel.getTotalRecord()%pageModel.getPageSize()==0 ? pageModel.getTotalRecord()/pageModel.getPageSize():pageModel.getTotalRecord()/pageModel.getPageSize()+1);
        pageModel.setEndRecord(pageModel.getCurrentPageCode()*pageModel.getPageSize()-1);
        List<Regulations> regulationsList= regulationsService.getAll(pageModel);
        pageModel.setModelList(regulationsList);
        return pageModel;
    }

    @RequestMapping("/strategy")
    public PageModel<Strategy> getAllStrategy(PageModel<Strategy> pageModel,int page){
        pageModel.setPageSize(6);
        pageModel.setCurrentPageCode(page);
        pageModel.setStartRecord((page-1)*pageModel.getPageSize());
        pageModel.setTotalRecord(strategyService.recordCount());
        pageModel.setTotalPages(pageModel.getTotalRecord()%pageModel.getPageSize()==0 ? pageModel.getTotalRecord()/pageModel.getPageSize():pageModel.getTotalRecord()/pageModel.getPageSize()+1);
        pageModel.setEndRecord(pageModel.getCurrentPageCode()*pageModel.getPageSize()-1);
        List<Strategy> strategyList= strategyService.getAll(pageModel);
        pageModel.setModelList(strategyList);
        return pageModel;
    }

    @RequestMapping("/delete")
    public String updateRegulations(int id){
       int rows= regulationsService.delete(id);
       if (rows>=1){
           return "删除成功";
       }
        return "删除失败";
    }

    @RequestMapping("/update")
    public String updateStrategy(int id){
        int rows=strategyService.delete(id);
        if (rows>=1){
            return "删除成功";
        }
        return "删除失败";
    }

    @RequestMapping("/saveStrategy")
    public String save1(String content,String title){
        Strategy strategy=new Strategy();
        strategy.setStraMessage(content);
        strategy.setStraTime(new Date());
        strategy.setStraTitle(title);
        strategy.setStraState(0);
        int rows=  strategyService.save(strategy);
        if (rows>=1){
            return "发表成功";
        }
        return "发表失败";
    }

    @RequestMapping("/saveRegulations")
    public String save2(String content, String title){
        Regulations regulations=new Regulations();
        regulations.setPunContent(content);
        regulations.setRegContent(content);
        regulations.setRegTitle(title);
        regulations.setRegDepartment("社区宠物管理处");
        regulations.setRegState(0);
        int rows= regulationsService.save(regulations);
        if (rows>=1){
            return "发表成功";
        }
        return "发表失败";
    }

    @RequestMapping("getOne")
    public Object getOne(Integer id,Integer type){
        if (type==1){
          Regulations regulations=  regulationsService.getOne(id);
          return regulations;
        }
        else if(type==2){
           Strategy strategy= strategyService.getOne(id);
           return strategy;
        }
        return null;
    }
}
