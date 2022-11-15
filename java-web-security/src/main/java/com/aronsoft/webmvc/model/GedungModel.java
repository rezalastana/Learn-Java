package com.aronsoft.webmvc.model;

import org.springframework.beans.BeanUtils;

import com.aronsoft.webmvc.entity.GedungEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GedungModel {
    private String id;
    private String code;
    private String name;
    private String jmlLantai;

    //constructor
    public GedungModel(){

    }

    public GedungModel(GedungEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
