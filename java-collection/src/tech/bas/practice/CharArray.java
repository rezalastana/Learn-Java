package tech.bas.practice;

import java.util.HashMap;
import java.util.Map;

public class CharArray {
    public static void main(String[] args) {
        String input = "ini adalah sebuah inputan";

        input.replace(" ",""); //untuk meghilangkan space
        char[] text = input.toCharArray();

        //System.out.println(text);//output ini tetap

        Map<Character, Integer> result = new HashMap<>();
        for (char item : text){ //output didalam sini akan dibuah dalam setiap character
            System.out.println(result.containsValue(item));
        }
    }
}
