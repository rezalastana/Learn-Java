package logic.logic01.Soal6;

import java.util.Scanner;

public class Soal06e {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan input: ");
    int value = sc.nextInt();
    int i=0,counter,prima=2;

    while(i<value){
      counter = 0;
      for (int j = 2; j <= prima; j++) {
        if(prima%j==0){
          counter++;
        }
      }
      if(counter==1){
        System.out.print(prima+" ");
        i++;
      }
      prima++;
    }
  }
  
}
