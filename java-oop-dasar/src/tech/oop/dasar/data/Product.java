package tech.oop.dasar.data;

public class Product {
    public String name;
    public int price;

    public Product(String name,int price) { //agar bisa di gunakan pada package lainnya maka harus menjadi public
        this.name = name;
        this.price = price;
    }

}


