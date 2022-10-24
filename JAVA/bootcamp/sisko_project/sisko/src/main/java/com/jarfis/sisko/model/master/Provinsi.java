package com.jarfis.sisko.model.master;

import com.jarfis.sisko.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mst_provinsi")
public class Provinsi extends BaseModel {
    @Column(name = "KODE", length = 20)
    private String kode;

    @Column(name = "NAMA", length = 100)
    private String nama;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
