package tech.oop.dasar.variablehiding;

public class Child extends Parent{
    //public String name; //variable yang sama dengan parent (variable hiding), lebih baik gunakan super

    public void doIt() { // overriding method from parent
        System.out.println("doit in Child");
        System.out.println("Parent name is " + super.name); //akses ke parent
    }
}
