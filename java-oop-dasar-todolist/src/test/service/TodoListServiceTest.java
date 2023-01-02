package test.service;

import entity.Todolist;
import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
  public static void main(String[] args) {
    // testShowTodoList();
    // testAddTodolist();
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todolistRepository = new TodoListRepositoryImpl();//polymorphism
    
    //Masukkan input manual
    todolistRepository.data[0] = new Todolist("Belajar OOP");
    todolistRepository.data[1] = new Todolist("Belajar Java");
    todolistRepository.data[2] = new Todolist("Belajar Springboot");
    //pada todolistrepository panggil data dan masukkan Todolist

    TodoListService todoListService = new TodoListServiceImpl(todolistRepository); //

    todoListService.showTodolist();//showTodoList
  }
  
  public static void testAddTodolist(){
    TodolistRepository todolistRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todolistRepository);

    todoListService.addTodolist("Belajar 1");
    todoListService.addTodolist("Belajar 2");
    todoListService.addTodolist("Belajar 3");

    todoListService.showTodolist();

  }

  public static void testRemoveTodoList(){
    TodolistRepository todolistRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todolistRepository);

    todoListService.addTodolist("Belajar 1");
    todoListService.addTodolist("Belajar 2");
    todoListService.addTodolist("Belajar 3");

    todoListService.showTodolist();

    todoListService.removeTodolist(5);//coba menghapus diluar nomor TODO
    todoListService.removeTodolist(2);
    todoListService.showTodolist();
  }
}
