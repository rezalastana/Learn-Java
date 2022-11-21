package com.compendium.security.repository;

import com.compendium.security.entity.RuangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuangRepo extends JpaRepository<RuangEntity,String> {
}
