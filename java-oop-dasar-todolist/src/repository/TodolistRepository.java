package repository;

import entity.Todolist;

public interface TodolistRepository {
  
  Todolist[] getAll();//pengembaliannya berupa array

  void add(Todolist todolist);

  boolean remove(Integer number);

}
