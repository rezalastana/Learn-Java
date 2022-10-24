package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.DosenEntity;
import com.aronsoft.database.database.model.DosenModel;
import com.aronsoft.database.database.repository.DosenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DosenServiceImpl implements DosenService {
    private DosenRepository repository;

    @Autowired
    public DosenServiceImpl(DosenRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DosenModel> getAll() {
        List<DosenEntity> result = this.repository.findAll();

        if (result.isEmpty()) {
            Collections.emptyList();
        }
        //convert data dari List<DosenEntity> ke List<DosenModel>
        return result.stream().map(DosenModel::new).collect(Collectors.toList());
    }

    @Override
    public DosenModel getById(String id) {
        //check id terlebih dahulu
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new DosenModel();
        }
        Optional<DosenEntity> result = repository.findById(id);
        //convert dari DosenEntity ke DosenModel
        return result.map(DosenModel::new).orElseGet(DosenModel::new);
    }

    @Override
    public DosenModel save(DosenModel data) {
        if (data == null) {
            return new DosenModel();
        }
        DosenEntity result = new DosenEntity(data);
        try {
            //proses simpan data ke database
            this.repository.save(result);
            return new DosenModel(result);
        } catch (Exception e) {
            return new DosenModel();
        }
    }

    @Override
    public DosenModel update(String id, DosenModel data) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new DosenModel();
        }
        //ambil data dari table
        Optional<DosenEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()) {
            DosenEntity dosenData = result.get();
            //replace data lama dengan yang baru
            dosenData.setName((data.getName()));
            dosenData.setAlamat(data.getAlamat());
            dosenData.setJk(data.getJk());
            //update waktu
            dosenData.setUpdatedAt(LocalDateTime.now());
            dosenData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(dosenData);
                //jika berhasil
                return new DosenModel(dosenData);
            } catch (Exception e) {
                System.out.println("Error update: " + e.getMessage());
            }
        }
        return new DosenModel();
    }

    @Override
    public DosenModel delete(String id) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new DosenModel();
        }

        //ambil data dari table
        Optional<DosenEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()) {
            try {
                DosenEntity dosenData = result.get();
                this.repository.delete(dosenData);
                // jika delete berhasil
                return new DosenModel(dosenData);
            } catch (Exception e) {
                System.out.println("Error detele: " + e.getMessage());
            }
        }
        return new DosenModel();
    }
}
