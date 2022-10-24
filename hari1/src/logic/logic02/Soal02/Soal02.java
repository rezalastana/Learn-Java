package logic.logic02.Soal02;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat array
        String[][] array = new String[n][n];

        //panggil method ganjil dalam DeretAngka
        int[] bilGan = DeretAngka.ganjil(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0){
                    array[i][j] = " " + bilGan[j];
                } else if(i==n-1 || j == n-1){
                    array[i][j] = " " + bilGan[j];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
