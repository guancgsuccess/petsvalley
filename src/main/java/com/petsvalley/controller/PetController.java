package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Pet;
import com.petsvalley.service.PetService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
private PetService petService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Pet> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Pet> page=new PageModel<Pet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( petService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=petService.getPetByPage(page ,userId);
        System.out.println(page.getModelList());
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Pet> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Pet> page=new PageModel<Pet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( petService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=petService.getPetByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Pet> getPetByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return petService.deleteById(msgid);
    }
    @GetMapping("get/msgid/{msgid}")
    public Pet getById( @PathVariable Integer msgid){
        return petService.get(msgid);
    }
    @PostMapping("updatepet")
    public int updatePet(  Pet pet ){
        return petService.updatePet(pet);
    }
    @PostMapping("addpet")
    public int addPet(  Pet pet ,HttpServletRequest request){
        pet.setCustId( ((Customer)request.getSession().getAttribute( "customer" )).getCustId() );
        pet.setPetState( 0 );
        pet.setPetMateState( 0 );
        return petService.addPet(pet);
    }
    @GetMapping("getallbycustid")
    public List<Pet> getAllByCustid(HttpServletRequest request ){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        return petService.getAllByCustid(userId);
    }
    /*--------------------------------*/
    @GetMapping("getAllByPageManage")
    public PageModel<Pet> getAllByPageManage( Integer pagecode){
        PageModel<Pet> page=new PageModel<Pet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( petService.getCountManage());
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=petService.getPetByPageManage(page);
        return page;
    }

    @GetMapping("getAllByPagedateManage")
    public PageModel<Pet> getAllByPagedateManage( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        PageModel<Pet> page=new PageModel<Pet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( petService.getCountByDateManage(  to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=petService.getPetByPageDateManage(page ,to2,from2);
        return page;
    }

    @GetMapping("getAllByPageManage/page/{page}")
    public PageModel<Pet> getAllByPageManage2(@PathVariable Integer page){
        return getAllByPageManage( page);
    }
}
