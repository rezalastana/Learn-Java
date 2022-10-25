package com.database02.repository;

import com.database02.entity.JurusanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JurusanRepository extends JpaRepository<JurusanEntity, String> {
}
