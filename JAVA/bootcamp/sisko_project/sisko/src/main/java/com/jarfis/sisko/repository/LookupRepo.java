package com.jarfis.sisko.repository;

import com.jarfis.sisko.model.master.Lookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LookupRepo extends JpaRepository<Lookup, UUID> {
}
