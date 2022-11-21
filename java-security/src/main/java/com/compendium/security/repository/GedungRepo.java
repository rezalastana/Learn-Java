package com.compendium.security.repository;

import com.compendium.security.entity.GedungEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GedungRepo extends JpaRepository<GedungEntity,String> {
}
