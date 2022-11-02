package com.aronsoft.webmvc.model;

import java.util.UUID;

import org.springframework.beans.BeanUtils;

import com.aronsoft.webmvc.entity.MataKuliahEntity;

public class MataKuliahModel {
    public String id;
    public String code;
    public String name;
    public Integer sks;
    
    //constructor
    public MataKuliahModel(){

    }

    public MataKuliahModel(MataKuliahEntity entity){
        BeanUtils.copyProperties(entity, this);
        this.id = UUID.randomUUID().toString();
    }
}
