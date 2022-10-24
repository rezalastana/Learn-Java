package com.database02.service;

import com.database02.entity.FakultasEntity;
import com.database02.entity.MahasiswaEntity;
import com.database02.model.FakultasModel;
import com.database02.model.MahasiswaModel;
import com.database02.repository.FakultasRepository;
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
        List<FakultasEntity> result = this.repository.findAll();
        if(result.isEmpty()){
            Collections.emptyList();
        }
        // conver dari List<SiswaEntity> => List<SiswaModel>
        return result.stream().map(FakultasModel::new).collect(Collectors.toList());
    }

    @Override
    public FakultasModel getById(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new FakultasModel();
        }
        Optional<FakultasEntity> result = repository.findById(id);
        // convert dari SiswaEntity => SiswaModel
        return result.map(FakultasModel::new).orElseGet(FakultasModel::new);
    }

    @Override
    public FakultasModel save(FakultasModel data) {
        if(data == null) {
            return new FakultasModel();
        }
        FakultasEntity result= new FakultasEntity(data);
        try{
            // proses simpan data => table siswa
            this.repository.save(result);
            return new FakultasModel(result);
        }catch (Exception e){
            return new FakultasModel();
        }
    }

    @Override
    public FakultasModel update(String id, FakultasModel data) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new FakultasModel();
        }

        // ambil data dari table
        Optional<FakultasEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            FakultasEntity fakultasData = result.get();
            fakultasData.setCode(data.getCode());
            fakultasData.setName(data.getName());
            fakultasData.setAlamat(data.getAlamat());
            // update waktu
            fakultasData.setUpdatedAt(LocalDateTime.now());
            fakultasData.setUpdatedBy("SYSTEM");
            try{
                this.repository.save(fakultasData);
                // jika berhasil
                return new FakultasModel(fakultasData);
            }catch (Exception e){
                System.out.println("Error update: "+ e.getMessage());
            }
        }
        return new FakultasModel();
    }

    @Override
    public FakultasModel delete(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new FakultasModel();
        }

        // ambil data dari table
        Optional<FakultasEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            try{
                FakultasEntity fakultasData = result.get();
                this.repository.delete(fakultasData);
                // jika delete berhasil
                return new FakultasModel(fakultasData);
            }catch (Exception e){
                System.out.println("Error delete: "+ e.getMessage());
            }
        }
        return new FakultasModel();
    }
}
