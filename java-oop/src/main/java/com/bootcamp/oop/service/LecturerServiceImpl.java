package com.bootcamp.oop.service;

import com.bootcamp.oop.model.Address;
import com.bootcamp.oop.model.Lecturer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Override
    public List<Lecturer> get() {

        List<Lecturer> result = new ArrayList<>();

        Lecturer lecturer = new Lecturer(4421,"Bambang","Sleman", LocalDate.of(1985,10,10),"Pria",
                new Address(2, "Jl. Sulawesi", "Desa sulawesi", "Sulawesi2", "Sulawesi2", "Sulawesi2"),
                "S.Kom",54231);
        result.add(lecturer);

        return result;
    }
}
