package tech;

public class Person {

    //PROPERTY/FIELD/ATRIBUTES
    public String name; //default nilai null
    public String address;
    public int angka;
    //final untuk properties yang tidak dapat berubah
    public final String country = "Indonesia";

    //METHOD//
    public void sayHello( String paramName){ // menggunakan void karena tidak mengembalikan data/nilai apapun
        System.out.println("Halo "+ paramName +", nama saya "+ this.name); //name bisa diakses karena dalam scope yang sama
        //agar tidak membuat bingung gunakan this(shadowing), paramName mengacu pada parameter pada method sayHello, dan name pada property
    }

    public void sayHelloToAll(){
        System.out.println("Hallo semuanya, perkenalkan nama saya "+ this.name);
    }

    public void sayLengkap(){
        System.out.println("Halo "+this.name+" dari "+this.address);
    }

    //CONSTRUCTOR//
    //constructor adalah method yang pertama kali dipanggil saat Object dibuat
    //berbeda dengan method, constructor tidak perlu memberikan return value, atau kata kunci void(tidak perlu) 
    //Constructor di java mirip seperti method (memliki kemampuan overloading)
    public Person(String paramName, String paramAddress){ // nama constructor harus sama dengan nama class
        //name = paramName;
        //address = paramAddress;

        //untuk menanggulangi masalah shadowing kita gunakan this.
        this.name = paramName;
        this.address = paramAddress;
    }
    //Constructor OVERLOADING / membuat constructor lebih dari 1 dengan syarat jumlah parameternya berbeda (diatas 2 , dibawah 1 , dibawahnya lagi kosong)
    //Constructor juga dapat memanggil constructor lainnya
    //dengan this(paramName, null)
    public Person(String paramName){ // ini memanggil constructor diatasnya
        this.name = paramName;
        //this.name ini mengarah ke property 
    }

    public Person(){//Constructor dengan parameter kosong
        //ini akan bernilai null
    }

    Person(String name, String address, int angka){
        this.name = name;
        this.address = address;
        this.angka = angka;
    }

    public int factorial(int number){
        int fact = 1;
        for (int i = number; i >=1 ; i--) {
            fact *= i;
        }
        return fact;
    }
}
