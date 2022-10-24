package logic01;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai: ");
        int n = scanner.nextInt();

        // buat array
        int[] array = new int[n];
        int angka = 1;
        for (int i = 0; i < n; i++) {
            array[i] = angka;
            angka+=3;

            //tampilkan array
            System.out.print(array[i]+"\t");
        }
    }
}
