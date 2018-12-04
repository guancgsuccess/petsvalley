package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.FindPet;
import com.petsvalley.entity.Img;
import com.petsvalley.entity.Pet;
import com.petsvalley.service.FindPetService;
import com.petsvalley.service.ImgService;
import com.petsvalley.service.PetService;
import com.petsvalley.service.SystemMessageService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/findPet")
public class FindPetController {

    //by 华荣晟

    @Autowired
    private FindPetService service;
    @Autowired
    private PetService petService;
    @Autowired
    private ImgService imgService;
    @Autowired
    private SystemMessageService systemMessageService;

    @GetMapping("getByPage")
    public PageModel<FindPet> getByPage(Integer page){
        return service.getByPage(page);
    }

    @GetMapping("getByPage/page/{page}")
    public PageModel<FindPet> getByPage2(@PathVariable Integer page){
        return getByPage(page);
    }

    @GetMapping("getByCondition/fpState/{fpState}/page/{page}")
    public PageModel<FindPet> getPetsByCondition(@PathVariable Integer fpState,@PathVariable Integer page){
        return service.getByCondition(fpState,page);
    }

    @RequestMapping("getMyFindPet")
    public List<FindPet> getMyFindPet(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        return service.getByCustId(customer.getCustId());
    }

    @GetMapping("getPetsByCustId")
    public List<Pet> getPetsByCustId(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        return petService.getPetsByCustId(customer.getCustId());
    }

    @PostMapping("releaseFindPet")
    public String releaseFindPet(FindPet findPet,HttpServletRequest request,@RequestParam("files") MultipartFile[] files) throws ParseException {

        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String lostTimeStr = request.getParameter("lostTimeStr");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date lostTime = sdf.parse(lostTimeStr);
        findPet.setLostTime(lostTime);
        findPet.setFdSpare(customer.getCustId().toString());
        String path = request.getSession().getServletContext().getRealPath("/upload");

        return service.releaseFindPet(findPet,customer,files,path);
    }

    @GetMapping("findPetInfo")
    public Map<Integer,Object> findPetInfo(HttpServletRequest request){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String fpIdStr = request.getParameter("fpId");
        Integer fpId = null;
        if(fpIdStr!=null)
            fpId = Integer.parseInt(fpIdStr);
        //获取寻宠信息，宠物信息，寻宠图片
        FindPet findPet = service.getFindPetByFpId(fpId);
        Pet pet = petService.getPetByPetId(findPet.getPetId());
        List<Img> imgList = imgService.getFindPetImages(pet.getCustId(),pet.getPetId());

        //封装到Map中
        Map<Integer,Object> map = new HashMap<>();
        map.put(0,findPet);
        map.put(1,pet);
        map.put(2,imgList);
        //判断寻宠信息是否是自己发布
        Integer isMyFindPet = 0;
        if(customer!=null){
            if(Integer.parseInt(findPet.getFdSpare())==customer.getCustId())
                isMyFindPet = 1;
        }
        map.put(3,isMyFindPet);
        return map;
    }

    @RequestMapping("contact")
    public String contact(String content,String phone,Integer petId){
        Pet pet = petService.getPetByPetId(petId);
        return systemMessageService.saveFindPetContactMessage(content,phone,pet);
    }

    @RequestMapping("updateFindPet")
    public String updateFindPet(FindPet findPet,HttpServletRequest request,@RequestParam("files") MultipartFile[] files){
        Customer customer = (Customer)request.getSession().getAttribute("customer");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        return service.setFindPet(customer,findPet,path,files);
    }

    //by 孟继升
    @Autowired
    private FindPetService findPetService;
    /**
     * 分页
     * @param pagecode
     * @return
     */
    @GetMapping("getAllByPage")
    public PageModel<FindPet> getByPage( Integer pagecode, HttpServletRequest request){
        Customer customer =(Customer ) request.getSession().getAttribute( "customer" );
        Integer userId=customer.getCustId();
        PageModel<FindPet> page=new PageModel<FindPet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( findPetService.getCount( userId) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=findPetService.getFindPetByPage(page ,userId);
        return page;
    }
    @GetMapping("getAllByPagedate")
    public PageModel<FindPet> getByPageDate( String from1, String to,Integer pagecode, HttpServletRequest request){
        Date from2=java.sql.Date.valueOf(  from1) ,to2=java.sql.Date.valueOf(  to);
        System.out.println(from2+""+to2+"" );
        Customer customer =(Customer) request.getSession().getAttribute("customer");
        Integer userId=customer.getCustId();
        PageModel<FindPet> page=new PageModel<FindPet>();
        if(pagecode==null){
            //首页
            page.setCurrentPageCode( 1 );
        }else {
            page.setCurrentPageCode( pagecode );
        }
        page.setTotalRecord( findPetService.getCountByDate( userId, to2, from2) );
        page.setTotalPages( page.getTotalRecord()%page.getPageSize()==0?page.getTotalRecord()/page.getPageSize():page.getTotalRecord()/page.getPageSize()+1 );
        page.setStartRecord( (page.getCurrentPageCode()-1)*page.getPageSize() );
        page=findPetService.getFindPetByPageDate(page ,userId,to2,from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<FindPet> getFindPetByPage2(@PathVariable Integer page,HttpServletRequest request){
        return getByPage( page ,request);
    }
    @GetMapping("delete/msgid/{msgid}")
    public int deleteById( @PathVariable Integer msgid){
        System.out.println(msgid );
        return findPetService.deleteById(msgid);
    }
}
