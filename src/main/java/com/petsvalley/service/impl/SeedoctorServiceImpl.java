package com.petsvalley.service.impl;


import com.petsvalley.entity.Seedoctor;
import com.petsvalley.entity.SeedoctorExample;
import com.petsvalley.mapper.SeedoctorMapper;
import com.petsvalley.service.SeedoctorService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class SeedoctorServiceImpl implements SeedoctorService {
    @Autowired
    private SeedoctorMapper seedoctorMapper;

    @Override
    public PageModel<Seedoctor> getSeeDoctorByPage( PageModel<Seedoctor> page, Integer userId ){
        SeedoctorExample example=new SeedoctorExample();
        SeedoctorExample.Criteria criteria=example.createCriteria();
        criteria.andDocSpareEqualTo( userId+"" );
        criteria.andDocStateEqualTo( 0 );
        example.setOrderByClause( "doc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( seedoctorMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        SeedoctorExample example=new SeedoctorExample();
        SeedoctorExample.Criteria criteria=example.createCriteria();
        criteria.andDocStateEqualTo( 0 );
        criteria.andDocSpareEqualTo( userId+"" );
        return  (int ) seedoctorMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Seedoctor seedoctor=new Seedoctor();
        seedoctor.setDocId( msgid );
        seedoctor.setDocState( 1 );
        return seedoctorMapper.updateByPrimaryKeySelective( seedoctor );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        SeedoctorExample example=new SeedoctorExample();
        SeedoctorExample.Criteria criteria=example.createCriteria();
        criteria.andDocTimeBetween( from1,to );
        criteria.andDocStateEqualTo( 0 );
        criteria.andDocSpareEqualTo( userId+"" );
        return  (int ) seedoctorMapper.countByExample( example );
    }

    @Override
    public PageModel<Seedoctor> getSeeDoctorByPageDate( PageModel<Seedoctor> page, Integer userId, Date to, Date from1 ) {

        SeedoctorExample example=new SeedoctorExample();
        SeedoctorExample.Criteria criteria=example.createCriteria();
        criteria.andDocTimeBetween( from1,to );
        criteria.andDocSpareEqualTo( userId+"" );
        criteria.andDocStateEqualTo( 0 );
        example.setOrderByClause( "doc_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( seedoctorMapper.selectByExample( example ));
        System.out.println( seedoctorMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Seedoctor seedoctor ) {
        return seedoctorMapper.insert( seedoctor );
    }
}
