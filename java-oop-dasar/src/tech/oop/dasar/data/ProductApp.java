package tech.oop.dasar.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro M1",30000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
