package com.aronsoft.webmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aronsoft.webmvc.entity.MataKuliahEntity;

public interface MataKuliahRepo extends JpaRepository<MataKuliahEntity,String> {
    
}
