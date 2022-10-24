package com.bootcamp.aronsoft.model;

import java.util.List;

//ada extends berarti inheritance
public class Lecture extends Person{
    private String title;
    private String university;
    private List<MataKuliah> matakuliahs;

    public Lecture(){

    }

    //constructor
    public Lecture(String title, String university) {
        this.title = title;
        this.university = university;
    }
    public Lecture(int nik, String name, String address, String gender, String title, String university) {
        super(nik, name, address, gender);
        this.title = title;
        this.university = university;
    }
    

    public Lecture(String title, String university, List<MataKuliah> matakuliahs) {
        this.title = title;
        this.university = university;
        this.matakuliahs = matakuliahs;
    }

    public Lecture(int nik, String name, String address, String gender, String title, String university,
            List<MataKuliah> matakuliahs) {
        super(nik, name, address, gender);
        this.title = title;
        this.university = university;
        this.matakuliahs = matakuliahs;
    }

    //method
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    public List<MataKuliah> getMatakuliahs() {
        return matakuliahs;
    }

    public void setMatakuliahs(List<MataKuliah> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }
    

}
