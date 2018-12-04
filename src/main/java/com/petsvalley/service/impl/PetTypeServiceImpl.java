package com.petsvalley.service.impl;


import com.petsvalley.entity.Apply;
import com.petsvalley.entity.ApplyExample;
import com.petsvalley.entity.PetType;
import com.petsvalley.mapper.ApplyMapper;
import com.petsvalley.mapper.PetTypeMapper;
import com.petsvalley.service.ApplyService;
import com.petsvalley.service.PetTypeService;
import com.petsvalley.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PetTypeServiceImpl implements PetTypeService {
    @Autowired
    private PetTypeMapper petTypeMapper;
    public List<PetType> getAll( ){
        return petTypeMapper.selectByExample( null );
    }

    @Override
    public PetType getType( Integer msgid ) {
        return petTypeMapper.selectByPrimaryKey( msgid );
    }


}
