package com.compendium.security.repository;

import com.compendium.security.entity.JurusanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JurusanRepo extends JpaRepository<JurusanEntity,String> {
}
