package com.database02.repository;

import com.database02.entity.GedungEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GedungRepo extends JpaRepository<GedungEntity, String> {
}
