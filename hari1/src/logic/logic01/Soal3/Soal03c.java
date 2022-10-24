package logic.logic01.Soal3;

import java.util.Scanner;

public class Soal03c {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan input: ");
    int value = sc.nextInt();
    int temp = 0;

    for (int i = 0; i < value; i++) {
      System.out.print(temp+ " ");
      temp = temp + 2;
    }
  }
}
