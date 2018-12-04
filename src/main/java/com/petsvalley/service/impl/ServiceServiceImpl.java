package com.petsvalley.service.impl;

import com.petsvalley.entity.Apply;
import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Service;
import com.petsvalley.mapper.ApplyMapper;

import com.petsvalley.entity.ServiceExample;
import com.petsvalley.mapper.ServiceMapper;
import com.petsvalley.service.ServiceService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    //by 华荣晟

    @Autowired
    private ServiceMapper mapper;
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Object> getByPage(Integer page) {
        PageModel<Service> pageModel = new PageModel<>();
        if(page == null)
            page=1;
        pageModel.setCurrentPageCode(page);
        pageModel.setTotalRecord(mapper.selectCount());
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());
        List<Service> serviceList = mapper.selectByPage(pageModel);
        Map<Integer,Integer> mapApplyCount = new HashMap<>();
        for(Service service1:serviceList){
            mapApplyCount.put(service1.getServiceId(),applyMapper.selectCountByServiceId(service1.getServiceId()));
        }
        pageModel.setModelList(serviceList);
        List<Object> list = new ArrayList<>();
        list.add(mapApplyCount);
        list.add(pageModel);
        return list;
    }

    @Override
    public List<Object> getByCondition(String condition,Integer page) {
        PageModel<Service> pageModel = new PageModel<>();
        if(page == null)
            page=1;
        pageModel.setCurrentPageCode(page);
        pageModel.setTotalRecord(mapper.selectCount());
        pageModel.setTotalPages((pageModel.getTotalRecord()%pageModel.getPageSize())==0?(pageModel.getTotalRecord()/pageModel.getPageSize()):(pageModel.getTotalRecord()/pageModel.getPageSize() +1));
        pageModel.setStartRecord((pageModel.getCurrentPageCode()-1)*pageModel.getPageSize());

        List<Service> serviceList = null;

        if(condition.equals("rewardDesc"))
            serviceList = mapper.selectByRewardDesc(pageModel);
        if(condition.equals("rewardAsc"))
            serviceList = mapper.selectByRewardAsc(pageModel);
        if(condition.equals("timeDesc")) {
            serviceList = mapper.selectByTimeDesc(pageModel);
        }
        if(condition.equals("timeAsc"))
            serviceList = mapper.selectByTimeAsc(pageModel);
        if(condition.equals("noDesc"))
            serviceList = mapper.selectByNoDesc(pageModel);
        if(condition.equals("noAsc"))
            serviceList = mapper.selectByNoAsc(pageModel);

        Map<Integer,Integer> mapApplyCount = new HashMap<>();
        for(Service service1:serviceList){
            mapApplyCount.put(service1.getServiceId(),applyMapper.selectCountByServiceId(service1.getServiceId()));
        }
        pageModel.setModelList(serviceList);
        List<Object> list = new ArrayList<>();
        list.add(mapApplyCount);
        list.add(pageModel);
        return list;

    }

    @Override
    public String applyService(Customer customer, Integer serviceId) {
        if(customer==null)
            return "请先登录!";

        if(applyMapper.selectAlreadyApply(serviceId,customer.getCustId())==1){
            return "您已经申请过该志愿服务，请勿重复申请！";
        }

        if(applyMapper.selectCountByServiceId(serviceId)==mapper.selectByPrimaryKey(serviceId).getServiceNo()){
            return "申请人数已满！";
        }

        Apply apply = new Apply();
        apply.setServiceId(serviceId);
        apply.setApplyCustId(customer.getCustId());
        apply.setApplyTime(new Date());
        apply.setApplyClassify("申请志愿服务");
        apply.setApplyState(0);
        apply.setApplySchedule("待完成");

        Integer row = applyMapper.insert(apply);

        if(row!=1) {
            return "申请失败，请重新尝试。";
        }
        else {
            return "申请成功，请积极完成。";
        }
    }

    //by 孟继升

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public PageModel<Service> getServiceByPage( PageModel<Service> page, Integer userId ){
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceStateEqualTo( 0 );
        criteria.andServiceSpareEqualTo( userId+"" );
        example.setOrderByClause( "service_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( serviceMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceStateEqualTo( 0 );
        criteria.andServiceSpareEqualTo( userId+"" );
        return  (int ) serviceMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Service service=new Service();
        service.setServiceId( msgid );
        service.setServiceState( 1 );
        return serviceMapper.updateByPrimaryKeySelective( service );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceTimeBetween( from1,to );
        criteria.andServiceSpareEqualTo( userId+"" );
        criteria.andServiceStateEqualTo( 0 );
        return  (int ) serviceMapper.countByExample( example );
    }

    @Override
    public PageModel<Service> getServiceByPageDate( PageModel<Service> page, Integer userId, Date to, Date from1 ) {

        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceTimeBetween( from1,to );
        criteria.andServiceSpareEqualTo( userId+"" );
        criteria.andServiceStateEqualTo( 0 );
        example.setOrderByClause( "service_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList(serviceMapper.selectByExample( example ));
        System.out.println( serviceMapper.selectByExample( example ));
        return page;
    }

    @Override
    public Integer getCountManage( ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceStateEqualTo( 0 );
        criteria.andServiceSpareEqualTo( 0+"" );
        return  (int ) serviceMapper.countByExample( example );
    }

    @Override
    public PageModel<Service> getServiceByPageManage( PageModel<Service> page ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceStateEqualTo( 0 );
        criteria.andServiceSpareEqualTo( 0+"" );
        example.setOrderByClause( "service_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( serviceMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceTimeBetween( from2,to2 );
        criteria.andServiceSpareEqualTo( 0+"" );
        criteria.andServiceStateEqualTo( 0 );
        return  (int) serviceMapper.countByExample( example);
    }

    @Override
    public PageModel<Service> getServiceByPageDateManage( PageModel<Service> page, Date to2, Date from2 ) {
        ServiceExample example=new ServiceExample();
        ServiceExample.Criteria criteria=example.createCriteria();
        criteria.andServiceTimeBetween( from2,to2 );
        criteria.andServiceStateEqualTo( 0 );
        criteria.andServiceSpareEqualTo( 0+"" );
        example.setOrderByClause( "service_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( serviceMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Service service ) {
        return serviceMapper.insert( service );
    }

    @Override
    public Service getById( Integer msgid ) {
        return serviceMapper.selectByPrimaryKey( msgid );
    }

}
