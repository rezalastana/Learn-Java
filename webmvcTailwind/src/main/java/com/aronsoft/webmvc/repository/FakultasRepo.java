package com.aronsoft.webmvc.repository;

import com.aronsoft.webmvc.entity.FakultasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FakultasRepo extends JpaRepository<FakultasEntity,String> {
}
