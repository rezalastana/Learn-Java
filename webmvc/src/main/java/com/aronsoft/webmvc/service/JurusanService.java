package com.aronsoft.webmvc.service;

import com.aronsoft.webmvc.model.JurusanModel;

import java.util.List;
import java.util.Optional;

public interface JurusanService {
    public List<JurusanModel> getAll();
    public JurusanModel getById(String id);
    public Optional<JurusanModel> save(JurusanModel data);
    public Optional<JurusanModel> update(String id, JurusanModel data);
    public Optional<JurusanModel> delete(String id);
}
