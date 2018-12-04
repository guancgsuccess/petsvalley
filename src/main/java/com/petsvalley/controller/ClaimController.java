package com.petsvalley.controller;

import com.petsvalley.entity.Claim;
import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;
import com.petsvalley.service.ClaimService;
import com.petsvalley.service.ImgService;
import com.petsvalley.service.SystemMessageService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private ClaimService service;
    @Autowired
    private ImgService imgService;
    @Autowired
    private SystemMessageService systemMessageService;

    @GetMapping("getClaimList/claimState/{claimState}/page/{page}")
    public PageModel<Claim> getClaimList(@PathVariable Integer claimState, @PathVariable Integer page){
        return service.getClaimList(page,claimState);
    }

    @RequestMapping("getClaimList/page/{page}")
    public PageModel<Claim> getClaimList(@PathVariable Integer page){
        return getClaimList(null,page);
    }

    @GetMapping("claimInfo")
    public Map<Integer,Object> claimInfo(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String claimIdStr = request.getParameter("claimId");
        Integer claimId = null;
        if(claimIdStr!=null)
            claimId = Integer.parseInt(claimIdStr);
        Claim claim = service.getClaimById(claimId);
        List<Img> imgList = imgService.getClaimImages(claim.getCustId(),claim.getClaimSpare());
        Map<Integer,Object> map = new HashMap<>();
        map.put(0,claim);
        map.put(1,imgList);
        Integer isMyClaim = 0;
        if(customer!=null){
            if(claim.getCustId()==customer.getCustId())
                isMyClaim = 1;
        }
        map.put(2,isMyClaim);
        return map;
    }

    @RequestMapping("contact")
    public String contact(String content,String phone,Integer claimId){
        Claim claim = service.getClaimById(claimId);
        return systemMessageService.saveClaimPetContactMessage(content,phone,claim.getCustId());
    }

    @RequestMapping("getMyClaim")
    public List<Claim> getMyClaim(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        List<Claim> claimList = service.getClaimByCustId(customer.getCustId());
        return claimList;
    }


    @RequestMapping("releaseClaim")
    public String releaseClaim(Claim claim,HttpServletRequest request,@RequestParam("files") MultipartFile[] files){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        String claimTimeStr = request.getParameter("claimTimeStr");
        return service.releaseClaim(customer,claim,claimTimeStr,path,files);
    }

    @RequestMapping("updateClaim")
    public String updateClaim(Claim claim,HttpServletRequest request,@RequestParam("files") MultipartFile[] files){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        return service.setClaim(customer,claim,path,files);
    }

    @RequestMapping("distinguish")
    public List<Claim> distinguish(HttpServletRequest request,@RequestParam("files") MultipartFile[] files){

        String path = request.getSession().getServletContext().getRealPath("/upload");
        return service.distinguishPhoto(path,files);
    }

    @Autowired
    private ClaimService claimService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<Claim> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<Claim> page=new PageModel<Claim>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( claimService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=claimService.getClaimByPage(page ,userId);
        return page;
    }
    @GetMapping("getAllByPagedate")
    public PageModel<Claim> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<Claim> page=new PageModel<Claim>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( claimService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=claimService.getClaimByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Claim> getClaimByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return claimService.deleteById(msgid);
    }
}
