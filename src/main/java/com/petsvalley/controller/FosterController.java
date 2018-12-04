package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Foster;
import com.petsvalley.entity.Img;
import com.petsvalley.entity.Pet;
import com.petsvalley.service.FosterService;
import com.petsvalley.service.ImgService;
import com.petsvalley.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.petsvalley.util.PageModel;;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@RestController
@RequestMapping("/foster")
public class FosterController {

    @Autowired
    private FosterService service;
    @Autowired
    private PetService petService;
    @Autowired
    private ImgService imgService;

    @RequestMapping("getFosterList/condition/{condition}/petDisc/{petDisc}/page/{page}")
    public Map<Integer,Object> getFosterList(@PathVariable String condition, @PathVariable Integer page, @PathVariable String petDisc) {
        return service.getFosterList(condition,page,petDisc);
    }

    @RequestMapping("getFosterList")
    public Map<Integer,Object> getFosterList(){
        return getFosterList(null,null,null);
    }

    @RequestMapping("fosterInfo")
    public Map<Integer,Object> fosterInfo(HttpServletRequest request){
        String fosterIdStr = request.getParameter("fosterId");
        Integer fosterId = null;
        if(fosterIdStr!=null)
            fosterId = Integer.parseInt(fosterIdStr);
        Foster foster = service.getFosterByFosterId(fosterId);
        Pet pet = petService.getPetByPetId(foster.getFosterPetId());
        List<Img> imgList = imgService.getFosterImages(pet.getCustId(),pet.getPetId());
        Map<Integer,Object> map = new HashMap<>();
        map.put(0,foster);
        map.put(1,pet);
        map.put(2,imgList);
        return map;
    }

    @RequestMapping("apply")
    public String apply(Integer fosterId,String applyReason,HttpServletRequest request){

        Customer customer = (Customer) request.getSession().getAttribute("customer");
        return service.saveFosterApply(customer,fosterId,applyReason);
    }

    @RequestMapping("releaseFoster")
    public String releaseFoster(Foster foster,HttpServletRequest request, @RequestParam("files") MultipartFile[] files){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        return service.saveFoster(customer,foster,path,files);
    }

    @RequestMapping("getPetsByCustId")
    public List<Pet> getPetsByCustId(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        return petService.getPetsByCustId(customer.getCustId());
    }

    //by 孟继升

    @Autowired
    private FosterService fosterService;

    /**
     * 分页
     *
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Foster> getByPage( Integer pagecode, HttpServletRequest request ) {
        Customer customer = ( Customer ) request.getSession( ).getAttribute( "customer" );
        Integer userId = customer.getCustId( );
        PageModel<Foster> page = new PageModel<Foster>( );
        if( pagecode == null ) {
            //首页
            page.setCurrentPageCode( 1 );
        } else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( fosterService.getCount( userId ) );
        page.setTotalPages( page.getTotalRecord( ) % page.getPageSize( ) == 0 ? page.getTotalRecord( ) / page.getPageSize( ) : page.getTotalRecord( ) / page.getPageSize( ) + 1 );
        page.setStartRecord( ( page.getCurrentPageCode( ) - 1 ) * page.getPageSize( ) );
        page = fosterService.getFosterByPage( page, userId );
        return page;
    }
    @GetMapping("getById/msgid/{msgid}")
    public Foster getById(@PathVariable Integer msgid){
        Foster foster=fosterService.queryById( msgid );
        return foster;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Foster> getByPageDate( String from1, String to, Integer pagecode, HttpServletRequest request ) {
        Date from2 = java.sql.Date.valueOf( from1 ), to2 = java.sql.Date.valueOf( to );
        System.out.println( from2 + "" + to2 + "" );
        Customer customer = ( Customer ) request.getSession( ).getAttribute( "customer" );
        Integer userId = customer.getCustId( );
        PageModel<Foster> page = new PageModel<Foster>( );
        if( pagecode == null ) {
            //首页
            page.setCurrentPageCode( 1 );
        } else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( fosterService.getCountByDate( userId, to2, from2 ) );
        page.setTotalPages( page.getTotalRecord( ) % page.getPageSize( ) == 0 ? page.getTotalRecord( ) / page.getPageSize( ) : page.getTotalRecord( ) / page.getPageSize( ) + 1 );
        page.setStartRecord( ( page.getCurrentPageCode( ) - 1 ) * page.getPageSize( ) );
        page = fosterService.getFosterByPageDate( page, userId, to2, from2 );
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Foster> getFosterByPage2( @PathVariable Integer page, HttpServletRequest request ) {
        return getByPage( page, request );
    }

    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid ) {
        System.out.println( msgid );
        return fosterService.deleteById( msgid );
    }

}
