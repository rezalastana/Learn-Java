package com.tech.api.model.repo;

import com.tech.api.model.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<ProductEntity, Long> { //salah satu interface repository SpringData -> CrudRepository;
    // <FileEntity, PrimaryKey-datatype>
    // secara otomatis sudah membuat CRUD, simple bukan?

    //membuat function sendiri (custom function
    List<ProductEntity> findByNameContains(String name);
}
