package com.petsvalley.controller;

import com.petsvalley.entity.PetType;
import com.petsvalley.service.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pettype")
public class PetTypeController {
    @Autowired
private PetTypeService pettypeService;
    /**
     * 分页
     * @param
     * @return
     */
    @GetMapping("getall")
    public List<PetType> getAll( ){
        return pettypeService.getAll();
    }
    @GetMapping("getType/msgid/{msgid}")
    public PetType getType(@PathVariable Integer msgid ){
        PetType type=pettypeService.getType(msgid);
        return type;
    }


}
