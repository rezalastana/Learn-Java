package com.aronsoft.webmvc.service;

import com.aronsoft.webmvc.entity.FakultasEntity;
import com.aronsoft.webmvc.entity.JurusanEntity;
import com.aronsoft.webmvc.model.JurusanModel;
import com.aronsoft.webmvc.repository.JurusanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JurusanServiceImpl implements JurusanService{
    private JurusanRepo repository;
    @Autowired
    public JurusanServiceImpl(JurusanRepo repository){
        this.repository = repository;
    }

    @Override
    public List<JurusanModel> getAll() {
        List<JurusanEntity> result = this.repository.findAll();
        if(result.isEmpty()){
            Collections.emptyList();
        }
        // conver dari List<JurusanEntity> => List<JurusanModel>
        return result.stream().map(JurusanModel::new).collect(Collectors.toList());
    }

    @Override
    public JurusanModel getById(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new JurusanModel();
        }
        Optional<JurusanEntity> result = repository.findById(id);
        // convert dari SiswaEntity => SiswaModel
        return result.map(JurusanModel::new).orElseGet(JurusanModel::new);
    }

    @Override
    public Optional<JurusanModel> save(JurusanModel data) {
        if(data == null) {
            return Optional.empty();
        }

        JurusanEntity result = new JurusanEntity(data);
        try{
            this.repository.save(result);
            return Optional.of(new JurusanModel(result));
        }catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<JurusanModel> update(String id, JurusanModel data) {
        Optional<JurusanEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }

        JurusanEntity request = result.get();
        request.setCode(data.getCode());
        request.setName(data.getName());
        FakultasEntity fakultas = new FakultasEntity(data.getFakultas().getId());
        request.setFakultas(fakultas);

        try {
            this.repository.save(request);
            return Optional.of(new JurusanModel(request));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<JurusanModel> delete(String id) {
        return Optional.empty();
    }
}
