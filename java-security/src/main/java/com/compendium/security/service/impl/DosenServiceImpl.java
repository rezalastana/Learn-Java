package com.compendium.security.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import com.compendium.security.entity.DosenEntity;
import com.compendium.security.model.DosenModel;
import com.compendium.security.repository.DosenRepo;
import com.compendium.security.service.DosenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DosenServiceImpl implements DosenService {
    private DosenRepo repository;
    @Autowired
    public DosenServiceImpl(DosenRepo repository){
        this.repository = repository;
    }

    @Override
    public List<DosenModel> getAll() {
        return this.repository.findAll().stream().map(DosenModel::new).collect(Collectors.toList());
    }

    @Override
    public DosenModel getById(String id) {
        return this.repository.findById(id).map(DosenModel::new).orElse(new DosenModel());
    }

    @Override
    public Optional<DosenModel> save(DosenModel data) {
        if(data==null){
            return Optional.empty();
        }
        DosenEntity result = new DosenEntity(data);
        try{
            //proses simpan data
            this.repository.save(result);
            return Optional.of(new DosenModel(result));
        }catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<DosenModel> update(String id, DosenModel data) {
        Optional<DosenEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }

        DosenEntity request = result.get();
        BeanUtils.copyProperties(data, request);
        data.setId(id);
        try{
            this.repository.save(request);
            return Optional.of(new DosenModel(request));
        }catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<DosenModel> delete(String id) {
        Optional<DosenEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }
        try {
            DosenEntity data = result.get();
            this.repository.delete(data);
            return Optional.of(new DosenModel(data));
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
