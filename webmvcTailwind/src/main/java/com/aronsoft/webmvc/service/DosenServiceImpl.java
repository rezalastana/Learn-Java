package com.aronsoft.webmvc.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aronsoft.webmvc.model.DosenModel;
import com.aronsoft.webmvc.repository.DosenRepo;

@Service
public class DosenServiceImpl implements DosenService {
    private DosenRepo repository;
    @Autowired
    public DosenServiceImpl(DosenRepo repository){
        this.repository = repository;
    }

    @Override
    public List<DosenModel> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DosenModel getById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<DosenModel> save(DosenModel data) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<DosenModel> update(String id, DosenModel data) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<DosenModel> delte(String id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
