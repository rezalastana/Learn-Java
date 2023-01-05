package com.tech.service;

import com.tech.entity.TodoListEntity;
import com.tech.model.TodoListModel;
import com.tech.repository.TodoListRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TodoListServiceImpl implements TodoListService {

    //inject from repo
    private TodoListRepository todoListRepo;

    @Autowired
    private TodoListServiceImpl(TodoListRepository todoListRepo){
        this.todoListRepo = todoListRepo;
    }

    @Override
    public List<TodoListModel> showAll() {
        return this.todoListRepo.findAll().stream().map(TodoListModel::new).collect(Collectors.toList());
    }

    @Override
    public TodoListModel getById(Long id) {
        return this.todoListRepo.findById(id).map(TodoListModel::new).orElse(new TodoListModel());
    }

    @Override
    public Optional<TodoListModel> save(TodoListModel data) {
        TodoListEntity todoList = new TodoListEntity(data);
        try {
            //proses simpan data
            this.todoListRepo.save(todoList);
            return Optional.of(new TodoListModel(todoList));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<TodoListModel> update(Long id, TodoListModel data) {
        Optional<TodoListEntity> result = this.todoListRepo.findById(id);
        //handling
        if (result.isEmpty()){
            return Optional.empty();
        }

        TodoListEntity request = result.get();
        BeanUtils.copyProperties(data, this);
        data.setId(id);
        try {
            //simpan perubahan
            this.todoListRepo.save(request);
            return Optional.of(new TodoListModel(request));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<TodoListModel> delete(Long id) {
        Optional<TodoListEntity> result = this.todoListRepo.findById(id);
        //handling
        if (result.isEmpty()){
            return Optional.empty();
        }

        try {
            TodoListEntity request = result.get();
            this.todoListRepo.delete(request);
            return Optional.of(new TodoListModel(request));
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
