package com.aronsoft.webmvc.service;


import com.aronsoft.webmvc.model.MahasiswaModel;
import com.aronsoft.webmvc.model.MataKuliahModel;

import java.util.List;
import java.util.Optional;

public interface MataKuliahService  {
    public List<MataKuliahModel> getAll();
    public MataKuliahModel getById(String id);
    public Optional<MataKuliahModel> save(MahasiswaModel data);
    public Optional<MataKuliahModel> update(String id, MahasiswaModel data);
    public Optional<MataKuliahModel> delete(String id);

}
