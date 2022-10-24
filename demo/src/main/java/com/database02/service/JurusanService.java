package com.database02.service;


import com.database02.model.JurusanModel;

import java.util.List;

public interface JurusanService {
    public List<JurusanModel> getAll();
    public JurusanModel getById(String id);
    public JurusanModel save(JurusanModel data);
    public JurusanModel update(String id, JurusanModel data);
    public JurusanModel delete(String id);
}
