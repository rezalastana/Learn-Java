package com.compendium.security.service.impl;

import com.compendium.security.entity.DosenEntity;
import com.compendium.security.model.DosenModel;
import com.compendium.security.repository.DosenRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DosenServiceImplTest {
    @Autowired
    @InjectMocks
    private DosenServiceImpl service;

    @Mock
    private DosenRepo repo;

    private static List<DosenEntity> dosenEntityList;

    @BeforeEach
    void setUp() {
        dosenEntityList = Arrays.asList(
                new DosenEntity("12311","Bayu","Laki-laki","Sleman","S.Kom"),
                new DosenEntity("12312", "Ayu", "Perempuan", "Yogyakarta", "S.T" ),
                new DosenEntity("12313", "Bambang", "Laki-laki", "Sleman", "M.T")
        );
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
        //jika method repo.findAll di panggi maka kembalikan nilai Entity List
        //mocking
        when(repo.findAll()).thenReturn(dosenEntityList);

        //test method get
        List<DosenModel> result = service.getAll();
        // check 1
        assertNotNull(result);
        // check 2
        assertEquals(3, result.size());
        // check data 0
        assertEquals("12311", result.get(0).getNip());
        assertEquals("Bayu", result.get(0).getName());

        // check data salah
        assertNotEquals("1213", result.get(1).getNip());
    }

    @Test
    void getById() {
        //skenario 1
        DosenModel result = service.getById(""); //dengan nilai null

        assertNotNull(result);
        assertNull(result.getNip());

        //skenario 2
        Optional<DosenEntity> entity = Optional.of(dosenEntityList.get(0));
        //mocking
        when(repo.findById(any(String.class))).thenReturn(entity);

        result = service.getById("12311");
        assertNotNull(result);
        assertEquals("12311", result.getNip());
    }

    @Test
    void save() {
        DosenModel request = new DosenModel("12313", "Bambang", "Laki-laki", "Sleman", "M.T");

        //mocking
        when(repo.save(any(DosenEntity.class))).thenReturn(dosenEntityList.get(2));

        Optional<DosenModel> result = service.save(request);
        assertNotNull(result);
        assertEquals("12313", result.get().getNip());
        assertEquals("Bambang", result.get().getName());
        assertEquals("Laki-laki", result.get().getJk());
        assertEquals("Sleman", result.get().getAlamat());
        assertEquals("M.T", result.get().getGelar());
    }

    @Test
    void update() {
        //Masukkan data update
        DosenModel request = new DosenModel("12313", "Bambang", "Laki-laki", "Bantul", "S.T");
        Optional<DosenEntity> entity = Optional.of(dosenEntityList.get(2));

        //Skenario 1
        Optional<DosenModel> result1 = service.update("", null);
        assertNotNull(result1); //NotNull
        assertEquals(Optional.empty(), result1); //Apa yang diinginkan, apa yang dikehendaki

        //Mocking
        when(repo.findById(any(String.class))).thenReturn(entity);
        when(repo.save(any(DosenEntity.class))).thenReturn(dosenEntityList.get(2));

        //Skenario 2
        //ada data update
        Optional<DosenModel> result2 = service.update("222", request);
        assertNotNull(result2);
        assertNotEquals(Optional.empty(), result2);
        assertTrue(result2.isPresent());

        assertEquals("12313", result2.get().getNip());
        assertEquals("Bambang", result2.get().getName());
        assertEquals("Laki-laki", result2.get().getJk());
        assertEquals("Bantul", result2.get().getAlamat());
        assertEquals("S.T", result2.get().getGelar());


    }

    @Test
    void delete() {
        Optional<DosenEntity> entity = Optional.of(dosenEntityList.get(0));

        //Skenario 1
        Optional<DosenModel> result1  = service.delete("");
        assertNotNull(result1);
        assertEquals(Optional.empty(), result1);
        assertTrue(result1.isEmpty());

        //Mocking
        when(repo.findById(any(String.class))).thenReturn(entity);

        //Skenario 2
        //ada id delete
        Optional<DosenModel> result2 = service.delete("222");
        assertNotNull(result2);
        assertNotEquals(Optional.empty(), result2);
        assertTrue(result2.isPresent());

    }
}