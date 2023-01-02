package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {
  
  private TodoListService todoListService;

  
  public TodoListView(TodoListService todoListService) {
    this.todoListService = todoListService;
  }

  //buat 3 view
  public void showTodolist(){
    while (true) {
      todoListService.showTodolist();
      
      System.out.println("MENU");
      System.out.println("1. Tambah TODO");
      System.out.println("2. Remove TODO");
      System.out.println("3. Keluar");

      var input = InputUtil.input("pilih");

      if (input.equals("1")){
        addTodolist();
      } else if (input.equals("2")){
        removeTodolist();
      } else if (input.equals("3")){
        break;
      } else {
        System.out.println("input salah");
      }
    }
  }

  public void addTodolist(){
    System.out.println("Tambah TODO");

    var todo = InputUtil.input("Todo (pilih 3 untuk kembali)");

    if (todo.equals("3")){
      //misal pilih 3 batal / keluar
    } else { //jika tidak tambah
      todoListService.addTodolist(todo);
    }
  }

  public void removeTodolist(){
    System.out.println("Menghapus TODOLIST");

    var number = InputUtil.input("Nomor (3 untuk kembali)");

    if (number.equals("3")){
      // jika memilih angka 3 akan batal / keluar
    } else {
      todoListService.removeTodolist(Integer.valueOf(number));
    }
  }

}
