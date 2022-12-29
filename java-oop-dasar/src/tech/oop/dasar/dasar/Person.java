package tech.oop.dasar.dasar;

public class Person {

    //PROPERTY/FIELD/ATRIBUTES
    public String name; //default nilai null
    public String address;
    public int angka;
    //final untuk properties yang tidak dapat berubah
    public final String country = "Indonesia";

    //METHOD
    public void sayHello( String paramName){ // menggunakan void karena tidak mengembalikan data/nilai apapun
        System.out.println("Halo "+ paramName +", nama saya "+ this.name); //name bisa diakses karena dalam scope yang sama
        //agar tidak membuat bingung gunakan this.(shadowing), paramName mengacu parameter pada method sayHello, dan name pada property
    }

    public void sayHelloToAll(){
        System.out.println("Hallo semuanya, perkenalkan nama saya "+ this.name);
    }

    public void sayLengkap(){
        System.out.println("Halo "+this.name+" dari "+this.address);
    }

    //CONSTRUCTOR//
    //CONSTRUCTOR adalah method yang pertama kali dipanggil saat Object dibuat
    //berbeda dengan method, CONSTRUCTOR tidak perlu memberikan return value, atau kata kunci void(tidak perlu) 
    //CONSTRUCTOR di java mirip seperti method (memliki kemampuan overloading)
    public Person(String paramName, String paramAddress){ // nama CONSTRUCTOR harus sama dengan nama class
        //name = paramName;
        //address = paramAddress;

        //untuk menanggulangi masalah shadowing kita gunakan this.
        //this merepresentasikan object saat ini 
        this.name = paramName; //nam3 yang ada di property akan diubah dengan nama yang ada pada parameter ini
        this.address = paramAddress;
    }
    //CONSTRUCTOR OVERLOADING / membuat CONSTRUCTOR lebih dari 1 dengan syarat jumlah parameternya berbeda (diatas 2 , dibawah 1 , dibawahnya lagi kosong)
    //CONSTRUCTOR juga dapat memanggil CONSTRUCTOR lainnya
    //dengan this(paramName, null)
    public Person(String paramName){ // ini memanggil CONSTRUCTOR diatasnya
        this.name = paramName;
        //this.name ini mengarah ke property 
    }

    public Person(){//CONSTRUCTOR dengan parameter kosong
        //ini akan bernilai null
    }

    Person(String name, String address, int angka){
        this.name = name;
        this.address = address;
        this.angka = angka;
    }
    
    //METHOD factorial
    public int factorial(int number){
        int fact = 1;
        for (int i = number; i >=1 ; i--) {
            fact *= i;
        }
        return fact;
    }
}
