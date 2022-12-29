package tech.oop.dasar.app;

import tech.oop.dasar.inheritance.Manager;
import tech.oop.dasar.inheritance.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Rizal");
        //manager.name = "Rizal";
        manager.sayHello("Refanda");
        //ini outpunya akan => "Hi Refanda, My name is Rizal"

        var vp = new VicePresident("Santoso");
        //vp.name = "Santoso"; //otomatis apa yang dimiliki Manager akan dimiliki VP
        vp.sayHello("Refanda");//namun method sayHello ini juga akan sama nilainya dengan parentClass, sehingga gunakan
        //Sehingga jika kita punya method di class parent (Managar.sayHello) kita bisa merubahnya (VicePresident.sayHello) dengan value yang berbeda.ini dinamakan METHOD OVERRIDING
        //namun ketika kita membuat METHOD OVERRIDING dengan nama yang sama pada classParent di classChild, kita tidak dapat mengakses lagi method di classParent
    }
}
