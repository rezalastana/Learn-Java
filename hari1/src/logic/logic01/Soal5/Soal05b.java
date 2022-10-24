package logic.logic01.Soal5;

import java.util.Scanner;

public class Soal05b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int value = sc.nextInt();

    int[] array = new int[value];

    for (int i = 0; i < value; i++) {
      if(i<3){
        array[i] = 1;
      } else {
        array[i] = array[i-1]+array[i-2]+array[i-3];
      }
        System.out.print(array[i]+" ");      
    }
  }
  
}
