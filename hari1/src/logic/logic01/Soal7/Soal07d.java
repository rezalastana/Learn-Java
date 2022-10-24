package logic.logic01.Soal7;

import java.util.Scanner;

public class Soal07d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan input: ");
    int value = sc.nextInt();
    char huruf = 'A';

    for (int i = 0; i < value; i++) {
      System.out.print(huruf+" ");
      huruf++;
      
    }
  }
  
}
