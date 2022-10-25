package com.database02.model;

import com.database02.entity.JurusanEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class JurusanModel {
    private String id;
    private String code;
    private String name;
    private String fakultasId;
    private FakultasModel fakultas;

    //constructor
    public JurusanModel(){

    }
    public JurusanModel(JurusanEntity data){
        BeanUtils.copyProperties(data, this);
        if (data.getFakultas() != null){
            fakultasId = data.getFakultas().getId();
            fakultas = new FakultasModel(data.getFakultas());
        }
    }


}
