package logic_01;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            long n = scn.nextLong();
            System.out.println("Output : ");
            int angka = 1;
            for (int a = 1; a <= n; a++){
                System.out.print(angka +"\t");
                angka = angka + 2;
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
