package com.petsvalley.service.impl;

import com.petsvalley.entity.*;
import com.petsvalley.mapper.CustomerMapper;
import com.petsvalley.mapper.SystemMessageMapper;
import com.petsvalley.service.CustomerService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;
    @Autowired
    private SystemMessageMapper messageMapper;

    @Override
    public Integer checkPhone( String phone ) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustPhoneEqualTo( phone );
        Integer con=(Integer.parseInt(  (mapper.countByExample( example )+"").trim() ) );
        return con;
    }

    public Customer loginByPhone( String phone ) {
        List<Customer> list=new ArrayList<Customer>(  );
        CustomerExample customerExample=new CustomerExample();
        CustomerExample.Criteria criteria=customerExample.createCriteria();
        criteria.andCustPhoneEqualTo( phone );
        criteria.andCustStateEqualTo( 0 );
        list= (  List<Customer>  ) mapper.selectByExample( customerExample );
        if(list.size()>0) {
            Customer customer = list.get( 0 );
            return customer;
        }
        else {
            return null;
        }
    }

    public Customer loginByName( String name, String password ) {
        List<Customer> list=new ArrayList<Customer>(  );
        CustomerExample customerExample=new CustomerExample();
        CustomerExample.Criteria criteria=customerExample.createCriteria();
        criteria.andCustNameEqualTo( name );
        criteria.andCustPwdEqualTo( password );
        criteria.andCustStateEqualTo( 0 );
        list= (  List<Customer>  ) mapper.selectByExample( customerExample );
        if(list.size()>0) {
            Customer customer = list.get( 0 );
            return customer;
        }
        else {
            return null;
        }
    }

    @Override
    public PageModel<Customer> getAllByPage( PageModel page ) {
      /* SqlSession session =MybatisUtil.getSession();
       CustomerMapper mapper=session.getMapper( CustomerMapper.class );*/
        CustomerExample customerExample=new CustomerExample();
        CustomerExample.Criteria criteria=customerExample.createCriteria();
        customerExample.setLimit( page.getPageSize() );
        customerExample.setOffset( (long)page.getStartRecord() );
        List<Customer> customerList=mapper.selectByExample( customerExample );
        System.out.println(customerList );
        page.setModelList( customerList );
        // MybatisUtil.closeSession();
        return page;
    }

    @Override
    public int save( Customer customer ) {
        SystemMessage message=new SystemMessage();
        message.setSystemMessageTitle( "欢迎你" );
        message.setSystemMessageContent("欢迎加入爱宠行列,我们会虔诚为您服务" );
        message.setSystemMessageTime( new Date(  ) );
        message.setSystemMessageStatue( 0 );
        message.setSystemMessageSpare( customer.getCustId()+"" );
        messageMapper.insert( message );
        SystemMessage message1=new SystemMessage();
        message1.setSystemMessageTitle( "社区规定" );
        message1.setSystemMessageContent("这里有一些管理规定,请你务必详细了解" );
        message1.setSystemMessageTime( new Date(  ) );
        message1.setSystemMessageStatue( 0 );
        message1.setSystemMessageSpare( customer.getCustId()+"" );
        messageMapper.insert( message1 );
        return mapper.insert( customer );
    }
    @Override
    public int delete( Integer id ) {
        return mapper.deleteByPrimaryKey( id );
    }
    @Override
    public int update( Customer customer) {
        if(customer.getCustName()=="")
            customer.setCustName( null );
        if(customer.getCustPwd()=="")
            customer.setCustPwd( null );
        if(customer.getCustEmail()=="")
            customer.setCustEmail( null );
        if(customer.getCustPhone()=="")
            customer.setCustPhone( null );
        if(customer.getHeadPhoto()=="")
            customer.setHeadPhoto( null);
        System.out.println(customer );
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( customer.getCustId());
        return mapper.updateByExampleSelective(customer, example );
    }
    @Override
    public Customer queryById( Integer id ) {
        return mapper.selectByPrimaryKey( id );
    }

    @Override
    public List<Customer> getAll( ) {
        return mapper.selectByExample( null );
    }

    @Override
    public PageModel<Customer> getCustomerByPage( PageModel<Customer> page ) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustStateEqualTo( 0 );
        example.setOrderByClause( "cust_create_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( mapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCount( ) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustStateEqualTo( 0 );
        return  (int ) mapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Customer customer=new Customer();
        customer.setCustId( msgid );
        customer.setCustState( 1 );
        return mapper.updateByPrimaryKeySelective( customer );
    }

    @Override
    public Integer getCountByDate( Date to, Date from1 ) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustCreateTimeBetween( from1,to );
        criteria.andCustStateEqualTo( 0 );
        return  (int ) mapper.countByExample( example );
    }

    @Override
    public PageModel<Customer> getCustomerByPageDate( PageModel<Customer> page, Date to, Date from1 ) {
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andCustStateEqualTo( 0 );
        criteria.andCustCreateTimeBetween( from1,to );
        example.setOrderByClause( "cust_create_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( mapper.selectByExample( example));
        return page;
    }
}
