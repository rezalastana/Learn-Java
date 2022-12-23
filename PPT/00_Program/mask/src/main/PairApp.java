package main;

import model.Pair;

public class PairApp {
    public static void main(String[] args) {


        Pair<String, Integer> pair = new Pair<String, Integer>("Eko ", 100);
        System.out.print(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
