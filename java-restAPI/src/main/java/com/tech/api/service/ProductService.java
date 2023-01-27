package com.tech.api.service;

import com.tech.api.model.entity.ProductEntity;
import com.tech.api.model.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    //inject to repo
    //sercice akan memanggil repository
    @Autowired
    private ProductRepo productRepo;

    //create
    public ProductEntity save(ProductEntity product){
        return productRepo.save(product);
    }

    //find one byId
    public ProductEntity findId(Long id){
        //return Optional
        Optional<ProductEntity> temp = productRepo.findById(id); //handling untuk id yang sudah terhapus
        if (temp.isEmpty()){ //jika temp tidak ada
            return null; //kembalikan nilai null
        }
        return productRepo.findById(id).get();
    }

    //findALl
    public Iterable<ProductEntity> findAll(){
        return productRepo.findAll();
    }

    //delete
    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    //findByName dari repo custom
    public List<ProductEntity> findByName(String name){
        return productRepo.findByNameContains(name);
    }


}
