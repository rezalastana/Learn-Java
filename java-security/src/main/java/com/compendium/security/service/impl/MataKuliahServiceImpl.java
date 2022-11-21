package com.compendium.security.service.impl;

import com.compendium.security.model.MataKuliahModel;
import com.compendium.security.repository.MataKuliahRepo;
import com.compendium.security.service.MataKuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MataKuliahServiceImpl implements MataKuliahService {
    private MataKuliahRepo repo;

    @Autowired
    private MataKuliahServiceImpl(MataKuliahRepo repo){
        this.repo = repo;
    }

    @Override
    public List<MataKuliahModel> getAll() {
        return null;
    }

    @Override
    public MataKuliahModel getById(String id) {
        return null;
    }

    @Override
    public Optional<MataKuliahModel> save(MataKuliahModel data) {
        return Optional.empty();
    }

    @Override
    public Optional<MataKuliahModel> update(String id, MataKuliahModel data) {
        return Optional.empty();
    }

    @Override
    public Optional<MataKuliahModel> delete(String id) {
        return Optional.empty();
    }
}
