package com.petsvalley.service.impl;


import com.petsvalley.entity.Macth;
import com.petsvalley.entity.MacthExample;
import com.petsvalley.entity.SystemMessage;
import com.petsvalley.mapper.MacthMapper;
import com.petsvalley.mapper.SystemMessageMapper;
import com.petsvalley.service.MatchService;
import com.petsvalley.service.MatchService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    private MacthMapper matchMapper;
    @Autowired
    private SystemMessageMapper systemMessageMapper;
    @Override
    public PageModel<Macth> getMatchByPage( PageModel<Macth> page, Integer userId ){
        MacthExample example=new MacthExample();
        MacthExample.Criteria criteria=example.createCriteria();
        criteria.andMacthSpareEqualTo( userId+"" );
        criteria.andCoupleMacStateEqualTo( 0 );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( matchMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        MacthExample example=new MacthExample();
        MacthExample.Criteria criteria=example.createCriteria();
        criteria.andCoupleMacStateEqualTo( 0 );
        criteria.andMacthSpareEqualTo( userId+"" );
        return  (int ) matchMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        Macth macth=new Macth();
        macth.setMacId( msgid );
        macth.setCoupleMacState( 1 );
        SystemMessage message=new SystemMessage();
        Macth macth1=matchMapper.selectByPrimaryKey( msgid );
        message.setSystemMessageTitle( "解除匹配关系通知" );
        Integer petid=0;
        if(macth1.getCoupleCustId()!=null){
            message.setSystemMessageSpare( macth1.getCoupleCustId()+"" );
            petid=macth1.getCouplePetId();
        }
        else{
            message.setSystemMessageSpare( macth1.getPartnerCustId()+"" );
            petid=macth1.getPartnerPetId();
        }
        message.setSystemMessageContent( "用户:"+macth1.getMacthSpare()+"已于1分钟前解除其宠物"+macth1.getPetId()+"与您的宠物"+petid+"的匹配关系,请您尽快更新匹配信息" );
        message.setSystemMessageTime( new Date(  ) );
        message.setSystemMessageStatue( 0 );
        systemMessageMapper.insert( message );
        return matchMapper.updateByPrimaryKeySelective( macth );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {
        return  getCount( userId );
    }

    @Override
    public PageModel<Macth> getMatchByPageDate( PageModel<Macth> page, Integer userId, Date to, Date from1 ) {
        return getMatchByPage( page,  userId );
    }
}
