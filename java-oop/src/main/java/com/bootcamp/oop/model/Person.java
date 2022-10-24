package com.bootcamp.oop.model;

import java.time.LocalDate;

public class Person {
    private int nik;
    private String nama;
    private String tptLahir;
    private LocalDate tglLahir;
    private String jenisKelamin;
    private Address address;

    //constructor


    public Person(int nik, String nama, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    public Person(int nik, String nama, String tptLahir, LocalDate tglLahir, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.tptLahir = tptLahir;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
    }
    public Person(int nik, String nama, String tptLahir, LocalDate tglLahir, String jenisKelamin, Address address) {
        this.nik = nik;
        this.nama = nama;
        this.tptLahir = tptLahir;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.address = address;
    }

    //method
    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTptLahir() {
        return tptLahir;
    }

    public void setTptLahir(String tptLahir) {
        this.tptLahir = tptLahir;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
