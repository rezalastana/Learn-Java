package logic.logic01.Soal4;

import java.util.Scanner;

public class Soal04e {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //buat Scanner
    System.out.print("Masukkan input: ");//perintah user untuk input
    int value = sc.nextInt();//simpan input kedalam value

    System.out.println("DENGAN ARRAY");
    //dengan array
    int[] array = new int[value];//buat array untuk menyimpan element panjang

    for (int i = 0; i < value; i++) { //perulangan sebanyak balue
      if(i<2){ //perintah untuk 2 nilai awal
        array[i] = 1 ;//isikan 2 nilai awal bernilai 1
      } else { //jika sudah lebih dari 2
        array[i] = array[i-1] + array[i-2];//masukkan dalam rumus fibonaci
      }
      System.out.print(array[i]+" ");//print nilai dari array
    }

    System.out.println("\nDENGAN MANUAL");
    //dengan manual
    int fn = 1;
    int fn_1 = 1;
    int fn_2 = 0;

    for (int i = 0; i < value; i++) {
      System.out.print(fn+ " ");
      fn = fn_1 + fn_2; // .. = 1 + 0, sehingga nilai fn baru 1 // .. = 1 + 1 perulangan selanjutnya fn baru bernilai 2
      fn_2 = fn_1; // fn_2 baru bernilai 1 // fn_2 = 1
      fn_1 = fn; // fn_1 baru berninilai 1 // fn_1 = 2
      //dan selanjutnya
    }
  }
}
