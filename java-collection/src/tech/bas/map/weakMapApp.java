package tech.bas.map;

import java.util.Map;
import java.util.WeakHashMap;

public class weakMapApp {
    public static void main(String[] args) {
        //WEAKHASHMAP
        System.out.println("===WEAKHASHMAP===");
        //seperti pada HASHMAP, namun pada WEAKHASHMAP jika data tidak dipakai dia akan dihapus
        //jika terjadi garbage collection, bisa dimungkinkan data pada WEAKHASHMAP akan dihapus
        //cocok untuk menyimpan data cache
        Map<Integer, Integer> weak = new WeakHashMap<>();

        for (int i = 0; i < 1000000; i++) {
            weak.put(i,i); // masukkan data dari 0 - 1000000
        }

        System.gc(); //trigger garbage collection
        //data akan keluar tidak sampai 1000000, namun data yang dihapus random oleh gc

        System.out.println(weak.size());
    }
}
