package com.aronsoft.webmvc.service;

import java.util.List;
import java.util.Optional;

import com.aronsoft.webmvc.model.DosenModel;


public interface DosenService {
    public List<DosenModel> getAll();
    public DosenModel getById(String id);
    public Optional<DosenModel> save(DosenModel data);
    public Optional<DosenModel> update(String id, DosenModel data);
    public Optional<DosenModel> delete(String id);
}
