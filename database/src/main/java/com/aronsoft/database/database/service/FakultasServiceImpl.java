package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.DosenEntity;
import com.aronsoft.database.database.entity.FakultasEntity;
import com.aronsoft.database.database.model.DosenModel;
import com.aronsoft.database.database.model.FakultasModel;
import com.aronsoft.database.database.repository.FakultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

@Service
public class FakultasServiceImpl implements FakultasService{
    private FakultasRepository repository;

    @Autowired
    public FakultasServiceImpl(FakultasRepository repository){
        this.repository = repository;
    }

    @Override
    public List<FakultasModel> getAll() {
        List<FakultasEntity> result = this.repository.findAll();

        if (result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(FakultasModel::new).collect(Collectors.toList());
    }

    @Override
    public FakultasModel getById(String id) {
        //check id terlebih dahulu
        if (id == null || id.isBlank() || id.isEmpty()){
            return new FakultasModel();
        }
        Optional<FakultasEntity> result = repository.findById(id);
        //convert
        return result.map(FakultasModel::new).orElseGet(FakultasModel::new);
    }

    @Override
    public FakultasModel save(FakultasModel data) {
        if (data == null) {
            return new FakultasModel();
        }
        FakultasEntity result = new FakultasEntity(data);
        try {
            //proses simpan data ke database
            this.repository.save(result);
            return new FakultasModel(result);
        } catch (Exception e) {
            return new FakultasModel();
        }
    }

    @Override
    public FakultasModel update(String id, FakultasModel data) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new FakultasModel();
        }
        //ambil data dari table
        Optional<FakultasEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()) {
            FakultasEntity fakultasData = result.get();
            //replace data lama dengan yang baru
            fakultasData.setCode((data.getCode()));
            fakultasData.setName((data.getName()));
            fakultasData.setAlamat(data.getAlamat());

            //update waktu
            fakultasData.setUpdatedAt(LocalDateTime.now());
            fakultasData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(fakultasData);
                //jika berhasil
                return new FakultasModel(fakultasData);
            } catch (Exception e) {
                System.out.println("Error update: " + e.getMessage());
            }
        }
        return new FakultasModel();
    }

    @Override
    public FakultasModel delete(String id) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new FakultasModel();
        }

        //ambil data dari table
        Optional<FakultasEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()) {
            try {
                FakultasEntity fakultasData = result.get();
                this.repository.delete(fakultasData);
                // jika delete berhasil
                return new FakultasModel(fakultasData);
            } catch (Exception e) {
                System.out.println("Error detele: " + e.getMessage());
            }
        }
        return new FakultasModel();
    }
}
