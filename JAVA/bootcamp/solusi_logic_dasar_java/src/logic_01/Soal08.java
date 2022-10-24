package logic_01;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        // sample out
        // 0	1	2	3	4	5	6	7	8
        // A	2	C	4	E	6	G	8	I
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            // buat array huruf
            char[] arrayHuruf = new char[n];
            char huruf='A';
            for(int a=0; a < arrayHuruf.length; a++){
                arrayHuruf[a] = huruf;
                huruf++;
            }

            // buat array string untuk kombinasi angka dan huruf
            String[] arrayKombinasi = new String[n];
            // buat angka ;
            int angka = 2;
            // isi array
            for(int b = 0; b < arrayKombinasi.length; b++){
                // jika index genap
                if(b % 2 ==0)
                    arrayKombinasi[b] = arrayHuruf[b] +"";
                else {
                    arrayKombinasi[b] = angka +"";
                    angka = angka + 2;
                }
            }

            System.out.println("Output : ");
            // tampilkan isi array
            for (int a = 0; a < arrayKombinasi.length; a++){
                System.out.print(arrayKombinasi[a] +"\t");
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
