package logic.logic01.Soal3;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Angka Genap");
        System.out.println("Masukkan angka: ");
        int n = scanner.nextInt();
        int angka = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(angka + "\t");
            angka = angka + 2;
        }

    }
}
