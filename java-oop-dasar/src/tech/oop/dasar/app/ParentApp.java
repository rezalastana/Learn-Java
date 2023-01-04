package tech.oop.dasar.app;

import tech.oop.dasar.variablehiding.*;

public class ParentApp {

    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Anak";
        child.doIt(); //akan menjalakan kan method di child
        System.out.println(child.name);


        Parent parent = child; //Konversi ke parent dari obejct child
        parent.doIt();//ini tetap akan menjadilan method di child
        //walaupun tipe data parent, namun object-nya tetap dari child
        //berbeda jika kita buat obejct baru
        //Parent parent = new Parent();
        System.out.println(parent.name); //namun jika kita printout name pada parent, dia akan tetap menuju pada class parent, ini sedikit membingungkan -> null
        //karena di java tidak ada attribute overriding
        //jadi gunakan super, karena pada parent sudah ada attribute name
    }

}
