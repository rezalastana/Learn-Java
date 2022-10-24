package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.MataKuliahEntity;
import com.aronsoft.database.database.model.MataKuliahModel;
import com.aronsoft.database.database.repository.MataKuliahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MataKuliahServiceImpl implements MataKuliahService {
    private MataKuliahRepository repository;

    @Autowired
    public MataKuliahServiceImpl(MataKuliahRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MataKuliahModel> getAll() {
        List<MataKuliahEntity> result = this.repository.findAll();

        if (result.isEmpty()) {
            Collections.emptyList();
        }

        //convert
        return result.stream().map(MataKuliahModel::new).collect(Collectors.toList());
    }

    @Override
    public MataKuliahModel getById(String id) {
        //check id apakah ada?
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new MataKuliahModel();
        }
        Optional<MataKuliahEntity> result = repository.findById(id);
        //convert
        return result.map(MataKuliahModel::new).orElseGet(MataKuliahModel::new);
    }

    @Override
    public MataKuliahModel save(MataKuliahModel data) {
        //check id
        if (data == null) {
            return new MataKuliahModel();
        }
        MataKuliahEntity result = new MataKuliahEntity(data);
        try {
            //proses simpan
            this.repository.save(result);
            return new MataKuliahModel(result);
        } catch (Exception e){
            return new MataKuliahModel();
        }
    }

    @Override
    public MataKuliahModel update(String id, MataKuliahModel data) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new MataKuliahModel();
        }
        Optional<MataKuliahEntity> result = repository.findById(id);
        //check data
        if (result.isPresent()){
            MataKuliahEntity matkulData = result.get();
            //replace
            matkulData.setCode((data.getCode()));
            matkulData.setName((data.getName()));
            matkulData.setSks((data.getSks()));
            matkulData.setUpdatedAt(LocalDateTime.now());
            matkulData.setUpdatedBy("SYSTEM");
            try {
                this.repository.save(matkulData);
                //jika berhasil
                return new MataKuliahModel(matkulData);
            } catch (Exception e){
                System.out.println("Eror update " + e.getMessage());
            }
        }
        return new MataKuliahModel();
    }

    @Override
    public MataKuliahModel delete(String id) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new MataKuliahModel();
        }
        //ambil data dari table
        Optional<MataKuliahEntity> result = repository.findById(id);
        //check dari result
        if (result.isPresent()){
            try {
                MataKuliahEntity matkulData = result.get();
                this.repository.delete(matkulData);
                //jika berhasil
                return new MataKuliahModel(matkulData);
            } catch (Exception e){
                System.out.println("Delete error " + e.getMessage());
            }
        }
        return new MataKuliahModel();
    }
}
