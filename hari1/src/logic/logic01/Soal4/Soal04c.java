package logic.logic01.Soal4;

import java.util.Scanner;

public class Soal04c {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang: ");
    int value = sc.nextInt();

    int[] array = new int[value];

    for (int i = 0; i < value; i++) {
      if(i<2){
        array[i] = 1; 
      } else {
        array[i] = array [i-1] + array[i-2];
      }
      System.out.print(array[i]+ " ");
    }
  }
}
