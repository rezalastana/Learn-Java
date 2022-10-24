package logic.logic01.Soal1;

import java.util.Scanner;

public class Soal01c {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int panjang = sc.nextInt();

    for (int i = 1; i <= panjang; i++) {
      System.out.print(i+" ");
    }
  }
  
}
