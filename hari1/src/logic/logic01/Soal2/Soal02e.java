package logic.logic01.Soal2;

import java.util.Scanner;

public class Soal02e {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //buat Scanner
    System.out.print("Masukkan input: "); //buat tampilan agar user mengisi input
    int value = sc.nextInt(); //buat variable menyimpan nilai input dengan nama value
    int temp = 1; //buat nilai untuk awalan

    for (int i = 0; i < value; i++) {//buat perulangan untuk panjangnya angka
      System.out.print(temp+" ");//outputkan dulu temp yang pertama, lalu diulang pada for
      temp = temp + 2; //kelipatan temp agar ganjil
    }
  }
  
}
