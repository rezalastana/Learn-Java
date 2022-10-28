package com.database02.model;

import com.database02.entity.RuangEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class RuangModel {
    private String id;
    private String code;
    private String name;
    private String gedungId;
    private Integer lantaiKe;
    private GedungModel gedung;

    //constructor
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
