package logic.logic01;

import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kelipatan: ");
        int angka = sc.nextInt();

        for (int i=0;i<angka;i++){
            if (angka%5 ==0){
                System.out.println(angka);
            }
        }
    }
}
