package tech.bas.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedHashMap {
    //seperti hashMap, namun menggunakan double linked list
    //akan lebih terprediksi karena datanya akan berurutan sesuai dengan urutuan kita menyimpan data
    //namun proses linkedHashMap lebih lambat karena harus melakukan iterasi data linked list terlebih dahulu
    //gunakan hashMap jika memang kita lebih mementingkan iterasi data MAP.

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //coba ubah ke HashMap

        map.put("first", "Halo ini pertama");
        map.put("second", "Halo ini pertama");
        map.put("third", "Halo ini pertama");

        for (var key : map.keySet()){ //keySet untuk menampilkan key pada map (first,second,third)
            System.out.println(key); //jika menggunakan linkedHash akan mengurutkan sesuai input, ocba ubah dengan HashMap
        }

        //kenapa jika menggunakan HashMap tidak urut? karena pendistribusian keynya menggunakan hashCode();
    }
}
