package tech.bas.iterable;

import java.util.List;

public class iterableApp {

    public static void main(String[] args) {
        Iterable<String> names = List.of("Basrizal", "Reza", "Astana"); //karena iterable bisa menampung lebih dari 1 data

        for (var name : names){ //for-each
            System.out.println(name);
        }
    }
}
