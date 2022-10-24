package logic.logic02.Soal05;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat array
        String[][] array = new String[n][n];

        //ambil method fibonachi
        int[] fibonacci = DeretAngka.fibo(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j && i+j<=n-1){
                    array[i][j]=" "+fibonacci[j];
                } else if(i<=j && i+j>=n-1){
                    array[i][j]=" "+fibonacci[j];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
