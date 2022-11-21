package com.compendium.security.repository;

import com.compendium.security.entity.DosenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DosenRepo extends JpaRepository<DosenEntity,String>{
    
}
