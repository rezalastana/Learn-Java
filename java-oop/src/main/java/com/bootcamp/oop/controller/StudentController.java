package com.bootcamp.oop.controller;

import com.bootcamp.oop.model.Student;
import com.bootcamp.oop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    private ResponseEntity<Object> get(){
        List<Student> result = studentService.get();

        return ResponseEntity.ok().body(result);
    }
}
