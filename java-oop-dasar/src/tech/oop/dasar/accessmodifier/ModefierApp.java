package tech.oop.dasar.accessmodifier;

public class ModefierApp {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.name = "Basrizal";
        modifier.age = 23; //age protected dan masih masuk dalam satu package, boleh

        System.out.println(modifier.name);
        System.out.println(modifier.age + " tahun");
    }
}
