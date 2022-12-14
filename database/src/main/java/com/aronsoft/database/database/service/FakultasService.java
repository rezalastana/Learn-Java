package com.aronsoft.database.database.service;

import com.aronsoft.database.database.model.FakultasModel;

import java.util.List;

public interface FakultasService {
    public List<FakultasModel> getAll();
    public FakultasModel getById(String id);
    public FakultasModel save(FakultasModel data);
    public FakultasModel update(String id, FakultasModel data);
    public FakultasModel delete(String id);
}
