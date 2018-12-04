package com.petsvalley.service;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Service;
import com.petsvalley.util.PageModel;

import java.util.Date;
import java.util.List;

public interface ServiceService {

    //by 华荣晟

    /**
     * 通过page获取所有服务Service的PageModel和申请数
     * @param page
     * @return
     */
    List<Object> getByPage(Integer page);

    /**
     * 通过page和condition获取所有服务Service的PageModel和申请数
     * @param condition
     * @param page
     * @return
     */
    List<Object> getByCondition(String condition,Integer page);

    /**
     * 用户发起申请服务申请
     * @param customer
     * @param serviceId
     * @return
     */
    String applyService(Customer customer,Integer serviceId);

    //by 孟继升

    PageModel<Service> getServiceByPage(PageModel<Service> page, Integer userId );

    Integer getCount( Integer userId );

    Integer deleteById( Integer msgid );

    Integer getCountByDate(Integer userId, Date to, Date from1 );

    PageModel<Service> getServiceByPageDate( PageModel<Service> page, Integer userId, Date to, Date from1 );

    Integer getCountManage( );

    PageModel<Service> getServiceByPageManage( PageModel<Service> page );

    Integer getCountByDateManage( Date to2, Date from2 );

    PageModel<Service> getServiceByPageDateManage( PageModel<Service> page, Date to2, Date from2 );

    int insert( Service service );

    Service getById( Integer msgid );

}
