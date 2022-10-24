package com.bootcamp.oop.controller;


import com.bootcamp.oop.model.Subject;
import com.bootcamp.oop.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    private SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService){
        this.subjectService = subjectService;
    }

    @GetMapping("/subject")
    private ResponseEntity<Object> get(){
        List<Subject> result = subjectService.get();

        return ResponseEntity.ok().body(result);
    }
}
