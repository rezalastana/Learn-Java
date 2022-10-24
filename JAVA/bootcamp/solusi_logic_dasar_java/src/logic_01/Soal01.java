package logic_01;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            long n = scn.nextLong();
            System.out.println("Output : ");
            for (int a = 1; a <= n; a++){
                System.out.print(a +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
