package com.aronsoft.webmvc.model;

import com.aronsoft.webmvc.entity.FakultasEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

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
