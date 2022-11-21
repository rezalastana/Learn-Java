package com.compendium.security.model;

import com.compendium.security.entity.FakultasEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
public class FakultasModel {
    private String id;
    private String code;
    private String name;
    private String alamat;
    private List<JurusanModel> jurusanList;


    //constructor
    public FakultasModel(){

    }
    public FakultasModel(FakultasEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
