package com.petsvalley.service.impl;



import com.petsvalley.entity.Punishment;
import com.petsvalley.entity.PunishmentExample;
import com.petsvalley.mapper.PunishmentMapper;
import com.petsvalley.service.PunishmentService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PunishmentServiceImpl implements PunishmentService {
    @Autowired
    private PunishmentMapper punishmentMapper;

    @Override
    public PageModel<Punishment> getPunishmentByPage( PageModel<Punishment> page, Integer userId ){
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        criteria.andPunStateEqualTo( 0 );
        example.setOrderByClause( "pun_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList(punishmentMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        criteria.andPunStateEqualTo( 0 );
        return  (int ) punishmentMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Punishment punishment=new Punishment();
        punishment.setPunId( msgid );
        punishment.setPunState( 1 );
        return punishmentMapper.updateByPrimaryKeySelective( punishment );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunTimeBetween( from1,to );
        criteria.andCustIdEqualTo( userId );
        criteria.andPunStateEqualTo( 0 );
        return  (int ) punishmentMapper.countByExample( example );
    }

    @Override
    public PageModel<Punishment> getPunishmentByPageDate( PageModel<Punishment> page, Integer userId, Date to, Date from1 ) {

        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunTimeBetween( from1,to );
        criteria.andCustIdEqualTo( userId );
        criteria.andPunStateEqualTo( 0 );
        example.setOrderByClause( "pun_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList(  punishmentMapper.selectByExample( example ));
        System.out.println(  punishmentMapper.selectByExample( example ));
        return page;
    }

    @Override
    public Integer getCountManage( ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunStateEqualTo( 0 );
        /*   criteria.andApplySpareEqualTo( 0+"" );*/
        return  (int ) punishmentMapper.countByExample( example );
    }

    @Override
    public PageModel<Punishment> getPunishmentByPageManage( PageModel<Punishment> page ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunStateEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "pun_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( punishmentMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunTimeBetween( from2,to2 );
        /*criteria.andApplySpareEqualTo( 0+"" );*/
        criteria.andPunStateEqualTo( 0 );
        return  (int) punishmentMapper.countByExample( example);
    }

    @Override
    public PageModel<Punishment> getPunishmentByPageDateManage( PageModel<Punishment> page, Date to2, Date from2 ) {
        PunishmentExample example=new PunishmentExample();
        PunishmentExample.Criteria criteria=example.createCriteria();
        criteria.andPunTimeBetween( from2,to2 );
        criteria.andPunStateEqualTo( 0 );
        /* criteria.andApplySpareEqualTo( 0+"" );*/
        example.setOrderByClause( "pun_time" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord() );
        page.setModelList( punishmentMapper.selectByExample( example ));
        return page;
    }

    @Override
    public int insert( Punishment punishment ) {
        return punishmentMapper.insert( punishment );
    }

    @Override
    public Punishment getById( Integer msgid ) {
        return punishmentMapper.selectByPrimaryKey( msgid );
    }
}
