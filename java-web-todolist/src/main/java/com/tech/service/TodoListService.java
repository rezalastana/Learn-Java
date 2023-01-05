package com.tech.service;

import com.tech.model.TodoListModel;

import java.util.List;
import java.util.Optional;

public interface TodoListService {

    public List<TodoListModel> showAll();
    public TodoListModel getById(Long id);
    public Optional<TodoListModel> save(TodoListModel data);
    public Optional<TodoListModel> update(Long id, TodoListModel data);
    public Optional<TodoListModel> delete(Long id);

}
