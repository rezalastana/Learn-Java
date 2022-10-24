package logic.logic02;

public class PrintArray {
    public static void array2D(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
            //pindah baris
            System.out.println("\n");
        }
    }

    public static void array2D(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("\t");
                } else {
                    System.out.print(array[i][j]+"\t");
                }
            }
            //pindah baris
            System.out.println("\n");
        }
    }
}
