package com.aronsoft.database.database.model;

import com.aronsoft.database.database.entity.MataKuliahEntity;

public class MataKuliahModel {
    private String id;
    private String code;
    private String name;
    private Integer sks;

    //constructor
    public MataKuliahModel(){

    }
    public MataKuliahModel(MataKuliahEntity data){
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.sks = data.getSks();
    }

    //method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
