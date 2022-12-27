package tech.oop.dasar.app;

import tech.oop.dasar.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro M1", 30_000_000); //buat menjadi public di class Product

        System.out.println(product.name); //kalau protected tidak dapat di akses
        System.out.println(product.price);
    }
}
