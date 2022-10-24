package logic_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        // sample out
        // 1	1	2	3	5	8	13	21	34
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            // buat array
            List<Integer> listPrima = primeNumbersBruteForce(n);
            System.out.println("Output : ");
            // tampilkan isi array
            for (Integer a : listPrima){
                System.out.print(a +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }

    public static List<Integer> primeNumbersBruteForce(int n) {
        List<Integer> primeNumbers = new LinkedList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i += 2) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    private static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i*i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
