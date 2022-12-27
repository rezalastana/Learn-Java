package tech;
//Parent
class Manager extends Employee {

    int age;

    Manager(String name){
        super(name);
    }

    Manager(String name, int age){
        super(name);
        this.age = age;
    }

    void sayHello(String name){
        System.out.println("Hello "+name+", im is Manager "+this.name+" and im "+this.age+" years old");
    }
}


