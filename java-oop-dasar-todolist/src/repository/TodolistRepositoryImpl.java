package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {

  private Todolist[] data = new Todolist[10];//dalam contoh masukkan value 10 array

  @Override
  public Todolist[] getAll() {
    return data;
  }

  @Override
  public void add(Todolist todolist) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void remove(Todolist todolist) {
    // TODO Auto-generated method stub
    
  }
  
}
