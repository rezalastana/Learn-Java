package com.database02.service;

import com.database02.entity.FakultasEntity;
import com.database02.model.FakultasModel;
import com.database02.repository.FakultasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FakultasServiceImpl implements FakultasService{
    private FakultasRepository repository;
    @Autowired
    public FakultasServiceImpl(FakultasRepository repository){
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
        return Optional.empty();
    }
}
