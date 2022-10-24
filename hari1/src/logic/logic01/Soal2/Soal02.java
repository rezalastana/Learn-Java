package logic.logic01.Soal2;

import java.util.*;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Angka Ganjil");
        System.out.print("Masukkan angka: ");
        long n = scanner.nextInt();
        int angka = 1;



        System.out.print("Output :");
            for (int i = 0; i < n; i++) {
                System.out.print(angka + "\t");
                angka = angka + 2;
            }
        }
    }
