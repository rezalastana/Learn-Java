package logic.logic02;

public class DeretAngka {

    public static int[] ganjil(int n){
        int[] angka = new int[n];
        int bilangan = 1;

        for (int i = 0; i < n; i++) {
            angka[i] = bilangan;
            bilangan = bilangan + 2;
        }
        return angka;
    }

    public static int[] genap(int n){
        int[] angka = new int[n];
        int bilangan = 0;

        for (int i = 0; i < n; i++) {
            angka[i] = bilangan;
            bilangan = bilangan + 2;
        }
        return angka;
    }

    public static int[] reverseFibo(int n){
        int mid = n/2;
        int index = 1;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            if (i<2){
                array[i] = 1;
            }else if(i>mid){
                array[i] = array[mid - index];
                index++;
            }
            else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }
    public static int[] fibo(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i<2){
                array[i] = 1;
            }else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }


    public static int[] tribo(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < 3){
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
        }
        return deret;
    }
}
