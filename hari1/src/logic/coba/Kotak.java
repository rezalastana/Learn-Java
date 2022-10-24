package logic.coba;

import java.util.Scanner;

public class Kotak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kotak: ");
        int n = sc.nextInt();

        //print baris
        for (int i = 0; i < n; i++) {
            //print kolom
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println(" ");
        }
    }
}
