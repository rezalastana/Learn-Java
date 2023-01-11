import jdk.swing.interop.SwingInterOpUtils;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HitungHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input kata
        System.out.print("Masukkan sebuah kalimat: ");
        String text = scan.nextLine();
        String upperCase = text.toUpperCase();

        //logic
        //buat sebuah array untuk menampung huruf
        char huruf[] = upperCase.toCharArray(); //method mengubah string to char
        Map<Character, Integer> map = new TreeMap<>();
//        text.replace(" ", "");

        //output
        System.out.println("Banyak huruf pada kalimat " + upperCase);
        int count = 0;
        for (int i = 0; i < huruf.length; i++) { //perulangan pertama
            count = 0;
            for (int j = 0; j < huruf.length; j++) { //perulangan kedua
                if (huruf[i] == huruf[j]){ //perbandingan
                    count++;
                }
            }
            //hitung char yang sama dan hitung jumlahnya
//            System.out.println(huruf[i] + count);
            map.put(huruf[i], count);
        }
        System.out.println(map);
    }
}
