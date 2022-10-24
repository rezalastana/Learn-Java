package app.todoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan todo: ");
        String n = sc.next();

        Logic.addTodo(n);
        Logic.showTodo();
    }



}
