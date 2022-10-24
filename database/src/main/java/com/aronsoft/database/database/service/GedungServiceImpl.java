package com.aronsoft.database.database.service;

import com.aronsoft.database.database.entity.GedungEntity;
import com.aronsoft.database.database.model.DosenModel;
import com.aronsoft.database.database.model.GedungModel;
import com.aronsoft.database.database.repository.GedungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GedungServiceImpl implements GedungService{
    private GedungRepository repository;

    @Autowired
    public GedungServiceImpl(GedungRepository repository){
        this.repository = repository;
    }

    @Override
    public List<GedungModel> getAll() {
        List<GedungEntity> result = this.repository.findAll();

        if (result.isEmpty()){
            Collections.emptyList();
        }
        //convert
        return result.stream().map(GedungModel::new).collect(Collectors.toList());
    }

    @Override
    public GedungModel getById(String id) {
        //check id
        if (id==null ||id.isBlank()||id.isEmpty()){
            return new GedungModel();
        }
        Optional<GedungEntity> result = repository.findById(id);
        //convert
        return result.map(GedungModel::new).orElseGet(GedungModel::new);
    }

    @Override
    public GedungModel save(GedungModel data) {
        //check id
        if (data == null){
            return new GedungModel();
        }
        GedungEntity result = new GedungEntity(data);
        try {
            //simpan
            this.repository.save(result);
            return new GedungModel(result);
        } catch (Exception e){
            return new GedungModel();
        }
    }

    @Override
    public GedungModel udpate(String id, GedungModel data) {
        //check id
        if (id==null|id.isEmpty()||id.isBlank()){
            return new GedungModel();
        }
        //ambil data
        Optional<GedungEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()){
            GedungEntity gedungData = result.get();
            //replace data dengan data yang baru
            gedungData.setCode((data.getCode()));
            gedungData.setName((data.getName()));
            gedungData.setJmlLantai((data.getJmlLantai()));
            //update waktu
            gedungData.setUpdatedAt(LocalDateTime.now());
            gedungData.setUpdatedBy("SYSTEM");

            try{
                this.repository.save(gedungData);
                //jika berhasil
                return new GedungModel(gedungData);
            } catch (Exception e){
                System.out.println("Error update " + e.getMessage());
            }
        }
        return new GedungModel();
    }

    @Override
    public GedungModel delete(String id) {
        //check id
        if (id==null||id.isBlank()||id.isEmpty()){
            return new GedungModel();
        }

        //ambil data dari table
        Optional<GedungEntity> result = repository.findById(id);
        //check result
        if (result.isPresent()){
            try {
                GedungEntity gedungData = result.get();
                this.repository.delete(gedungData);
                //jika berhasil delete
                return new GedungModel(gedungData);
            } catch (Exception e){
                System.out.println("Error delete " + e.getMessage());
            }
        }
        return new GedungModel();
    }
}
