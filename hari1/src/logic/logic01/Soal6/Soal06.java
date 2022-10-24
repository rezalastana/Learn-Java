package logic.logic01.Soal6;

import java.util.*;

public class Soal06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int value = sc.nextInt();

        int i=0,counter,prima=2;

        while(i<value){
            counter = 0;

            for (int j = 2; j <= prima; j++) {
                if (prima%j == 0){
                    counter++;
                }
            }

            if (counter == 1){
                System.out.print(prima + " ");
                i++;
            }
            prima++;
        }

        //Langkah Berhasil
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan panjang input:");
//        int prima = sc.nextInt();
//        int angka=0;
//
//        for (int i=0; i<=prima; i++){
//            for (int j=1;j<=i;j++){
//                if (i%j==0){
//                    angka=angka+1;
//                }
//            }
//            if (angka==2){
//                System.out.print(i+" ");
//            }
//        }

    }
}
