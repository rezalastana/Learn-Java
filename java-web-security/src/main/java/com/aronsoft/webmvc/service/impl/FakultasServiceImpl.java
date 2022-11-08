package com.aronsoft.webmvc.service.impl;

import com.aronsoft.webmvc.entity.FakultasEntity;
import com.aronsoft.webmvc.model.FakultasModel;
import com.aronsoft.webmvc.repository.FakultasRepo;
import com.aronsoft.webmvc.service.FakultasService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FakultasServiceImpl implements FakultasService {
    private FakultasRepo repository;
    @Autowired
    public FakultasServiceImpl(FakultasRepo repository){
        this.repository = repository;
    }

    @Override
    public List<FakultasModel> getAll() {
        return this.repository.findAll().stream().map(FakultasModel::new).collect(Collectors.toList());
    }

    @Override
    public FakultasModel getById(String id) {
        return this.repository.findById(id).map(FakultasModel::new).orElse(new FakultasModel());
    }

    @Override
    public Optional<FakultasModel> save(FakultasModel data) {
        if(data == null) {
            return Optional.empty();
        }
        FakultasEntity result= new FakultasEntity(data);
        try{
            // proses simpan data => table siswa
            this.repository.save(result);
            return Optional.of(new FakultasModel(result));
        }catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<FakultasModel> update(String id, FakultasModel data) {
        Optional<FakultasEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }

        FakultasEntity request = result.get();
        BeanUtils.copyProperties(data, request);
        data.setId(id);
        try {
            this.repository.save(request);
            return  Optional.of(new FakultasModel(request));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<FakultasModel> delete(String id) {
        Optional<FakultasEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }
        try {
            FakultasEntity data = result.get();
            this.repository.delete(data);
            return Optional.of(new FakultasModel(data));
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
