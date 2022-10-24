package com.aronsoft.database.database.model;

import com.aronsoft.database.database.entity.JurusanEntity;

public class JurusanModel {
    private String id;
    private String kode_jurusan;
    private String nama_jurusan;
    private String fakultas_id;

    //constructor
    public JurusanModel() {
    }
    public JurusanModel(JurusanEntity data){
        this.id = data.getId();
        this.kode_jurusan = data.getCode();
        this.nama_jurusan = data.getName();;
        this.fakultas_id = data.getFakultasId();
    }

    //method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }

    public String getFakultas_id() {
        return fakultas_id;
    }

    public void setFakultas_id(String fakultas_id) {
        this.fakultas_id = fakultas_id;
    }
}
