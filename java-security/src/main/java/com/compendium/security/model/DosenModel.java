package com.compendium.security.model;

import com.compendium.security.entity.DosenEntity;
import org.springframework.beans.BeanUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DosenModel {
    private String id;
    private String nip;
    private String name;
    private String jk;
    private String alamat;
    private String gelar;

    //constructor
    public DosenModel() {

    }
    
    public DosenModel(DosenEntity entity){
        BeanUtils.copyProperties(entity, this);
    }

}
