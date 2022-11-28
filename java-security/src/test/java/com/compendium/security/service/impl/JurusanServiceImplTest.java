package com.compendium.security.service.impl;

import com.compendium.security.entity.JurusanEntity;
import com.compendium.security.repository.JurusanRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JurusanServiceImplTest {

    @Autowired
    @InjectMocks
    private JurusanServiceImpl service;

    @Mock
    private JurusanRepo repo;

    private  static List<JurusanEntity> jurusanEntityList;

    @BeforeEach
    void setUp() {
        jurusanEntityList = Arrays.asList(

        );
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getById() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}