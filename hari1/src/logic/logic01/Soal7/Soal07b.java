package logic.logic01.Soal7;

import java.util.Scanner;

public class Soal07b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Panjang huruf: ");
    int value = sc.nextInt();
    char huruf = 'A';

    for (int i = 0; i < value; i++) {
      System.out.print(huruf+" ");
      huruf++;
    }
  }
  
}
