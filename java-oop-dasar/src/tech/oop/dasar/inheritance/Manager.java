package tech.oop.dasar.inheritance;

//INHERITANCE
//Kata kunci dari inheritance/pewarisan adalah extends
//Ketika extends parent ke child, maka otomatis yang ada dimiliki parent akan di miliki oleh child
public class Manager {

    public String name;
    public String company;

    public void sayHello(String name){
        System.out.println("Hi "+name+", My name is Manager "+this.name);
    }

    //Default CONSTRUCTOR
    public Manager(){

    }
    //CONSTRUCTOR PARENT, maka VP sebagai child juga harus memiliki constructor ini
    public Manager(String name){
        this.name = name;
    }

    public Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    // Manager(String name){
    //     super(name);
    // }

    // Manager(String name, int age){
    //     super(name);
    //     this.age = age;
    // }

    // void sayHello(String name){
    //     System.out.println("Hello "+name+", im is Manager "+this.name+" and im "+this.age+" years old");
    // }
}


