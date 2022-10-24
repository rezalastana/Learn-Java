package logic.logic01.Soal1;

import java.util.Scanner;

public class Soal01b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            System.out.print(i + " ");
        }
    }
}
