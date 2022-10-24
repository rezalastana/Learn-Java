package logic.logic02.Soal09;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int n = sc.nextInt();

        //buat array
        String[][] array = new String[n][n];

        //method bilangan ganjil pada deretAngka
        // int[] bilGan = DeretAngka.ganjil((n/2)+1);
        int[] bilGan = DeretAngka.ganjil((n/2) + 1);


        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < n; j++) {
                //kiri atas
                if (i+j >= n/2 ){
                    array[i][j] = " "+bilGan[counter];
                    if (j < n/2){
                        counter++;
                    }
                //kanan atas    
                } else if(j-i <= n/2 && j>= n/2 && i <= n/2){
                    counter--;
                    array[i][j] = " "+bilGan[counter];
                //kanan bawah
                }else if(i-j >= n/2 && j >= n/2 && i >= n/2 ){
                    array[i][j] = " "+bilGan[counter];
                    if (j < n/2){
                        counter++;
                    }
                //kanan bawah
                } 
                else if(j+i >= n/2){
                    counter--;
                    array[i][j] = " "+bilGan[counter];
                }
            }
        }
        PrintArray.array2D(array);
    }
}
