package com.aronsoft.database.database.model;

import com.aronsoft.database.database.entity.GedungEntity;

public class GedungModel {
    private String id;
    private String code;
    private String name;
    private Integer jmlLantai;

    //constructor
    public GedungModel(){

    }
    public GedungModel(GedungEntity data){
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.jmlLantai = data.getJmlLantai();
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

    public Integer getJmlLantai() {
        return jmlLantai;
    }

    public void setJmlLantai(Integer jmlLantai) {
        this.jmlLantai = jmlLantai;
    }
}
