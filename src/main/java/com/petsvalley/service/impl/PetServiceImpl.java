package com.petsvalley.service.impl;

import com.petsvalley.entity.Pet;
import com.petsvalley.entity.PetExample;
import com.petsvalley.mapper.PetMapper;
import com.petsvalley.service.PetService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    //by 华荣晟

    @Autowired
    private PetMapper mapper;

    @Override
    public List<Pet> getPetsByCustId(Integer custId) {
        List<Pet> petList = new ArrayList<>();
        if(custId==null)
            return petList;
        return mapper.selectByCustId(custId);
    }

    @Override
    public Pet getPetByPetId(Integer petId) {
        return mapper.selectByPrimaryKey(petId);
    }

    //by 孟继升

    @Autowired
    private PetMapper petMapper;

    @Override
    public PageModel<Pet> getPetByPage( PageModel<Pet> page, Integer userId ){
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo( userId );
        example.setOrderByClause( "pet_age" );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( petMapper.selectByExample( example));
        return page;
    }
    @Override
    public Integer getCount(Integer userId ) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andPetStateEqualTo( 0 );
        criteria.andCustIdEqualTo( userId );
        return  (int ) petMapper.countByExample( example );
    }

    @Override
    public Integer deleteById( Integer msgid ) {
        return petMapper.deleteByPrimaryKey( msgid );
    }

    @Override
    public Integer getCountByDate( Integer userId, Date to, Date from1 ) {

        return getCount( userId );
    }

    @Override
    public PageModel<Pet> getPetByPageDate( PageModel<Pet> page, Integer userId, Date to, Date from1 ) {

        return getPetByPage(  page,  userId );
    }

    @Override
    public Pet get( Integer msgid ) {
        return petMapper.selectByPrimaryKey( msgid );
    }

    @Override
    public int updatePet( Pet pet ) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andPetIdEqualTo( pet.getPetId() );
        System.out.println(pet );
        return petMapper.updateByExampleSelective( pet,example );
    }

    @Override
    public int addPet( Pet pet ) {
        return petMapper.insert( pet );
    }

    @Override
    public List<Pet> getAllByCustid( Integer userId ) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andCustIdEqualTo(userId );
        return petMapper.selectByExample( example );
    }
/*------------------------------------------------------*/
    @Override
    public Integer getCountManage( ) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andPetStateEqualTo( 0 );
        return  (int ) petMapper.countByExample( example );
    }

    @Override
    public PageModel<Pet> getPetByPageManage( PageModel<Pet> page ) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria=example.createCriteria();
        criteria.andPetStateEqualTo( 0 );
        example.setLimit(  page.getPageSize());
        example.setOffset( (long)page.getStartRecord());
        page.setModelList( petMapper.selectByExample( example));
        return page;
    }

    @Override
    public Integer getCountByDateManage( Date to2, Date from2 ) {
        return  getCountManage();
    }

    @Override
    public PageModel<Pet> getPetByPageDateManage( PageModel<Pet> page, Date to2, Date from2 ) {

        return getPetByPageManage(page);
    }
}
