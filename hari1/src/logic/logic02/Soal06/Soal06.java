package logic.logic02.Soal06;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat array
        String[][] array = new String[n][n];

        //method fibo
        int[] fibonaci = DeretAngka.fibo(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j>=i && j+i<=n-1){
                    array[i][j]=" "+fibonaci[i];
                } else if (j<=i && j+i>=n-1){
                    array[i][j]=" "+fibonaci[i];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
