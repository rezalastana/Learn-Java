package tech.oop.dasar.app;

import tech.oop.dasar.dasar.Person;

public class PersonApp {
    public static void main(String[] args) {

        // manipulasi properties
        var person1 = new Person(); //object, dengan constructor parameter kosong
        person1.name = "Eko";
        person1.address = "Jakarta";
        // person1.country = "Amerika";
        //final field akan error karena tidak dapat dirubah

        //var person = new Person(); // ini juga sama saja membuat Object

        //person.name = "Basrizal";
        //person.address = "Maguwo";
        // data final tidak dapat dirubah

        //METHOD sayHello
        person1.sayHello("Basrizal"); //method
        //outputnya akan = "Halo Basrizal, nama saya Eko" => Basrizal dari parameter, Eko dari property name yang diinputkan

        var person2 = new Person();
        //jika name belum diset maka hasilnya akan null
        person2.sayHello("Budi");
        //outputnya akan = "Halo Budi, nama saya `null`" => semua tipe data object kalau belum di deklrasikan maka nilainya null

        //Person person2 = new Person(); ini akan error jika constructor yang dibuat memiliki parameter
        // sehingga pemanggilan constuctor harus diisi dengan parameter... contoh
        //CONSTRUCTOR yang dibuat dengan parameter(paramName)
        Person person3 = new Person("Basizal Reza Astana-", "Sleman-"); //membuat object yang sudah dibuat pada CONSTRUCTOR
        System.out.print(person3.name);
        System.out.print(person3.address);
        System.out.println(person3.country);

        //Constructor juga bisa memaksa orang untuk mengisi filed nantinya... walaupun tidak terpakai

        Person person4 = new Person("refanda","purworejo");
        //jika CONSTRUCTOR dibuat dengan 2 parameter, maka tidak perlu memanggil property seperti person4.name | person4.address
        // person4.name = "refanda"; tidak perlu
        // person4.address = "purworejo"; tidak perlu
        person4.sayLengkap(); //ini akan memanggil METHOD sayLengkap dengan output => "Hallo refanda dari purworejo"
        // person4.sayHelloToAll(); //panggil METHOD sayHelloToAll dengan output =>"Halo semuanya, perkenalkan nama saya Refanda"

        Person person5 = new Person();
        System.out.println(person5.factorial(5));
    }
}
