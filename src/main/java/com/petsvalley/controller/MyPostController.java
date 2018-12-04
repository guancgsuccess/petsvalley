package com.petsvalley.controller;

import com.petsvalley.entity.Post;
import com.petsvalley.entity.Customer;
import com.petsvalley.service.MyPostService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/mypost")
public class MyPostController {
    @Autowired
private MyPostService myPostService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Post> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Post> page=new PageModel<Post>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( myPostService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=myPostService.getMyPostByPage(page ,userId);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Post> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Post> page=new PageModel<Post>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( myPostService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=myPostService.getMyPostByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Post> getMyPostByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deletebyid( @PathVariable Integer msgid){
        System.out.println(msgid );
        return myPostService.deleteById(msgid);
    }
/*----------------------------------------------*/
    @GetMapping("getAllByPageManage")
    public PageModel<Post> getAllByPageManage( Integer pagecode){
        PageModel<Post> page=new PageModel<Post>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( myPostService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=myPostService.getPostByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<Post> getAllByPageDateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<Post> page=new PageModel<Post>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( myPostService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=myPostService.getPostByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<Post> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }
}
