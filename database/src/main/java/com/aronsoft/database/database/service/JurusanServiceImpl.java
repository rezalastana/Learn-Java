package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.JurusanEntity;
import com.aronsoft.database.database.model.JurusanModel;
import com.aronsoft.database.database.repository.JurusanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JurusanServiceImpl implements JurusanService {
    private JurusanRepository repository;

    @Autowired
    public JurusanServiceImpl(JurusanRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<JurusanModel> getAll() {
        List<JurusanEntity> result = this.repository.findAll();

        if (result.isEmpty()) {
            Collections.emptyList();
        }
        //convert
        return result.stream().map(JurusanModel::new).collect(Collectors.toList());
    }

    @Override
    public JurusanModel getById(String id) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new JurusanModel();
        }
        Optional<JurusanEntity> result = repository.findById(id);
        //convert
        return result.map(JurusanModel::new).orElseGet(JurusanModel::new);
    }

    @Override
    public JurusanModel save(JurusanModel data) {
        if (data == null) {
            return new JurusanModel();
        }
        JurusanEntity result = new JurusanEntity(data);
        try {
            //proses simpan
            this.repository.save(result);
            return new JurusanModel(result);
        } catch (Exception e) {
            return new JurusanModel();
        }
    }

    @Override
    public JurusanModel update(String id, JurusanModel data) {
        //check id
        if (id == null || id.isEmpty() || id.isBlank()) {
            return new JurusanModel();
        }
        //ambil data dari table
        Optional<JurusanEntity> result = repository.findById(id);
        if (result.isPresent()) {
            JurusanEntity jurusanData = result.get();
            //masukkan data baru
            jurusanData.setCode((data.getKode_jurusan()));
            jurusanData.setName((data.getNama_jurusan()));
            jurusanData.setFakultasId((data.getFakultas_id()));
            //update waktu
            jurusanData.setUpdatedAt(LocalDateTime.now());
            jurusanData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(jurusanData);
                //jika berhasil
                return new JurusanModel();
            } catch (Exception e) {
                System.out.println("Error update " + e.getMessage());
            }
        }
        return new JurusanModel();
    }

    @Override
    public JurusanModel delete(String id) {
        //check
        if (id == null||id.isEmpty()||id.isBlank()){
            return new JurusanModel();
        }
        //ambil data
        Optional<JurusanEntity> result = repository.findById(id);
        //check dari result
        if (result.isPresent()){
            try {
                JurusanEntity jurusanData = result.get();
                this.repository.delete(jurusanData);
                //jika berhasil delete
                return new JurusanModel(jurusanData);
            } catch (Exception e){
                System.out.println("Error delete " + e.getMessage());
            }
        }
        return new JurusanModel();
    }
}
