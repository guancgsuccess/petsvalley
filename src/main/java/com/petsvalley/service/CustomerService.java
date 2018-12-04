package com.petsvalley.service;

import com.petsvalley.entity.Customer;
import com.petsvalley.util.PageModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
@Mapper
public interface CustomerService {

    PageModel<Customer> getAllByPage( PageModel page );

    Customer loginByPhone( String phone );
    Customer loginByName( String name, String password );
    int save( Customer customer );
    int delete( Integer id );
    int update( Customer customer );
    Integer checkPhone( String phone );
    Customer queryById( Integer id );
    List<Customer> getAll( );

    PageModel<Customer> getCustomerByPage( PageModel<Customer> page );

    Integer getCount();

    Integer deleteById( Integer msgid );

    Integer getCountByDate(Date to, Date from1 );

    PageModel<Customer> getCustomerByPageDate( PageModel<Customer> page, Date to, Date from1 );

}