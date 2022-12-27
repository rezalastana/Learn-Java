package tech.oop.dasar.app;


import tech.oop.dasar.data.SetterGetter;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new SetterGetter();
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
