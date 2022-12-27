package tech;
class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){ //Method Overriding
        System.out.println("Hello "+name+", im Employee "+this.name);
    }
}
