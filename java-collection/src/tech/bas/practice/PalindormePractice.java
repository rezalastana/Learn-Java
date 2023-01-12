package tech.bas.practice;

import java.util.HashMap;
import java.util.Map;

public class PalindormePractice {
    public static void main(String[] args) {

        String input1 = "kodok";
        String input2 = "kodok";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                int count = map1.get(c);
                map1.put(c, count + 1);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                int count = map2.get(c);
                map2.put(c, count + 1);
            }
        }

        if (map1.equals(map2)) {
            System.out.println("Kata tersebut palindrome");
        } else {
            System.out.println("Kata tersebut bukan palindrome");
        }
    }
}
