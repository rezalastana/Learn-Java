package tech.oop.dasar;

//ini class
public class ContohSemua {
    //ini field/atribute/property
    String nama;
    String alamat;
    int nik;

    //ini constructor, nama constructor harus sama dengan nama class
    ContohSemua(String namaAnda, String alamatAnda, int nik){
        nama = namaAnda;
        alamat = alamatAnda;
        this.nik = nik;
    }

    //CONSTRUCTOR OVERLOADING
    //syaratnya tipe paramater berbeda atau jumlah parameter berbeda
    //sehingga bisa membuat cunstroctor lebih dari satu dan semua bisa digunakan, contoh
    ContohSemua(){

    }

    ContohSemua(String paramNama, String paramAlamat){
        //this keywoard akan mengakses objek saat ini lalu diganti dengan yang ada di parameter
        //mengatasi masalah variable shadowing
        this.nama = paramNama;
        this.alamat = paramAlamat;
    }

    //Cunstroctr dapat memanggil cunstroctor yang lain
    //dengan menggunakan this


}
