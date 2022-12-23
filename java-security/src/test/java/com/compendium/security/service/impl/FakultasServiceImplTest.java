package com.compendium.security.service.impl;

import com.compendium.security.entity.FakultasEntity;
import com.compendium.security.model.FakultasModel;
import com.compendium.security.repository.FakultasRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class FakultasServiceImplTest {
    @Autowired
    @InjectMocks
    private FakultasServiceImpl service;

    @Mock
    private FakultasRepo repo;

    private static List<FakultasEntity> fakultasEntityList;

    @BeforeEach
    void setUp() {
        fakultasEntityList = Arrays.asList(
                new FakultasEntity("FK", "Fakultas Kesehatan", "Jogja"),
                new FakultasEntity("FT", "Fakultas Teknik", "Jogja"),
                new FakultasEntity("FG", "Fakultas Gigi", "Jogja")
        );
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
        //jika method repo.findAll di panggi maka kembalikan nilai Entity List
        //mocking
        when(repo.findAll()).thenReturn(fakultasEntityList);

        //test method get
        List<FakultasModel> result = service.getAll();
        // check 1
        assertNotNull(result);
        // check 2
        assertEquals(3, result.size());
        // check data 0
        assertEquals("FK", result.get(0).getCode());
        assertEquals("Fakultas Kesehatan", result.get(0).getName());

        // check data salah
        assertNotEquals("FK", result.get(1).getCode());
    }

    @Test
    void getById() {
        //skenario 1
        FakultasModel result = service.getById("");//null

        assertNotNull(result);
        assertNull(result.getCode());

        //skenario 2
        Optional<FakultasEntity> entity = Optional.of(fakultasEntityList.get(0));
        //mocking
        when(repo.findById(any(String.class))).thenReturn(entity);

        result = service.getById("FK");
        assertNotNull(result);
        assertEquals("FK", result.getCode());
    }

    @Test
    void save() {
        FakultasModel request = new FakultasModel("FG", "Fakultas Gigi", "Jogja");
        //mocking
        when(repo.save(any(FakultasEntity.class))).thenReturn(fakultasEntityList.get(2));

        Optional<FakultasModel> result = service.save(request);
        assertNotNull(result);
    }

    @Test
    void update() {
        //Data
        FakultasModel request = new FakultasModel("FK", "Fakultas Kesehatan", "Bantul");
        Optional<FakultasEntity> entity = Optional.of(fakultasEntityList.get(0));

        //Skenario 1
        Optional<FakultasModel> result1 = service.update("", null);
        assertNotNull(result1);
        assertEquals(Optional.empty(), result1);

        //Mocking
        when(repo.findById(any(String.class))).thenReturn(entity);
        when(repo.save(any(FakultasEntity.class))).thenReturn(fakultasEntityList.get(0));

        //Skenario 2
        Optional<FakultasModel> result2 = service.update("123", request);
        assertNotNull(result2);
        assertNotEquals(Optional.empty(), result2);
        assertTrue(result2.isPresent());

        assertEquals("FK", result2.get().getCode());
        assertEquals("Fakultas Kesehatan", result2.get().getName());
        assertEquals("Bantul", result2.get().getAlamat());

    }

    @Test
    void delete() {
        Optional<FakultasEntity> entity = Optional.of(fakultasEntityList.get(0));

        //Skenario 1
        Optional<FakultasModel> result1 = service.delete("");
        assertNotNull(result1);
        assertEquals(Optional.empty(), result1);
        assertTrue(result1.isEmpty());

        //Mocking
        when(repo.findById(any(String.class))).thenReturn(entity);

        //Skenario 2
        //delete by id
        Optional<FakultasModel> result2 = service.delete("123");
        assertNotNull(result2);
        assertNotEquals(Optional.empty(), result2);
        assertTrue(result2.isPresent());
    }
}