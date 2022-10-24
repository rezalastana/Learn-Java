package com.bootcamp.oop.model;

import java.time.LocalDate;

public class Lecturer extends Person {
    private String tittle;
    private int nip;

    //constructor
    public Lecturer(int nik, String nama, String jenisKelamin, String tittle, int nip) {
        super(nik, nama, jenisKelamin);
        this.tittle = tittle;
        this.nip = nip;
    }
    public Lecturer(int nik, String nama, String tptLahir, LocalDate tglLahir, String jenisKelamin, String tittle, int nip) {
        super(nik, nama, tptLahir, tglLahir, jenisKelamin);
        this.tittle = tittle;
        this.nip = nip;
    }
    public Lecturer(int nik, String nama, String tptLahir, LocalDate tglLahir, String jenisKelamin, Address address, String tittle, int nip) {
        super(nik, nama, tptLahir, tglLahir, jenisKelamin, address);
        this.tittle = tittle;
        this.nip = nip;
    }

    //method

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
}
