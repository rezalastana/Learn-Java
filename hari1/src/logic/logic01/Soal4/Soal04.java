package logic.logic01.Soal4;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan banyaknya:");
        int angka = scanner.nextInt();

        int[] array = new int[angka];

        for (int i = 0; i < angka; i++) {
            if (i<2){
                array[i] = 1;
            } else {
                array[i] = array[i-1] + array [i-2];
            }
            System.out.print(array[i] + " ");
        }
    }
}
