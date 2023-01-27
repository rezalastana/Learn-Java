package com.tech.service;

import com.tech.model.PalindromeRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Logic01Service {
    public Map<Character, Integer> soal01(String param){
        param.replace(" ","");//menghilangkan spasi pada text input
        char[] text = param.toUpperCase().toCharArray();
        Arrays.sort(text);

        //Map
        Map<Character, Integer> result = new HashMap<>();
        for (char item : text){ //for-each item untuk seluruh data text
            Integer value = result.containsKey(item) ? result.get(item)+1 : 1;
            //operator ternary (value = kondisi ? jika_benar : jika_salah
            result.put(item, value);
        }
        return result;
    }

    public Map<Integer, Character> soal02(PalindromeRequest param) {

        //WORD 1
        param.setWord1("coba");
        Map<Character, Integer> map1 = new HashMap<>();
        //WORD 2
        param.setWord2("coba");
        Map<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i < param.getWord1().length(); i++) {
            char c = param.getWord1().charAt(i);
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                int count = map1.get(c);
                map1.put(c, count + 1);
            }
        }

        for (int i = 0; i < param.getWord2().length(); i++) {
            char c = param.getWord2().charAt(i);
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                int count = map2.get(c);
                map2.put(c, count + 1);
            }
        }

        if (!map1.equals(map2)){
            param.setStatus(false);
        }

        return null;
    }

    public Map<Integer, String> soal03(int n){
        Map<Integer, String> result = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){ //dahulukan yang utama
                result.put(i, "Fizz Buzz");
            } else if (i % 3 == 0){
                result.put(i, "Fizz");
            } else if (i % 5 == 0){
                result.put(i, "Buzz");
            } else if (i % 2 == 0){
                result.put(i, "Genap");
            } else {
                result.put(i, "Ganjil");
            }
        }
        return result;
    }


}
