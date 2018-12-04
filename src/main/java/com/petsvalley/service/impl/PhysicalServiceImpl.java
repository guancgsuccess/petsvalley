package com.petsvalley.service.impl;


import com.petsvalley.entity.Physicals;
import com.petsvalley.entity.PhysicalsExample;
import com.petsvalley.mapper.PhysicalsMapper;
import com.petsvalley.service.PhysicalService;
import com.petsvalley.service.PhysicalService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PhysicalServiceImpl implements PhysicalService {
    @Autowired
    private PhysicalsMapper physicalMapper;

    @Override
    public PageModel<Physicals> getPhysicalByPage( PageModel<Physicals> page, Integer userId ){
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhySpareEqualTo(   userId+"" );
        criteria.andPhyStateEqualTo( 0 );
        example.setOrderByClause( "phy_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( physicalMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyStateEqualTo( 0 );
        criteria.andPhySpareEqualTo( userId+"" );
        return  (int ) physicalMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Physicals physical=new Physicals();
        physical.setPhyId( msgid );
        physical.setPhyState( 1 );
        return physicalMapper.updateByPrimaryKeySelective(physical);
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyTimeBetween( from1,to );
        criteria.andPhyStateEqualTo( 0 );
        criteria.andPhySpareEqualTo( userId+"" );
        return  (int ) physicalMapper.countByExample( example );
    }

    @Override
    public PageModel<Physicals> getPhysicalByPageDate( PageModel<Physicals> page, Integer userId, Date to, Date from1 ) {

        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyTimeBetween( from1,to );
        criteria.andPhySpareEqualTo( userId+"" );
        criteria.andPhyStateEqualTo( 0 );
        example.setOrderByClause( "phy_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( physicalMapper.selectByExample( example ));
        System.out.println( physicalMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Physicals physicals ) {
        return physicalMapper.insert( physicals );
    }
/*---------------------------------------------*/
    @Override
    public Integer getCountManage( ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyStateEqualTo( 0 );
        return  (int ) physicalMapper.countByExample( example );
    }

    @Override
    public PageModel<Physicals> getPhysicalsByPageManage( PageModel<Physicals> page ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyStateEqualTo( 0 );
        example.setOrderByClause( "phy_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( physicalMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyTimeBetween( from2,to2 );
        criteria.andPhyStateEqualTo( 0 );
        return  (int) physicalMapper.countByExample( example);
    }

    @Override
    public PageModel<Physicals> getPhysicalsByPageDateManage( PageModel<Physicals> page, Date to2, Date from2 ) {
        PhysicalsExample example=new PhysicalsExample();
        PhysicalsExample.Criteria criteria=example.createCriteria();
        criteria.andPhyTimeBetween( from2,to2 );
        criteria.andPhyStateEqualTo( 0 );
        example.setOrderByClause( "phy_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( physicalMapper.selectByExample( example ));
        return page;
    }
}
