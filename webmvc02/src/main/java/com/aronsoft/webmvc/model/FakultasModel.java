package com.aronsoft.webmvc.model;

import com.aronsoft.webmvc.entity.FakultasEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class FakultasModel {
    private String id;
    private String code;
    private String name;
    private String alamat;


    //constructor
    public FakultasModel(){

    }
    public FakultasModel(FakultasEntity data){
        BeanUtils.copyProperties(data, this);
    }
}
