package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Physicals;
import com.petsvalley.service.PhysicalService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/physical")
public class PhysicalController {
    @Autowired
private PhysicalService physicalService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Physicals> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Physicals> page=new PageModel<Physicals>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( physicalService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=physicalService.getPhysicalByPage(page ,userId);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Physicals> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Physicals> page=new PageModel<Physicals>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( physicalService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=physicalService.getPhysicalByPageDate(page ,userId,to2,from2);
        return page;
    }
    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Physicals> getPhysicalByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return physicalService.deleteById(msgid);
    }
    @PostMapping("insert")
    public int insert( Physicals physicals,HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        physicals.setPhyState( 0 );
        physicals.setPhySpare( userId+"" );
        return physicalService.insert(physicals);
    }

    /*--------------------------------*/
    @GetMapping("getAllByPageManage")
    public PageModel<Physicals> getAllByPageManage( Integer pagecode){
        PageModel<Physicals> page=new PageModel<Physicals>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( physicalService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=physicalService.getPhysicalsByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<Physicals> getAllByPagedateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<Physicals> page=new PageModel<Physicals>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( physicalService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=physicalService.getPhysicalsByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<Physicals> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }
}
