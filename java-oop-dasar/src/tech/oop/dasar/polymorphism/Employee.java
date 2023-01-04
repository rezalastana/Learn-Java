package tech.oop.dasar.polymorphism;

public class Employee {
    //Polymorphism erat kaitannya dengan inheritance
    //Polymorphism memiliki arti banyak bentuk

    //attribute/property
    public String name;

    //method
    public void sayHello(String name){
        System.out.println("Hello "+name+", My name is Employee "+this.name);
    }

    //default constructor
    public Employee(){

    }
    //constructor
    public Employee(String name){
        this.name = name;
    }

    //akan kita extends ke Manager
}
