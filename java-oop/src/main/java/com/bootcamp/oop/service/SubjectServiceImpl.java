package com.bootcamp.oop.service;

import com.bootcamp.oop.model.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Override
    public List<Subject> get() {
        List<Subject> result = new ArrayList<>();

        //buat matakuliah
        Subject matkul = new Subject("MK003","Program",2);
        result.add(matkul);

        return result;
    }
}
