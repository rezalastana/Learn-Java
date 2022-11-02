package com.aronsoft.webmvc.service;

import com.aronsoft.webmvc.model.MahasiswaModel;

import java.util.List;
import java.util.Optional;

public interface MahasiswaService {
    public List<MahasiswaModel> getAll();
    public MahasiswaModel getById(String id);
    public Optional<MahasiswaModel> save(MahasiswaModel data);
    public Optional<MahasiswaModel> update(String id, MahasiswaModel data);
    public Optional<MahasiswaModel> delete(String id);
}
