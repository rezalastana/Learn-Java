package logic_01;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        // sample out
        // A	B	C	D	E	F	G	H	I
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        while (scn.hasNextLong()){
            int n = scn.nextInt();
            // buat array
            char huruf='A';
            System.out.println("Output : ");
            // tampilkan isi array
            for (int a = 0; a < n; a++){
                System.out.print(huruf +"\t");
                huruf++;
            }
            System.out.print("\n\nMasukan angka : ");
        }

    }
}
