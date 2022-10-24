package logic.logic02.Soal01;

import logic.logic02.PrintArray;

import java.util.*;

public class Soal01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan input: ");
        int n = input.nextInt();

        //Array
        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i+j == n-1){
                    array[i][j] = Integer.toString(i+1);
                }
            }
        }
        PrintArray.array2D(array);
    }
}
