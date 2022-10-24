package logic_01;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        // sample out
        // 0	1	2	3	4	5	6	7	8
        // 0	1	8	27	64	125	216	343	512
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            System.out.println("Output : ");
            // tampilkan pangkat
            for (int a = 0; a < n; a++){
                System.out.print( (int)Math.pow(a,3) +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
