package com.database02.model;

import com.database02.entity.JurusanEntity;

public class JurusanModel {
    private String id;
    private String code;
    private String name;
    private String fakultasId;

    //constructor
    public JurusanModel(){

    }
    public JurusanModel(JurusanEntity data){
        this.id = data.getCode();
        this.code = data.getCode();
        this.name = data.getName();
        this.fakultasId = data.getFakultasId();
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

    public String getFakultasId() {
        return fakultasId;
    }

    public void setFakultasId(String fakultasId) {
        this.fakultasId = fakultasId;
    }
}
