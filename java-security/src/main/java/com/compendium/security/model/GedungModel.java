package com.compendium.security.model;

import com.compendium.security.entity.GedungEntity;
import org.springframework.beans.BeanUtils;

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
