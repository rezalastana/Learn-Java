package com.database02.repository;

import com.database02.entity.RuangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuangRepo extends JpaRepository<RuangEntity, String> {
}
