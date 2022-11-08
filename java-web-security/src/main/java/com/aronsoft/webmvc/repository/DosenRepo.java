package com.aronsoft.webmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aronsoft.webmvc.entity.DosenEntity;

@Repository
public interface DosenRepo extends JpaRepository<DosenEntity,String>{
    
}
