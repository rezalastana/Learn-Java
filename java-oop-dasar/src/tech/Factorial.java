package tech;
public class Factorial {

    int factorial(int value){
        if (value <= 0){
            return 1;
        }

        int result = 1; //inisialisasi awal untuk perkalian
        for (int i = value; i >= 1 ; i--) { // misal value kita isikan 5, kita cek, apakah value lebih dari 1
            result *= i; //maka result = 1*5
            //lalu akan diulang lagi 5 = 5*4
            //lalu akan diulang lagi 20 = 20*3
            //hingga 120*1
        }
        System.out.println(result); // setelah pengecekan
        return result;

    }

    //Lalu bagaimana jika tidak menggunakan perulangan
    //Gunakan recursive
    int factorialRecursive (int value){
        if (value <= 0){
            return 1;
        } else {
            return value * factorialRecursive(value-1); //ini akan menghasilkan penjelasan seperti ini
            // 5 * factorial(4)
            // 5 * 4 * factorial(3)
            //dst dan ini harus menunggu perhitungan factorial sebelumnya
            //sehingga ini juga akan menunggu perhitungan sebelumnya

        }
    }

    //Cara lain menggunakan TailRecusrive
    int factorialTailRecursive (int total, int value){
        if (value <= 0){
            return total;
        } else {
            //hasilnya akan seperti ini
            //factorial(1,5)
            //factorial(5,4)
            //factorial(20,3)
            //factorial(60,2)
            //factorial(120,1)
            //factorial(120,0) secara langsung
            return factorialTailRecursive(total * value, value - 1);
        }
    }

    int penjumlahanRecursive (int value){
        if (value == 0){
            return 0;
        } else {
            return value + penjumlahanRecursive(value-1);
        }
    }



}
