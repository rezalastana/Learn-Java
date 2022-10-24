package logic.logic01.Soal7;

import java.util.Scanner;

public class Soal07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang huruf: ");
    int value = sc.nextInt();
    char huruf = 'A';

    for (int i = 0; i < value; i++) {
      System.out.print(huruf+ " ");
      huruf++;
    }
    
    }
  }
