package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.SystemMessage;
import com.petsvalley.service.MessageService;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.SendMailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/message")
public class SystemMassageController {
    @Autowired
private MessageService messageService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<SystemMessage> getByPage( Integer pagecode,  HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        String userId=customer.getCustId()+"";
        PageModel<SystemMessage> page=new PageModel<SystemMessage>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( messageService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=messageService.getMessageByPage(page ,userId);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<SystemMessage> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        String userId=customer.getCustId()+"";
        PageModel<SystemMessage> page=new PageModel<SystemMessage>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( messageService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=messageService.getMessageByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<SystemMessage> getMessageByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid,HttpServletRequest request){
        flushCount( request );
     if(messageService.deleteById(msgid)>0){
        return 1;
     }
        return 0;
    }
    @GetMapping("get")
    public void flushCount(HttpServletRequest request){
            Customer customer =(Customer) request.getSession().getAttribute("customer");
            customer.setCustSpare(((Integer.parseInt(customer.getCustSpare())-1)+"").trim() );
            request.getSession().setAttribute( "customer",customer );
    }
    @PostMapping("insert")
    public int insert(SystemMessage message){
        message.setSystemMessageTime( new Date(  ) );
        message.setSystemMessageStatue( 0 );
        return messageService.insert(message);
    }
    @GetMapping("sendemail/{title}/{address}/{message}")
    public int sendEmail(@PathVariable String title,@PathVariable String address,@PathVariable String message){
        String[] ss={address};
        JavaMailSenderImpl sender =SendMailUtils.initJavaMailSender();
        try {
            SendMailUtils.sendTextWithHtml(sender ,ss,title,message );
        } catch (Exception e) {
            e.printStackTrace( );
        }
        return 0;
    }
    /*--------------------------------*/
    @GetMapping("getAllByPageManage")
    public PageModel<SystemMessage> getAllByPageManage( Integer pagecode){
        PageModel<SystemMessage> page=new PageModel<SystemMessage>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( messageService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=messageService.getSystemMessageByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<SystemMessage> getAllByPageDateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<SystemMessage> page=new PageModel<SystemMessage>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( messageService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=messageService.getSystemMessageByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<SystemMessage> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }


}
