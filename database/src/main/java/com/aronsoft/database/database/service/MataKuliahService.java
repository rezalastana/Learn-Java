package com.aronsoft.database.database.service;

import com.aronsoft.database.database.model.DosenModel;
import com.aronsoft.database.database.model.MataKuliahModel;

import java.util.List;

public interface MataKuliahService {
    public List<MataKuliahModel> getAll();
    public MataKuliahModel getById(String id);
    public MataKuliahModel save(MataKuliahModel data);
    public MataKuliahModel update(String id, MataKuliahModel data);
    public MataKuliahModel delete(String id);
}
