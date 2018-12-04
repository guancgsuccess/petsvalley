package com.petsvalley.controller;

import com.petsvalley.entity.Appeal;
import com.petsvalley.entity.Customer;
import com.petsvalley.service.AppealService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/appeal")
public class AppealController {
    @Autowired
private AppealService appealService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Appeal> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Appeal> page=new PageModel<Appeal>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( appealService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=appealService.getAppealByPage(page ,userId);
        return page;
    }
    @GetMapping("getAllByPagedate")
    public PageModel<Appeal> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Appeal> page=new PageModel<Appeal>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( appealService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=appealService.getAppealByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Appeal> getAppealByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return appealService.deleteById(msgid);
    }
    @PostMapping("insert")
    public String insert(Appeal appeal){
      appeal.setAplTime( new Date(  ) );
      appeal.setAplResult( "待受理" );
      appeal.setAplState(0);
      appealService.insert( appeal );
        System.out.println(appeal );
        return null;
    }
    /*---------------------------------------------------------------------------------*/

    @GetMapping("refuse/msgid/{msgid}")
    public int refuse( @PathVariable Integer msgid,HttpServletRequest request){
        int userid=((Customer)request.getSession().getAttribute( "customer" )).getCustId();
        return appealService.refuseUpdate(msgid,userid);
    }
    @GetMapping("accept/msgid/{msgid}")
    public int accept( @PathVariable Integer msgid,HttpServletRequest request){
        int userid=((Customer)request.getSession().getAttribute( "customer" )).getCustId();
        return appealService.acceptUpdate(msgid,userid);
    }



    @GetMapping("getAllByPageManage")
    public PageModel<Appeal> getAllByPageManage( Integer pagecode){
        PageModel<Appeal> page=new PageModel<Appeal>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( appealService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=appealService.getAppealByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<Appeal> getAllByPageDateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<Appeal> page=new PageModel<Appeal>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( appealService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=appealService.getAppealByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<Appeal> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }
}
