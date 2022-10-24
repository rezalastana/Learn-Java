package logic.logic02.Soal08;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat Array
        String[][] array = new String[n][n];

        //ambil method fibonacci
        int[] fibonacci = DeretAngka.reverseFibo(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j<=n-1 && j>=n/2){
                    array[i][j] = " "+fibonacci[i];
                } else if(i+j>=n-1 && j<=n/2){
                    array[i][j] = " "+fibonacci[j];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
