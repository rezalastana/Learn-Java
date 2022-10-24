package com.bootcamp.oop.model;

import java.util.List;

public class Kelas {
    private int kode;
    private Subject subject;
    private Lecturer lecturer;
    private String day;
    private String jadwal;
    private List<Student> student;

    public Kelas() {
    }

    public Kelas(int kode, Subject subject, Lecturer lecturer, String day, String jadwal, List<Student> student) {
        this.kode = kode;
        this.subject = subject;
        this.lecturer = lecturer;
        this.day = day;
        this.jadwal = jadwal;
        this.student = student;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
