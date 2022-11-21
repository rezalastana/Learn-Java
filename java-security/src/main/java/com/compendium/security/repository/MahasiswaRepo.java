package com.compendium.security.repository;

import com.compendium.security.entity.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo extends JpaRepository<MahasiswaEntity,String> {
}
