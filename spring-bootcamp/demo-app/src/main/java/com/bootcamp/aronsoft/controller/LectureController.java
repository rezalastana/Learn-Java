package com.bootcamp.aronsoft.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.aronsoft.model.Lecture;
import com.bootcamp.aronsoft.model.MataKuliah;

@RestController
@RequestMapping("/lecture")
public class LectureController {
  
  @GetMapping
  public List<Lecture> getAll(){
    return Arrays.asList(
      new Lecture(1231,"Basrizal","Jogja","Pria","S.Kom","UGM"),
      new Lecture(1232,"Refanda","Semarang","Pria","S.Kom","UGM"),
      new Lecture(1233,"Ana","Jogja","Perempuan","S.Pd","UNY")
    );
  }

  @GetMapping("/matakuliah")
  public List<Lecture> getMataKuliah(){
    return Arrays.asList(
      new Lecture(1231,"Basrizal","Jogja","Pria","S.Kom","UGM",
        Arrays.asList(
          new MataKuliah("MK001", "Pemrograman", 3),
          new MataKuliah("MK002", "Database", 2)
        )),
      new Lecture(1232,"Refanda","Semarang","Pria","S.Kom","UGM",
        Arrays.asList(
          new MataKuliah("MK003","Logika",3),
          new MataKuliah("MK004","Web Programming",2)
        ))
    );
  }

}
