package com.database02.model;

import com.database02.entity.MahasiswaEntity;

import java.time.LocalDate;

public class MahasiswaModel {
    private String id;
    private String name;
    private String jk;
    private String alamat;
    private String tmptLahir;
    private LocalDate tglLahir;
    private String agama;
    private String jurusanId;


    //constructor
    public MahasiswaModel() {
    }
    public MahasiswaModel(MahasiswaEntity data){
        this.id = data.getId();
        this.name = data.getName();
        this.jk = data.getJk();
        this.alamat = data.getAlamat();
        this.tmptLahir = data.getTmpLahir();
        this.tglLahir = data.getTglLahir();
        this.agama = data.getAgama();
        this.jurusanId = data.getJurusanId();
    }

    //method

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJurusanId() {
        return jurusanId;
    }

    public void setJurusanId(String jurusanId) {
        this.jurusanId = jurusanId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
