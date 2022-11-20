package com.aronsoft.webmvc.service.impl;

import com.aronsoft.webmvc.model.MahasiswaModel;
import com.aronsoft.webmvc.model.MataKuliahModel;
import com.aronsoft.webmvc.repository.MataKuliahRepo;
import com.aronsoft.webmvc.service.MataKuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MataKuliahServiceImpl implements MataKuliahService {
    private MataKuliahRepo repo;

    @Autowired
    public MataKuliahServiceImpl(MataKuliahRepo repo){
        this.repo = repo;
    }

    @Override
    public List<MataKuliahModel> getAll() {
        return this.repo.findAll().stream().map(MataKuliahModel::new).collect(Collectors.toList());
    }

    @Override
    public MataKuliahModel getById(String id) {
        return this.repo.findById(id).map(MataKuliahModel::new).orElse(new MataKuliahModel());
    }

    @Override
    public Optional<MataKuliahModel> save(MahasiswaModel data) {
        return Optional.empty();
    }

    @Override
    public Optional<MataKuliahModel> update(String id, MahasiswaModel data) {
        return Optional.empty();
    }

    @Override
    public Optional<MataKuliahModel> delete(String id) {
        return Optional.empty();
    }
}
