package service;

import javax.xml.transform.Source;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

  private TodolistRepository todolistRepository;

  public TodolistServiceImpl(TodolistRepository todolistRepository){
    this.todolistRepository = todolistRepository;
  }


  @Override
  public void showTodolist() {
    Todolist[] model = todolistRepository.getAll();

    System.out.println("TODOLIST");
    for (var i=0; i < model.length; i++) {
      var todo = model[i];
      var nomor = i+1;

      if (todo != null) {
        System.out.println(nomor+". "+todo);
      }
    }
    
  }

  @Override
  public void addTodolist(String todo) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void removeTodolist(Integer number) {
    // TODO Auto-generated method stub
    
  }
  
}
