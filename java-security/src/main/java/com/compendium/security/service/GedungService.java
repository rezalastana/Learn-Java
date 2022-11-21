package com.compendium.security.service;

import com.compendium.security.model.GedungModel;

import java.util.List;
import java.util.Optional;

public interface GedungService {
    public List<GedungModel> getAll();
    public GedungModel getById(String id);
    public Optional<GedungModel> save(GedungModel data);
    public Optional<GedungModel> update(String id, GedungModel data);
    public Optional<GedungModel> delete(String id);
}
