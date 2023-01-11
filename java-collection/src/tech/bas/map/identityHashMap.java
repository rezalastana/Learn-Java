package tech.bas.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashMap {
    //implementasi dari MAP seperti hashMap
    //yang membedakan cara pengecekan datanya, antara key 1 dengan yang lain

    public static void main(String[] args) {

        Map<String, String> identity = new IdentityHashMap<>();

        String key1 = "name.first";

        //dipisah-pisah
        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first; //secara struktur sama seperti key1

        //coba kita compare
        System.out.println(key1.equals(key2));//ini akan sama => true

        //namun jika menggunakan reference equality (==)
        System.out.println(key1 == key2);//ini kan false

        identity.put(key1, "Basrizal");
        identity.put(key2, "Basrizal");

        System.out.println(identity.size());//output akan 2 menandakan ini adalah data yang berbeda, namun jika menggunakan hashMap biasa ouput hanya 1 data, karena menggunakan equals references
    }
}
