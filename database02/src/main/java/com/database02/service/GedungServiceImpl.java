package com.database02.service;

import com.database02.entity.GedungEntity;
import com.database02.model.GedungModel;
import com.database02.repository.GedungRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GedungServiceImpl implements GedungService {
    private GedungRepo repository;

    @Autowired
    public GedungServiceImpl(GedungRepo repository) {
        this.repository = repository;
    }

    @Override
    public List<GedungModel> getAll() {
        return this.repository.findAll().stream().map(GedungModel::new).collect(Collectors.toList());
    }

    @Override
    public GedungModel getById(String id) {
        return this.repository.findById(id).map(GedungModel::new).orElse(new GedungModel());
    }

    @Override
    public Optional<GedungModel> save(GedungModel data) {
        if (data == null) {
            return Optional.empty();
        }
        GedungEntity result = new GedungEntity(data);
        try {
            //simpan data
            this.repository.save(result);
            return Optional.of(new GedungModel(result));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<GedungModel> update(String id, GedungModel data) {
        Optional<GedungEntity> result = this.repository.findById(id);
        if (result.isEmpty()) {
            return Optional.empty();
        }
        GedungEntity request = result.get();
        BeanUtils.copyProperties(data, request);
        data.setId(id);
        try {
            this.repository.save(request);
            return Optional.of(new GedungModel(request));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<GedungModel> delete(String id) {
        return Optional.empty();
    }
}
