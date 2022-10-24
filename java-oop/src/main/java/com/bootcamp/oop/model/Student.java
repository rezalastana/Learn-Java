package com.bootcamp.oop.model;

import java.time.LocalDate;

public class Student extends Person{
    private String nim;
    private String jurusan;
    private int ta;

    //constructor
    public Student(int nik, String nama, String jenisKelamin, String nim, String jurusan, int ta) {
        super(nik, nama, jenisKelamin);
        this.nim = nim;
        this.jurusan = jurusan;
        this.ta = ta;
    }

    public Student(int nik, String nama, String tptLahir, LocalDate tglLahir, String jenisKelamin, Address address, String nim, String jurusan, int ta) {
        super(nik, nama, tptLahir, tglLahir, jenisKelamin, address);
        this.nim = nim;
        this.jurusan = jurusan;
        this.ta = ta;
    }
    //method

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTa() {
        return ta;
    }

    public void setTa(int ta) {
        this.ta = ta;
    }
}
