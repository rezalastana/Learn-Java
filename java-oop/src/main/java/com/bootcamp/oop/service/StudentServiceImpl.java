package com.bootcamp.oop.service;

import com.bootcamp.oop.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> get() {

        List<Student> result = new ArrayList<>();

        //buat Student
        Student studentList = new Student(123,"Angga","Pria","1423","Informatika",2021);
        result.add(studentList);

        return result;

    }
}
