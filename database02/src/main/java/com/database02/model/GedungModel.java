package com.database02.model;

import com.database02.entity.GedungEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GedungModel {
    private String id;
    private String code;
    private String name;
    private Integer jmlLantai;

    //constructor
    public GedungModel(){

    }
    public GedungModel(GedungEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
