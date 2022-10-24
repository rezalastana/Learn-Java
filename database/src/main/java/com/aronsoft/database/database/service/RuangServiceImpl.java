package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.RuangEntity;
import com.aronsoft.database.database.model.RuangModel;
import com.aronsoft.database.database.repository.RuangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RuangServiceImpl implements RuangService {
    private RuangRepository repository;

    @Autowired
    public RuangServiceImpl(RuangRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RuangModel> getAll() {
        List<RuangEntity> result = this.repository.findAll();
        if (result.isEmpty()) {
            Collections.emptyList();
        }
        //convert data dari ListEntity ke ListModel
        return result.stream().map(RuangModel::new).collect(Collectors.toList());
    }

    @Override
    public RuangModel getById(String id) {
        //check id
        if (id == null || id.isEmpty() || id.isBlank()) {
            return new RuangModel();
        }
        Optional<RuangEntity> result = repository.findById(id);
        //convert
        return result.map(RuangModel::new).orElseGet(RuangModel::new);
    }

    @Override
    public RuangModel save(RuangModel data) {
        //check data
        if (data == null) {
            return new RuangModel();
        }
        RuangEntity result = new RuangEntity(data);
        try {
            //simpan data baru
            this.repository.save(result);
            return new RuangModel(result);
        } catch (Exception e) {
            return new RuangModel();
        }
    }

    @Override
    public RuangModel update(String id, RuangModel data) {
        //check id
        if (id == null || id.isBlank() || id.isEmpty()) {
            return new RuangModel();
        }
        Optional<RuangEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()) {
            RuangEntity ruangData = result.get();
            ruangData.setCode((data.getCode()));
            ruangData.setName((data.getName()));
            ruangData.setGedungId(data.getGedungId());
            ruangData.setLantaiKe((data.getLantaiKe()));
            //update waktu
            ruangData.setUpdatedAt(LocalDateTime.now());
            ruangData.setUpdatedBy("SYSTEM");
            try {
                this.repository.save(ruangData);
                //jika berhasil
                return new RuangModel(ruangData);
            } catch (Exception e) {
                System.out.println("Error udpate " + e.getMessage());
            }
        }
        return new RuangModel();
    }

    @Override
    public RuangModel delete(String id) {
        //check
        if (id==null||id.isEmpty()||id.isBlank()){
            return new RuangModel();
        }
        //ambil data dari table
        Optional<RuangEntity> result = repository.findById(id);
        //check data darir result
        if (result.isPresent()){
            try {
                RuangEntity ruangData = result.get();
                this.repository.delete(ruangData);
                //jika berhasil delete
                return new RuangModel(ruangData);
            } catch (Exception e){
                System.out.println("Error delete "+e.getMessage());
            }
        }
        return new RuangModel();
    }
}
