package logic02;

public class PrintArray {
    public static void array2Dimensi(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == null){
                    System.out.print("\t\t");
                }else {
                    System.out.print(array[i][j]+"\t\t");
                }
            }
            // pindah baris
            System.out.println("\n");
        }
    }
}
