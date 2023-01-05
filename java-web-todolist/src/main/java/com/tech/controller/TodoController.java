package com.tech.controller;

import com.tech.model.TodoListModel;
import com.tech.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/todoList")
public class TodoController {

    //Inject from service
    private TodoListService todoListService;

    @Autowired
    public TodoController(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    //Menampilkan semua
    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("todoview/index.html");
        List<TodoListModel> result = todoListService.showAll();

        view.addObject("todoList", result);
        return view;
    }

    //Menambahkan data Baru
    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView view = new ModelAndView("todoview/add.html");

        view.addObject("todoList", new TodoListModel());
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("todoList") TodoListModel request, BindingResult result){
        //handling
        if (result.hasErrors()){
            ModelAndView view = new ModelAndView("todoview/add.html");
            view.addObject("todoList", request);
            return view;
        }
        this.todoListService.save(request);
        return new ModelAndView("redirect:/todoList"); //redirect ke link awal (bukan file)
    }

    //Edit data
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        TodoListModel todo = this.todoListService.getById(id);
        if (todo == null){
            return new ModelAndView("redirect:/todoList");
        }
        ModelAndView view = new ModelAndView("todoview/edit.html");

        view.addObject("todoList", todo);
        return view;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("todoList") TodoListModel request, BindingResult result){
        //handling
        if (result.hasErrors()){
            ModelAndView view = new ModelAndView("todoview/edit.html");
            view.addObject("todoList", request);
            return view;
        }

        this.todoListService.update(request.getId(), request);
        return new ModelAndView("redirect:/todoList");
    }

    //Detail data
    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") Long id){
        TodoListModel todo = todoListService.getById(id);
        if (todo == null){
            return new ModelAndView("redirect:/todoList");
        }
        ModelAndView view = new ModelAndView("todoview/detail.html");

        view.addObject("data", todo);
        return view;
    }

    //Delete data
//    @PostMapping("/delete")
//    public ModelAndView delete(@ModelAttribute("todoList") TodoListModel request){
//        TodoListModel todo = todoListService.getById(request.getId());
//        if (todo == null){
//            return new ModelAndView("redirect:/todoList");
//        }
//        this.todoListService.delete(request.getId());
//        return new ModelAndView("redirect:/todoList");
//    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id){
        this.todoListService.delete(id);
        return new ModelAndView("redirect:/todoList");

    }
}
