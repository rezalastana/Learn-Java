package repository;

import entity.Todolist;

public interface TodoListRepository {
  
  Todolist[] getAll();//pengembaliannya berupa array

  void add(Todolist todolist);

  boolean remove(Integer number);

}
