package logic.logic01.Soal5;

import java.util.Scanner;

public class Soal05e {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //buat scanner
    System.out.print("input: ");//buat perintah input
    int value = sc.nextInt();//simpan variable value untuk menyimpan inputan

    int[] array = new int[value];//buat array dengan tipe data int

    for (int i = 0; i < value; i++) { //perulangan untuk menyimpan data sebanyak value
      if(i<3){//jika i < 3 maka 
        array[i] = 1;//simpan dengan nilai 1
      } else {//jika tidak
        array[i] = array[i-1]+array[i-2]+array[i-3];//gunakan rumusnya
      }
      System.out.print(array[i]+ " ");//print semua sesuai kondisi
    }
  }
  
}
