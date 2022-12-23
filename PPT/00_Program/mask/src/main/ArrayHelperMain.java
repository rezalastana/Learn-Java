package main;

import util.ArrayHelper;

public class ArrayHelperMain {
  public static void main(String[] args) {
    
    String[] name = {"Basrizal", "Reza"};
    Integer[] number= {1,2,3,4,5,6};

    System.out.println(
      ArrayHelper.<String>count(name)
    );

    //tanpa type dari generic method
    System.out.println(
      ArrayHelper.count(number)
    );

  }
}
