package com.database02.controller;

import com.database02.model.GedungModel;
import com.database02.service.GedungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gedung")
public class GedungController {
    private GedungService service;

    @Autowired
    public GedungController(GedungService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll() {
        List<GedungModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id) {
        GedungModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody GedungModel request) {
        Optional<GedungModel> result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody GedungModel request) {
        Optional<GedungModel> result = service.update(id, request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        Optional<GedungModel> result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }
}
