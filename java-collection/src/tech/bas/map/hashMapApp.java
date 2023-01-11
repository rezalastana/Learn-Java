package tech.bas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class hashMapApp {
    public static void main(String[] args) {
        //mapping antara <key,value>
        //key di map harus uniq, tidak boleh duplicate

        //HASHMAP ->hashCode()
        System.out.println("===HASH MAP===");
        Map<String, String> map = new HashMap<>(); //<key,value >
        map.put("firstName", "Basrizal"); //put digunakan untuk meyimpan data kedalam MAP menggunakan key dan value
        map.put("lastName", "Astana");
        map.put("address", "Yogyakarta");
        map.put("address", "Pindah ke Jakarta"); //jika terdapat put yang sama berarti dia akan meng-update valuenya
        map.put("age", "23");

        System.out.println(map.get("firstName")); //get mengambil dari MAP berdasarkan key nya
        map.remove("lastName");//remove menghapus data dari MAP berdasarkan key nya
        System.out.println(map.get("lastName"));//ini akan bernilai null
        System.out.println(map.values());//untuk menampilkan semua isi value
        System.out.println(map.keySet());//untuk menampilkan semua isi key

    }
}
