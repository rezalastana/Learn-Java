package com.bootcamp.aronsoft.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.aronsoft.model.Car;
import com.bootcamp.aronsoft.model.Person;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/home")
    public String index(){
        return "Hello World";
    }

    @GetMapping("/persons")
    public List<Person> getPerson(){
        List<Person> personList = new ArrayList<>();
        //membuat object dengan person
        Person person = new Person(); //instansiasi
        person.setNik(12345);
        person.setName("Basrizal");
        person.setGender("Laki-laki");
        person.setAddress("Jogja");
        //tambahkan object ke list
        personList.add(person);

        Person person2 = new Person(); //instansiasi
        person2.setNik(12346);
        person2.setName("Refanda");
        person2.setGender("Laki-laki");
        person2.setAddress("Purworejo");
        //tambahkan object ke list
        personList.add(person2);

        //menggunakan constructor
        Person person3 = new Person(1253,"Alvin","semarang","laki-laki");
        personList.add(person3);

        //langsung ke add
        personList.add(new Person(1253,"Rahmat","purwokerto","laki-laki"));

        //langsung banyak
        personList.addAll(Arrays.asList(
                new Person(1567,"Rifa","jakarta","laki-laki"),
                new Person(1275,"Andre","Sumatera","laki-laki")
        ));


        return personList;
    }

    @GetMapping("/car")
    public List<Car> getCar(){
        List<Car> carList = new ArrayList<>();
        //membuat object dengan Car
        Car car = new Car();
        car.setColor("Red");
        car.setTotalSeat(4);
        //tambahkan object ke list
        carList.add(car);

        return carList;
    }
}
