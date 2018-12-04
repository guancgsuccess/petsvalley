package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.service.CustomerService;
import com.petsvalley.service.MessageService;
import com.petsvalley.util.EncryptUtil;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.SendTelMsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private MessageService messageService;

    @PostMapping("fileUpload")
    public String fileUpload(MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return "false";
        }
        //随机生成文件名,避免重复
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        // String path = System.getProperty("user.dir") + "/upload" ;
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File dest = new File(path + "/" + fileName);
        if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "/upload/"+fileName;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

    @PostMapping("update")
    public String update(Customer customer, HttpServletRequest request) {
        if(customer.getCustPwd(  ).equals( "null" ))
            customer.setCustPwd( null );
        Integer row = customerService.update(customer);
        select(customer.getCustId(), request);
        if(row == 1)
            return "修改成功";
        else
            return "修改失败，请重试";
    }

    @GetMapping("selectbyId/{id}")
    public Customer select(Integer id, HttpServletRequest request) {
        Customer customer = customerService.queryById(id);
        customer.setCustSpare(messageService.getCount(customer.getCustId() + "") + "");
        request.getSession().setAttribute("customer", customer);
        System.out.println(customer);
        return customer;
    }

    @GetMapping("getById/msgid/{msgid}")
    public Customer getById(@PathVariable Integer msgid) {
        Customer customer = customerService.queryById(msgid);
        return customer;
    }

    @PostMapping("regist")
    public Integer insert(Customer customer) {
        System.out.println(customer);
        System.out.println(customer.getCustAge());
        customer.setCustSpare(0 + "");
        return customerService.save(customer);
    }

    @PostMapping("login")
    public String login(String custName, String custPwd, String input, Boolean flag, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(custName + custPwd + input);
        request.getSession().removeAttribute("errormsg");
        if (Pattern.matches("^[1][3,4,5,8][0-9]{9}$", custName)) {
            String checkcode = (String) request.getSession().getAttribute("checkcode");
            if (!checkcode.equals(custPwd)) {
                request.getSession().setAttribute("errormsg", "验证码不正确");
                return null;
            }
            Customer customer = customerService.loginByPhone(custName);
            if (customer != null) {
                customer.setCustSpare(messageService.getCount(customer.getCustId() + "") + "");
                request.getSession().setAttribute("customer", customer);
                if(customer.getCustRole()==1)
                    return "system";
                else
                    return null;
            } else {
                request.getSession().setAttribute("errormsg", "手机号未注册");
                return null;
            }
        } else if (!input.equals(request.getSession().getAttribute("rand"))) {
            request.getSession().setAttribute("errormsg", "验证码不正确");
            return null;
        } else {
            Customer customer = customerService.loginByName(custName, custPwd);
            if (customer != null) {
                if (flag) {
                    Cookie cookie = new Cookie("cookie_name", custName);
                    cookie.setPath("/");
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(cookie);
                    Cookie cookie1 = new Cookie("cookie_pwd", EncryptUtil.aesDecrypt( custPwd ,"o7H8uIM2O5qv65l2"));
                    cookie1.setMaxAge(60 * 60 * 24 * 30);
                    cookie1.setPath("/");
                    response.addCookie(cookie1);
                    System.out.println("cookie记住用户名和密码");
                }
                customer.setCustSpare(messageService.getCount(customer.getCustId() + "") + "");
                request.getSession().setAttribute("customer", customer);
                if(customer.getCustRole()==1)
                    return "system";
                else
                    return "index";
            } else {
                request.getSession().setAttribute("errormsg", "用户名或密码错误");
                return null;
            }
        }
    }

    @GetMapping("showCustomerListInExl")
    public String showCustomerListInExl(ModelMap mm) {
        List<Customer> list = customerService.getAll();
        if (list != null) {
            mm.addAttribute("customerList", list);
        } else {
            mm.addAttribute("errormsg", "暂无数据");
        }
        return "CustomerListExlView";
    }

    @PostMapping("upload")
    public String upload(List<MultipartFile> files) throws Exception {
        if (!files.isEmpty()) {
            for (MultipartFile file : files
                    ) {
                file.transferTo(new File("D:/temp/" + file.getOriginalFilename()));
            }
            return "jstl";
        } else {
            return "jstl";
        }
    }


    @PostMapping("checkPhone")
    public void checkPhone(String phone, HttpServletResponse response) {
        Integer con = customerService.checkPhone(phone);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (con > 0) {
            out.write("0");
        } else {
            out.write("1");
        }
        out.flush();
        out.close();
        System.out.println("检查电话" + phone + "数量" + con);
    }

    @GetMapping("selectAll")
    public List<Customer> selectAll() {
        List<Customer> customers = customerService.getAll();
        return customers;
    }

    @GetMapping("getAllByPage")
    public PageModel<Customer> getByPage(Integer pagecode, HttpServletRequest request) {
        PageModel<Customer> page = new PageModel<Customer>();
        if (pagecode == null) {
            //首页
            page.setCurrentPageCode(1);
        } else {
            page.setCurrentPageCode(pagecode);
        }
        page.setTotalRecord(customerService.getCount());
        page.setTotalPages(page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1);
        page.setStartRecord((page.getCurrentPageCode() - 1) * page.getPageSize());
        page = customerService.getCustomerByPage(page);
        return page;
    }

    @GetMapping("getAllByPagedate")
    public PageModel<Customer> getByPageDate(String from1, String to, Integer pagecode, HttpServletRequest request) {
        Date from2 = java.sql.Date.valueOf(from1), to2 = java.sql.Date.valueOf(to);
        System.out.println(from2 + "" + to2 + "");
        Customer customer = (Customer) request.getSession().getAttribute("customer");
        Integer userId = customer.getCustId();
        PageModel<Customer> page = new PageModel<Customer>();
        if (pagecode == null) {
            //首页
            page.setCurrentPageCode(1);
        } else {
            page.setCurrentPageCode(pagecode);
        }

        page.setTotalRecord(customerService.getCountByDate(to2, from2));
        page.setTotalPages(page.getTotalRecord() % page.getPageSize() == 0 ? page.getTotalRecord() / page.getPageSize() : page.getTotalRecord() / page.getPageSize() + 1);
        page.setStartRecord((page.getCurrentPageCode() - 1) * page.getPageSize());
        page = customerService.getCustomerByPageDate(page, to2, from2);
        return page;
    }

    @GetMapping("getAllByPage/page/{page}")
    public PageModel<Customer> getCustomerByPage2(@PathVariable Integer page, HttpServletRequest request) {
        return getByPage(page, request);
    }

    @GetMapping("delete/msgid/{msgid}")
    public int deleteById(@PathVariable Integer msgid) {
        System.out.println(msgid);
        return customerService.deleteById(msgid);
    }

    @GetMapping("sendSms/phone/{phone}")
    public int sendSms(@PathVariable String phone, HttpServletRequest request) {
        SendTelMsgUtils.sendMsgTo(phone, request);
        return 0;
    }

    @GetMapping("getCheckCode")
    public String getCheckCode(HttpServletRequest request) {
        System.out.println((String) request.getSession().getAttribute("checkcode"));
        return (String) request.getSession().getAttribute("checkcode");
    }

}
