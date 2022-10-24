package logic.logic01.Soal8;

import java.util.Scanner;

public class Soal08b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int value = sc.nextInt();

    for (int i = 0; i < value; i++) {
      char huruf = 'A';
      if(i%2==0){
        System.out.print((huruf+=i)+" ");
      }else{
        System.out.print((i+1)+" ");
      }
      
    }
  }
  
}
