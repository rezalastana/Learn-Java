package logic.logic01.Soal5;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int angka = sc.nextInt();
        int[] array = new int[angka];

        for (int i = 0; i < angka; i++) {
            if (i<3){
                array[i] = 1;
            } else {
                array[i] = array[i-1]+array[i-2]+array[i-3];
            }
            System.out.print(array[i] + " ");
        }
    }
}
