package logic.logic02.Soal04;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat array
        String[][] array = new String[n][n];

        //panggil method
        int[] fibonacci = DeretAngka.fibo(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n/2){
                    array[i][j]=" "+fibonacci[j];
                } else if(i==n-1 || j==n-1 || j==n/2){
                    array[i][j]=" "+fibonacci[j];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
