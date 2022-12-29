package tech.oop.dasar.inheritance;

class Employee {

    String name;//Property

    public Employee(String name){ //Constructor
        this.name = name;
    }

    void sayHello(String name){ //Method
        System.out.println("Hello "+name+", im Employee "+this.name);
    }
}
