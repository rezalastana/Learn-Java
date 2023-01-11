package tech.bas.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class collectionApp {
    public static void main(String[] args) {
        Collection<String> name = new ArrayList<>();
        name.add("Basrizal");
        name.add("Astana");
        // name.addAll(Arrays.asList("tech","bas","collection")); //memasukkan langsung dalam banyak data
        name.addAll(List.of("tech","bas","collection")); //sama saja

        for (var iter : name){ //iter variable , name mengacu pada Collection
            System.out.println(iter);
        }

        System.out.println("===REMOVE===");
        //remove List with collection
        name.remove("Basrizal");
        name.removeAll(List.of("Astana", "bas"));//dan ini untuk menghapus data banyak secara langsung

        for (var delete : name){
            System.out.println(delete);
        }

        System.out.println("===CHEK DATA IN COLLECTIONS");
        //gunakan contains
        System.out.println(name.contains("Basrizal")); //karena sudah dihapus maka nilainya akan FALSE
        System.out.println(name.containsAll(List.of("tech", "collection"))); //harus ada semua datanya, salah satu engga ada akan FALSE

        //untuk mendapatkan jumlah data bisa digunakan size()
        System.out.println(name.size());
    }
}
