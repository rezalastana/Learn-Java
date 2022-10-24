package logic.logic02.Soal10;

import logic.logic02.DeretAngka;
import logic.logic02.PrintArray;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int value = sc.nextInt();

        //Buat array
        String[][] array = new String[value][value];

        //ambil method ganjil di deretAngka
        int[] angkaGanjil = DeretAngka.ganjil((value/2) +1);

        for (int i = 0; i < value; i++) {
            int counter = (value/2)-i;
            if (i > value/2){
                counter = i-(value/2);
            }
            for (int j = 0; j < value; j++) {
                //kiri atas
                if (i + j <= value/2){
                    array[i][j] = " "+angkaGanjil[counter];
                    if (j < value/2){
                        counter--;
                    }
                //kanan atas
                }else if(j - i >= value/2 ){
                    counter++;
                    array[i][j] = " "+angkaGanjil[counter];
                //kiri bawah
                }else if(i - j >= value/2){
                    array[i][j] = " "+angkaGanjil[counter];
                    if (j < value/2){
                        counter--;
                    }
                //kanan bawah
                }
                else if(j + i >= (value/2)*3){
                    counter++;
                    array[i][j] =" "+angkaGanjil[counter];
                    
                }
            }
        }
            PrintArray.array2D(array);
    }
}
