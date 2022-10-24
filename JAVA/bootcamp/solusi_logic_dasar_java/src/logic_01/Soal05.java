package logic_01;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        // sample out
        // 1	1	1	3	5	9	17	31	57
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            // buat array
            int[] array = new int[n];
            // isi array
            for (int x=0; x<n; x++){
                if(x < 3)
                    array[x] = 1;
                else
                    array[x] = array[x-1] + array[x-2]+ array[x-3];
            }
            System.out.println("Output : ");
            // tampilkan isi array
            for (int a = 0; a < n; a++){
                System.out.print(array[a] +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
