package tech.oop.dasar.app;

import tech.Factorial;
import tech.oop.dasar.inheritance.Employee;
import tech.oop.dasar.inheritance.Manager;
import tech.oop.dasar.inheritance.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Rezal"); // Tipe data Employee dimana dia adalah tipedata obejct
        employee.sayHello("Budi");

        employee = new Manager("Rezal",20); //ini akan memanggil Manager diisi budi, dan this name diisi rezal
        employee.sayHello("Budi");

        employee = new VicePresident("Rezal");
        employee.sayHello("Budi");

        // memanggil fungsi dibawah yaitu sayHello
        sayHello(new Employee("Farhan Employee"));
        sayHello(new Manager("Farhan Manager"));
        sayHello(new VicePresident("Farhan VP"));
//        Factorial factorial = new Factorial();
//        factorial.factorial(5);
//
//        factorial.factorialRecursive(6);
        Factorial factorial = new Factorial();
        factorial.factorialTailRecursive(1,5);

        System.out.println(factorial.penjumlahanRecursive(4));

    }

    static void sayHello (Employee employee){
        if (employee instanceof VicePresident){ // instanceof berguna untuk pengecekkan tipedata
            VicePresident vicePresident = (VicePresident) employee; // lalu disini dilakukan konversi tipedata
            System.out.println("Hello VP " + vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " +manager.name );
        }else {
            System.out.println("Hello "+employee.name);
        }
    }


}
