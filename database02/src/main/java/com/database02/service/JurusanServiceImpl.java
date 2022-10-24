package com.database02.service;

import com.database02.entity.JurusanEntity;
import com.database02.entity.MahasiswaEntity;
import com.database02.model.JurusanModel;
import com.database02.model.MahasiswaModel;
import com.database02.repository.JurusanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JurusanServiceImpl implements JurusanService{
    private JurusanRepository repository;
    @Autowired
    public JurusanServiceImpl(JurusanRepository repository){
        this.repository = repository;
    }

    @Override
    public List<JurusanModel> getAll() {
        List<JurusanEntity> result = this.repository.findAll();
        if(result.isEmpty()){
            Collections.emptyList();
        }
        // conver dari List<SiswaEntity> => List<SiswaModel>
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
    public JurusanModel save(JurusanModel data) {
        if(data == null) {
            return new JurusanModel();
        }
        JurusanEntity result= new JurusanEntity(data);
        try{
            // proses simpan data => table siswa
            this.repository.save(result);
            return new JurusanModel(result);
        }catch (Exception e){
            return new JurusanModel();
        }
    }

    @Override
    public JurusanModel update(String id, JurusanModel data) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new JurusanModel();
        }

        // ambil data dari table
        Optional<JurusanEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            JurusanEntity siswaData = result.get();
            // replace data lama dengan dataBaru
            siswaData.setCode(data.getCode());
            siswaData.setName(data.getName());
            siswaData.setFakultasId(data.getFakultasId());
            // update waktu
            siswaData.setUpdatedAt(LocalDateTime.now());
            siswaData.setUpdatedBy("SYSTEM");

            try{
                this.repository.save(siswaData);
                // jika berhasil
                return new JurusanModel(siswaData);
            }catch (Exception e){
                System.out.println("Error update: "+ e.getMessage());
            }
        }
        return new JurusanModel();
    }

    @Override
    public JurusanModel delete(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new JurusanModel();
        }

        // ambil data dari table
        Optional<JurusanEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            try{
                JurusanEntity siswaData = result.get();
                this.repository.delete(siswaData);
                // jika delete berhasil
                return new JurusanModel(siswaData);
            }catch (Exception e){
                System.out.println("Error delete: "+ e.getMessage());
            }
        }
        return new JurusanModel();
    }
}
