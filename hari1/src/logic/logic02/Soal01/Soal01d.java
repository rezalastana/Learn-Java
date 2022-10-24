package logic.logic02.Soal01;

import java.util.Arrays;
import java.util.Scanner;

public class Soal01d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan input: ");
    int n = sc.nextInt();

    logic(n);
  }

  static void logic(int n){
    String[][] array = new String[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(i==j ){
          array[i][j] = Integer.toString(i+1);
        } 
      }  
    }
    array2d(array);
  }

  static void array2d(String[][] data){
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if (data[i][j]==null){
          System.out.print("\t");
        } else {
          System.out.print(data[i][j]+"\t");
        }
      }
    System.out.println();
    }
  }
  
}
