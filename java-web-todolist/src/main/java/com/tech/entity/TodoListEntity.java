package com.tech.entity;

import com.tech.model.TodoListModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "todolist_tab")
public class TodoListEntity {

    @Id
    @Column(name = "id", length = 36)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment primary key
    private Long id;

    @Column(name = "todo", length = 255)
    private String todoList;

    //cosntructor
    public TodoListEntity(){

    }

    public TodoListEntity(String todoList){
        this.todoList = todoList;
    }

    public TodoListEntity(TodoListModel model){
        BeanUtils.copyProperties(model, this);
    }

}
