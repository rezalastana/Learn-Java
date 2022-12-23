package main;

import model.MyData;

public class MyDataMain {
    public static void main(String[] args) {
        //String Tyoe Data
        MyData<String> stringMyData = new MyData<>("Hello Basrizal");
        String stringValue = stringMyData.getData();
        System.out.println(stringValue);


        //Integer Type Data (Object)
        System.out.println("\n");
        MyData<Integer> integerMyData = new MyData<>(10);
        Integer integerValue = integerMyData.getData();
        System.out.println(integerValue);
    }
}
