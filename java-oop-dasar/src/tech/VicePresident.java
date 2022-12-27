package tech;
//Child dari Manager
class VicePresident extends Manager {
     //Kata kunci class anak (child) adalah extends
        //Maka otomatis semua yang ada di class Inheritance akan dimiliki di class childInheritance
        VicePresident(String name, int age){
            super(name,age); //Memanggil constructor pada parent yaitu Manager
            System.out.println("Hello "+name+", umur saya "+age);
        }
        VicePresident(String name){
            super(name);
        }

        //ini fungsi
        void sayHello(String name){ //Method Overriding
            System.out.println("Hello "+name+", im VicePresident "+this.name);
        }
    }

