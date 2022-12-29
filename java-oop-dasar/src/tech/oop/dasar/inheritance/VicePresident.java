package tech.oop.dasar.inheritance;

//Child dari Manager
public class VicePresident extends Manager {
    //Kata kunci inheritance class anak (child) adalah extends
    //Maka otomatis semua yang ada di class Manager akan dimiliki di class VicePresident
    //tidak perlu deklarasi String name lagi, karena sudah mengambil dari Manager, cukup ubah METHOD
    public void sayHello(String name){
        System.out.println("Hi "+name+", My name is VicePresident "+this.name);
    }
    //pada class Manager juga memiliki method sayHello, untuk merubahnya kita buat method sayhello sendiri pada VP, sehingga ketika kita memanggil sayHello pada VP, sayHello pada Manager tidak bisa diakses lagi. ini dinamakan METHOD OVERRIDING

    //Karena di parentClass nya terdapat CONSTRUCTOR dengan paramater, maka harus membuat CONSTRUCTOR juga untuk childClass nya yaitu VicePresident
    //namun jika CONSTRUCTOR nya kosong, tidak masalah
    public VicePresident(String name){
        super(name);//pemanggilan super
    }

    public VicePresident(){
        
    }
    

    // VicePresident(String name, int age){
    //     super(name,age); //Memanggil constructor pada parent yaitu Manager
    //     System.out.println("Hello "+name+", umur saya "+age);
    // }

    // //ini fungsi
    // void sayHello(String name){ //Method Overriding
    //     System.out.println("Hello "+name+", im VicePresident "+this.name);
    // }
}

