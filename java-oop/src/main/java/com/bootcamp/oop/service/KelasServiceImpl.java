package com.bootcamp.oop.service;

import com.bootcamp.oop.model.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KelasServiceImpl implements KelasService {
    @Override
    public List<Kelas> get() {
        List<Kelas> result = new ArrayList<>();

        //DATA 1
        Lecturer lecturer = new Lecturer(4231, "Andre", "pria", "S.Kom", 3241);
        //buat listMahasiswa pada mahasiswa
        List<Student> studentList = Arrays.asList(
                new Student(4231, "Rezal", "Pria", "1231", "Informatika", 2022),
                new Student(4231, "Astana", "Pria", "1232", "Informatika", 2022),
                new Student(4231, "Adam", "Pria", "1233", "Manajemen", 2022)
        );

        //matakuliah1
        Subject matakuliah1 = new Subject("MK001", "Database", 3);
        //kelas1
        Kelas kelas1 = new Kelas(121, matakuliah1, lecturer, "Senin", "08-00 - 10.00", studentList);
        result.add(kelas1);

        //DATA 2
        //buat dosen2 dengan property tglLahir, tmptLahir
        Lecturer lecturer2 = new Lecturer(4232,"Ahmad","Ciamis", LocalDate.of(1990,12,1), "Pria", "S.Kom", 3242);
        //buat alamat dalam dosen secara langsung disini
        lecturer2.setAddress(new Address(3,"Jl. Dago","Desa","Kecamatan","Kabupaten","Provinsi"));
        //buat listMahasiswa2
        List<Student> studentList2 = Arrays.asList(
                new Student(4221, "Agung", "Yogyakarta", LocalDate.of(1998,5,1), "Pria",
                        new Address(4, "Jl. Dede", "Desa2", "Kecamatan2", "Kabupate2", "Provinsi2"),
                        "1241","Manajemen",2021
                )
        );

        //matakuliah2
        Subject matakuliah2 = new Subject("MK002", "UIUX", 2);
        //kelas2
        Kelas kelas2 = new Kelas(122, matakuliah2, lecturer2, "Selasa", "12-00 - 13.00", studentList2);
        result.add(kelas2);

        return result;
    }

    @Override
    public Kelas getById() {
        return null;
    }
}
