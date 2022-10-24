package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Siswa;

@Repository
public interface SiswaRepo extends JpaRepository<Siswa, Integer> {

}
