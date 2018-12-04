package com.petsvalley.controller;

import com.petsvalley.entity.Macth;
import com.petsvalley.entity.Customer;
import com.petsvalley.service.MatchService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
private MatchService matchService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Macth> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Macth> page=new PageModel<Macth>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( matchService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=matchService.getMatchByPage(page ,userId);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Macth> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Macth> page=new PageModel<Macth>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( matchService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=matchService.getMatchByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Macth> getMatchByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return matchService.deleteById(msgid);
    }
}
