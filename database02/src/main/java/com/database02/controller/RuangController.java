package com.database02.controller;

import com.database02.model.RuangModel;
import com.database02.service.RuangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ruang")
public class RuangController {
    private RuangService service;

    @Autowired
    public RuangController(RuangService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<RuangModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        RuangModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody RuangModel request){
        Optional<RuangModel> result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody RuangModel request){
        Optional<RuangModel> result = service.update(id, request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        Optional<RuangModel> result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }
}
