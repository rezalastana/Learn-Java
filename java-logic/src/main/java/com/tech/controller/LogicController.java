package com.tech.controller;

import com.tech.model.PalindromeRequest;
import com.tech.service.Logic01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api")
public class LogicController {
    private final Logic01Service logic01Service;

    //constructor untuk meng-instace class Service
    @Autowired
    public LogicController(Logic01Service logic01Service){
        this.logic01Service = logic01Service;
    }

    @GetMapping("/soal1/{param}")
    public ResponseEntity<Object> soal01(@PathVariable("param") String param){
        Map<Character, Integer> result = logic01Service.soal01(param);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/soal02")
    public ResponseEntity<Object> soal02(@RequestBody PalindromeRequest request){
        Map<Integer, Character> result = logic01Service.soal02(request);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/soal3/{param}")
    public ResponseEntity<Object> sol03(@PathVariable("param") Integer param){
        Map<Integer, String> result = logic01Service.soal03(param);
        return ResponseEntity.ok().body(result);
    }
}
