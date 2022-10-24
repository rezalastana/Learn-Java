package app.todoList;

public class Logic {

    public static String[] data = new String[10];

    //Menampilkan Todo
    public static void showTodo(){
        for (int i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i+1;

            if (todo != null){
                System.out.println(no+". "+todo);
            }
        }
    }

    //Menambah Todo
    public static void addTodo(String input){
        //cek dulu apakah data sudah penuh atau belum
        //buat variable cek penuh
        var isFull = true;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                //jika data masih ada yang kosong, maka isFull bernilai false
                isFull = false;
                break;
            }
        }

        //cek jika isi array dari data sudah penuh, maka tambah lagi
        if (isFull){
            //buat variable temporary untuk menyimpan data lama
            var temp = data;
            data = new String[data.length * 2]; //gandakan indexnya

            for (int i = 0; i < data.length; i++) {
                //data lama pada temp, dimasukkan pada data baru yang indexnya lebih banyak
                temp[i] = data[i];
            }
        }


        //Menambhakan data baru
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                data[i] = input;
                break;
            }
        }
    }

    //Detele Todo
    public static void deleteTodo(){

    }
}
