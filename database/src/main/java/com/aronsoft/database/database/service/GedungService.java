package com.aronsoft.database.database.service;

import com.aronsoft.database.database.model.GedungModel;

import java.util.List;

public interface GedungService {
    public List<GedungModel> getAll();
    public GedungModel getById(String id);
    public GedungModel save(GedungModel data);
    public GedungModel udpate(String id, GedungModel data);
    public GedungModel delete(String id);
}
