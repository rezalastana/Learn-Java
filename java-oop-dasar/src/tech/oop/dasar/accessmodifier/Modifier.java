package tech.oop.dasar.accessmodifier;

public class Modifier { //public dapat dikakses dimanapun
    //Access Modifier contohnya adalah public, protected, non-modifier, dan private
    //Access modifier adalah kemampuan membuat class, field, method, dan constructor dapat diakses dimana saja
    //public class hanya bisa dibuat dalam 1 file .java saja

//    private String name;//private hanya bisa di akses dalam class ini
    String name;

    //protected hanya bisa diakses di dalam package, class, dan subclass yang sama.. diluar package tidak dapat di akses, misal ke package app
    protected int age;

}
