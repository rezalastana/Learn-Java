package com.tech.model;

import com.tech.entity.TodoListEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class TodoListModel {

    private Long id;

    private String todoList;

    //constructor
    public TodoListModel(){

    }

    public TodoListModel(String todoList){
        this.todoList = todoList;
    }

    public TodoListModel(TodoListEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
