package logic.logic01.Soal2;

import java.util.Scanner;

public class Soal02b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang: ");
    int value = sc.nextInt();
    int temp = 1;

    for (int i = 0; i < value; i++) {
        System.out.print(temp+ " ");
        temp = temp + 2;
      }
    }

  }

