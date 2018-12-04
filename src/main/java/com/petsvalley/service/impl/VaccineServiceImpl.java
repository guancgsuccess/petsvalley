package com.petsvalley.service.impl;


import com.petsvalley.entity.Vaccine;
import com.petsvalley.entity.VaccineExample;
import com.petsvalley.mapper.VaccineMapper;
import com.petsvalley.service.VaccineService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VaccineServiceImpl implements VaccineService {
    @Autowired
    private VaccineMapper vaccineMapper;

    @Override
    public PageModel<Vaccine> getVaccineByPage( PageModel<Vaccine> page, Integer userId ){
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccSpareEqualTo(  userId+"" );
        criteria.andVaccStateEqualTo( 0 );
        example.setOrderByClause( "vacc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( vaccineMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccStateEqualTo( 0 );
        criteria.andVaccSpareEqualTo( userId+"" );
        return  (int ) vaccineMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Vaccine vaccine=new Vaccine();
        vaccine.setVaccId( msgid );
        vaccine.setVaccState( 1 );
        return vaccineMapper.updateByPrimaryKeySelective( vaccine );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccTimeBetween( from1,to );
        criteria.andVaccStateEqualTo( 0 );
        criteria.andVaccSpareEqualTo( userId+"" );
        return  (int ) vaccineMapper.countByExample( example );
    }

    @Override
    public PageModel<Vaccine> getVaccineByPageDate( PageModel<Vaccine> page, Integer userId, Date to, Date from1 ) {

        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccTimeBetween( from1,to );
        criteria.andVaccSpareEqualTo(  userId+"" );
        criteria.andVaccStateEqualTo( 0 );
        example.setOrderByClause( "vacc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList(vaccineMapper.selectByExample( example ));
        System.out.println( vaccineMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Vaccine vaccine ) {
        return vaccineMapper.insert( vaccine );
    }

    @Override
    public Integer getCountManage( ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccStateEqualTo( 0 );
        return  (int ) vaccineMapper.countByExample( example );
    }

    @Override
    public PageModel<Vaccine> getVaccineByPageManage( PageModel<Vaccine> page ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccStateEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "vacc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( vaccineMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccTimeBetween( from2,to2 );
        /*criteria.andApplySpareEqualTo( 0+"" );*/
        criteria.andVaccStateEqualTo( 0 );
        return  (int) vaccineMapper.countByExample( example);
    }

    @Override
    public PageModel<Vaccine> getVaccineByPageDateManage( PageModel<Vaccine> page, Date to2, Date from2 ) {
        VaccineExample example=new VaccineExample();
        VaccineExample.Criteria criteria=example.createCriteria();
        criteria.andVaccTimeBetween( from2,to2 );
        criteria.andVaccStateEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "vacc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( vaccineMapper.selectByExample( example ));
        return page;
    }
}
