package com.bootcamp.oop.controller;

import com.bootcamp.oop.model.Lecturer;
import com.bootcamp.oop.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LecturerController {
    //tambahkan property
    private LecturerService lecturerService;

    @Autowired
    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping("/lecturer")
    private ResponseEntity<Object> get(){
        List<Lecturer> result = lecturerService.get();

        return ResponseEntity.ok().body(result);
    }
}
