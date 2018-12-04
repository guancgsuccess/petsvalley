package com.petsvalley.service;


import com.petsvalley.entity.Apply;
import com.petsvalley.entity.PetType;
import com.petsvalley.util.PageModel;

import java.util.Date;
import java.util.List;

public interface PetTypeService {

    List<PetType> getAll( );

    PetType getType( Integer msgid );

}
