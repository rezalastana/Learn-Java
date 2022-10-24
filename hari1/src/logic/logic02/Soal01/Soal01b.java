package logic.logic02.Soal01;

import java.util.Scanner;

public class Soal01b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan input:");
    int value = sc.nextInt();

    logic(value);
  }

  static void logic(int value){
    String[][] array = new String[value][value];

    for (int i = 0; i < value; i++) {
      for (int j = 0; j < value; j++) {
        if(i==j || i+j==value-1){
          array[i][j]=Integer.toString(i + 1);
        }
      }
    }
    array2D(array);

  }

  static void array2D(String[][] data){
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if(data[i][j]==null){
          System.out.print("\t");
        }else{
          System.out.print(data[i][j]+"\t");
        }
      }
      System.out.println("\n");
    }
  }
}
