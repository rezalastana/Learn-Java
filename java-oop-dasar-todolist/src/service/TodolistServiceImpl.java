package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodoListServiceImpl implements TodoListService {

  private TodolistRepository todolistRepository; //semua data aksesnya melalui repository

  //Constructor
  public TodoListServiceImpl(TodolistRepository todolistRepository){
    this.todolistRepository = todolistRepository;
  }


  @Override
  public void showTodolist() {
    Todolist[] model = todolistRepository.getAll();//akan mengambil seluruh data todolist

    System.out.println("TODOLIST");
    for (var i=0; i < model.length; i++) {
      var todolist = model[i];
      var nomor = i+1;

      if (todolist != null) {
        System.out.println(nomor+". "+todolist.getTodo());
      }
    }
    
  }

  @Override
  public void addTodolist(String todo) {
    Todolist todolist = new Todolist(todo);
    todolistRepository.add(todolist);
    System.out.println("Sukses menambahkan TODO : " +todo);

    
  }

  @Override
  public void removeTodolist(Integer number) {
    boolean success = todolistRepository.remove(number);
    if (success) {
      System.out.println("Sukses menghapus TODO : " + number);
    } else {
      System.out.println("Gagal menghapus TODO : " + number);
    }
    
  }
  
}
