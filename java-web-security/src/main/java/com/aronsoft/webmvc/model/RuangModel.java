package com.aronsoft.webmvc.model;

import org.springframework.beans.BeanUtils;

import com.aronsoft.webmvc.entity.RuangEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuangModel {
    private String id;
    private String code;
    private String name;
    private String gedungId;
    private String lantaiKe;
    private GedungModel gedung;

    //cunstructor
    public RuangModel(){

    }

    public RuangModel(RuangEntity entity){
        BeanUtils.copyProperties(entity, this);
        if (entity.getGedung() != null){
            gedungId = entity.getGedung().getId();
            gedung = new GedungModel(entity.getGedung());
        }
    }
}
