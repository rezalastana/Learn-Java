package tech.bas.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapAppPractice {
    public static void main(String[] args) {

        String inputHash = "coba";

        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < inputHash.length(); i++) {
            map.put(i, inputHash.charAt(i));
        }
        System.out.println(map);

//        ==============================================
        System.out.println("===TreeMap===");
        String inputTree = "coba";

        Map<Integer, Character> text = new TreeMap<>();

        for (int i = inputTree.length() -1; i >= 0; i--) {
            text.put(inputTree.length()-1-i, inputTree.charAt(i));
        }
        System.out.println(text);


        System.out.println("====MARI BANDINGKAN====");

        //WORD 1
        String coba1 = "kodok";
        Map<Integer, Character> map1 = new HashMap<>();

        for (int i = 0; i < coba1.length(); i++) {
            map1.put(i, coba1.charAt(i));
        }

        //WORD 2
        String coba2 = "kodok";
        Map<Integer, Character> map2 = new HashMap<>();

        for (int i = coba2.length() -1; i >= 0; i--) {
            map2.put(coba2.length()-1-i, coba2.charAt(i));
        }

        if (map1 == map2){
            System.out.println("Kata " + coba1 + " dan " + coba2 + " adalah PALINDROME");
        } else {
            System.out.println("Kata tersebut bukan PALINDROME");
        }


    }
}
