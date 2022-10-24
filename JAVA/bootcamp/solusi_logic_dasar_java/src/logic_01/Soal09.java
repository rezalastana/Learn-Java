package logic_01;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        // sample out
        // 0	1	2	3	4	5	    6	    7	    8
        // 1	3	9	27	81	243	    729	    2187	6561
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            System.out.println("Output : ");
            // tampilkan pangkat
            for (int a = 0; a < n; a++){
                System.out.print( (int)Math.pow(3,a) +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
