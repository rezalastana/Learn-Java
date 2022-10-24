package com.aronsoft.database.database.model;

import com.aronsoft.database.database.entity.DosenEntity;

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

    public DosenModel(DosenEntity data){
        this.id = data.getId();
        this.nip = data.getNip();
        this.name = data.getName();
        this.jk = data.getName();
        this.alamat = data.getAlamat();
        this.gelar = data.getGelar();
    }

    //method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}
