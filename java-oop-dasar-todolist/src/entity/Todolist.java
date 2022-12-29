package entity;

public class Todolist {

  //property
  private String todo; //di private atau di encapsulation istilahnya

  //constructor
  //none paramater
  public Todolist(){

  }
  //1 paramater
  public Todolist(String todo) {
    this.todo = todo;
  }

  //method setter getter
  public String getTodo() { //getter untuk mengambil data
    return todo;
  }

  public void setTodo(String todo) { //setter untuk mengubah data
    this.todo = todo;
  }  
}
