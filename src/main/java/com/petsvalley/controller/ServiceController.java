package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import com.petsvalley.entity.Service;
import com.petsvalley.util.PageModel;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/service")
public class ServiceController {

    //by 华荣晟

    @Autowired
    private ServiceService service;

    @GetMapping("getByPage/page/{page}")
    public List<Object> getByPage(@PathVariable Integer page){
        return service.getByPage(page);
    }

    @GetMapping("getByCondition/condition/{condition}/page/{page}")
    public List<Object> getByCondition(@PathVariable String condition,@PathVariable Integer page){
        return service.getByCondition(condition,page);
    }

    @RequestMapping("applyService/serviceId/{serviceId}")
    public String applyService(HttpServletRequest request, @PathVariable Integer serviceId) {
        Customer customer = (Customer) request.getSession().getAttribute("customer");
        return service.applyService(customer, serviceId);
    }

    //by 孟继升

    @Autowired
    private ServiceService serviceService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Service> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Service> page=new PageModel<Service>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( serviceService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=serviceService.getServiceByPage(page ,userId);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Service> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Service> page=new PageModel<Service>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( serviceService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=serviceService.getServiceByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Service> getServiceByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return serviceService.deleteById(msgid);
    }
    @GetMapping("getById/msgid/{msgid}")
    public Service getById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return serviceService.getById(msgid);
    }
    @PostMapping("insert")
    public int insert( Service service){
       service.setServiceSpare( 0+"" );
       service.setServiceState( 0 );
       service.setServiceTime(new Date(  ));
        return serviceService.insert(service);
    }


    /*--------------------------------*/
    @GetMapping("getAllByPageManage")
    public PageModel<Service> getAllByPageManage( Integer pagecode){
        PageModel<Service> page=new PageModel<Service>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( serviceService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=serviceService.getServiceByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<Service> getAllByPagedateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<Service> page=new PageModel<Service>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( serviceService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=serviceService.getServiceByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<Service> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }
}
