package logic02;

import java.util.Scanner;

public class SoalNo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai: ");
        int n = scanner.nextInt();
        // 1. buat array
        String[][] data = new String[n][n];

        // memaggil method di class DeretAngka
        int[] deretAngka = DeretAngka.tribonacchi(n);

        // 2. isi array for baris
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                if(b>=k && b+k <= n -1){
                    data[b][k] = "*"+ deretAngka[k];
                } else if(b<=k && b+k >= n -1){
                    data[b][k] = "*"+ deretAngka[k];
                }
            }
        }

        // panggil method print
        PrintArray.array2Dimensi(data);
    }
}
