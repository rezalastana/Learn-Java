package com.jarfis.sisko.model.master;

import com.jarfis.sisko.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="lookup")
public class Lookup extends BaseModel {
    private String kode;
    private String nama;
    private String tipe;
    private Integer urutan;

    public Lookup() {
    }

    public Lookup(String kode, String nama, String tipe, Integer urutan) {
        this.kode = kode;
        this.nama = nama;
        this.tipe = tipe;
        this.urutan = urutan;
    }

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

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Integer getUrutan() {
        return urutan;
    }

    public void setUrutan(Integer urutan) {
        this.urutan = urutan;
    }

    @Override
    public String toString() {
        return "Lookup{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                ", tipe='" + tipe + '\'' +
                ", urutan=" + urutan +
                '}';
    }
}
