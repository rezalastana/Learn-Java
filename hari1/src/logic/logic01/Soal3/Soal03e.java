package logic.logic01.Soal3;

import java.util.Scanner;

public class Soal03e {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//buat Scanner untuk inputan
    System.out.print("Masukkan inputan: ");//tulisan agar user memberi nilai inputan
    int value = sc.nextInt();//membuat variable value untuk menyimpan inputan user
    int temp = 0; //membuat nilai awalan

    for (int i = 0; i < value; i++) { //membuat perulangan hingga "value"
      System.out.print(temp+" ");//tampilkan nilai temp awal, agar 0 terprint
      temp = temp + 2;//buat aritmatika untuk menambah nilai ke temp dan berulang pada for hingga batas value 
    }
  }
  
}
