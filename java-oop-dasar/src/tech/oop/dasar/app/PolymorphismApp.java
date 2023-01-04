package tech.oop.dasar.app;


import tech.oop.dasar.inheritance.Manager;
import tech.oop.dasar.inheritance.VicePresident;
import tech.oop.dasar.polymorphism.Employee;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Rezal"); // Tipe data Employee dimana dia adalah tipedata object
        employee.sayHello("Budi");

        employee = new Manager("Rezal"); //ini akan memanggil Manager diisi budi, dan this name diisi rezal
        employee.sayHello("Budi");

        employee = new VicePresident("Rezal");
        employee.sayHello("Eko");

        // memanggil fungsi dibawah yaitu sayHello
        sayHello(new Employee("Farhan-Employee"));
        sayHello(new Manager("Farhan-Manager"));
        sayHello(new VicePresident("Farhan-VP"));

//        Factorial factorial = new Factorial();
//        factorial.factorialTailRecursive(1,5);
//
//        System.out.println(factorial.penjumlahanRecursive(4));

    }

    //Polymorhpism pada method juga bisa
//    public static void sayHello(Employee employee){
//        System.out.println("Hello " + employee.name);
//    }

    //jika manual harus membuat 1 1 dari method seperti Manager, Vp. dengan polymorphism cukup membuat 1 method

    //Type check and casts
    //dengan kata kunci instanceof
    //hasil instance of = boolean, true jika sesuai, false jika tidak
    public static void sayHello (Employee employee){
        if (employee instanceof VicePresident){ // instanceof berguna untuk pengecekkan tipedata
            VicePresident vicePresident = (VicePresident) employee; // lalu disini dilakukan konversi tipedata
            //jika tidak, bisa langsung menggunakan employee
            //System.out.println("Hello VP " + employee.name);
            System.out.println("Hello VP " + vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name );
        }else {
            System.out.println("Hello "+employee.name);
        }
    }


}
