package com.database02.repository;

import com.database02.entity.FakultasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakultasRepo extends JpaRepository<FakultasEntity, String> {
}
