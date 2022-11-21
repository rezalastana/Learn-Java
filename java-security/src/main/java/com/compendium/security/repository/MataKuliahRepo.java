package com.compendium.security.repository;

import com.compendium.security.entity.MataKuliahEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MataKuliahRepo extends JpaRepository<MataKuliahEntity,String> {
    
}
