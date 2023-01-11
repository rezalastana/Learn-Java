package com.tech.service;

import com.tech.model.PalindromeRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Logic01Service {
    public Map<Character, Integer> soal01(String param){
        param.replace(" ","");
        char[] text = param.toUpperCase().toCharArray();
        Arrays.sort(text);

        //Map
        Map<Character, Integer> result = new HashMap<>();
        for (char item: text){
            Integer value = result.containsKey(item) ? result.get(item)+1 : 1;
            result.put(item, value);
        }
        return result;
    }

    public soal02(PalindromeRequest param) {

        param.setWord1("kodok");

//        char[] text1 = param.getWord1().toCharArray();
        Map<Character, Integer> result = new HashMap<>(param.getWord1().length());

        for (int i = 0; i < param.getWord1().length(); i++) {
            char text = param.getWord1().charAt(i);
            result.put(text, result.getOrDefault(text, 0) + 1);
        }

        boolean isPalindrome = true;

        for (int count : result.values()) {
            if (count % 2 == 1) {
                isPalindrome = false;
                break;
            }
        }

        // Tampilkan hasilnya
        String hasil = "Kata " + param.getWord1() + (isPalindrome ? " merupakan " : " bukan ") + "Palindrome";
        System.out.println(hasil);

        return isPalindrome;

//        param.setWord2("kodok");
//        char[] text2 = param.getWord2().toCharArray();
////        Map<Character, Integer> result2 = new TreeMap<>();
//
//        if (text1 == text2){
//
//        }
//        //word 1 = MAP
//        //word 2 = MAP
//        //if jumlah sama => PALINDROME
//        return null;
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
