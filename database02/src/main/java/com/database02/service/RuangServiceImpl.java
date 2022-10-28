package com.database02.service;

import com.database02.entity.RuangEntity;
import com.database02.model.RuangModel;
import com.database02.repository.RuangRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RuangServiceImpl implements RuangService{
    private RuangRepo repository;

    @Autowired
    private RuangServiceImpl(RuangRepo repository){
        this.repository = repository;
    }

    @Override
    public List<RuangModel> getAll() {
        return this.repository.findAll().stream().map(RuangModel::new).collect(Collectors.toList());
    }

    @Override
    public RuangModel getById(String id) {
        return this.repository.findById(id).map(RuangModel::new).orElse(new RuangModel());
    }

    @Override
    public Optional<RuangModel> save(RuangModel data) {
        if (data==null){
            return  Optional.empty();
        }
        RuangEntity result = new RuangEntity(data);
        try {
            //proses simpan
            this.repository.save(result);
            return Optional.of(new RuangModel(result));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<RuangModel> update(String id, RuangModel data) {
        Optional<RuangEntity> result = this.repository.findById(id);
        if (result.isEmpty()){
            return Optional.empty();
        }
        RuangEntity request = result.get();
        BeanUtils.copyProperties(data, result);
        data.setId(id);
        try {
            this.repository.save(request);
            return Optional.of(new RuangModel(request));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<RuangModel> delete(String id) {
        return Optional.empty();
    }
}
