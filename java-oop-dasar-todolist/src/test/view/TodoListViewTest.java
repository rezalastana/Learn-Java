package test.view;

import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
  public static void main(String[] args) {
    // testShowTodoList();
    // testAddTodoList();
    testRemoveTodoList();
  }

  public static void testShowTodoList(){
    TodolistRepository todolistRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodolist("Belajar 1");
    todoListService.addTodolist("Belajar 2");
    todoListService.addTodolist("Belajar 3");

    todoListView.showTodolist();
  }

  public static void testAddTodoList(){
    TodolistRepository todolistRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    //langsung panggil method tambah
    todoListView.addTodolist();
    //coba showTodoList setelah menambahkan data
    todoListView.showTodolist();
  }

  public static void testRemoveTodoList(){
    TodolistRepository todolistRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodolist("Belajar 1");
    todoListService.addTodolist("Belajar 2");
    todoListService.addTodolist("Belajar 3");

    todoListService.showTodolist();
    todoListView.removeTodolist();
    todoListService.showTodolist();
  }
}
