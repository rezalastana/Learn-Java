package com.tech.api.controller;

import com.tech.api.dto.ResponseData;
import com.tech.api.model.entity.ProductEntity;
import com.tech.api.model.repo.ProductRepo;
import com.tech.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    //inject Service
    //controller akan memanggil service, service akan memanggil repository
    @Autowired
    private ProductService productService;

    @PostMapping //digunakan untuk post data
    public ResponseEntity<ResponseData<ProductEntity>> create(@Valid @RequestBody ProductEntity product, Errors errors){ //object yang dikirim adalah product, melalui requestbody
        //validation

        ResponseData<ProductEntity> responseData = new ResponseData();
        if (errors.hasErrors()){ //apakah ada error? jika ada cetak error
            for (ObjectError objectError : errors.getAllErrors()){
                //System.out.println(objectError.getDefaultMessage());
                responseData.getMessage().add(objectError.getDefaultMessage());
            }
            //jika error
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
//            throw new RuntimeException("Validation Error");
        }
        //lolos validasi / menyimpan data
        responseData.setStatus(true);
        responseData.setPayload(productService.save(product));
        return ResponseEntity.ok(responseData);
        //return productService.create(product);
    }

    @GetMapping //get data
    public Iterable<ProductEntity> findAll(){
        return productService.findAll();
    }

    //findOne
    @GetMapping("{id}")
    public ProductEntity findId(@PathVariable("id") Long id){//agar id pada GetMapping terhubung dengan id pada Long id, gunakan @PathVariable
        return productService.findId(id);
    }

    //update, dengan create
    @PutMapping //put digunakan untuk update, namun saat penggunaan tambhakan id
    public ResponseEntity<ResponseData<ProductEntity>> update(@Valid @RequestBody ProductEntity product, Errors errors){
        ResponseData<ProductEntity> responseData = new ResponseData();
        if (errors.hasErrors()){ //apakah ada error? jika ada cetak error
            for (ObjectError objectError : errors.getAllErrors()){
                //System.out.println(objectError.getDefaultMessage());
                responseData.getMessage().add(objectError.getDefaultMessage());
            }
            //jika error
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
//            throw new RuntimeException("Validation Error");
        }
        //lolos validasi / menyimpan data
        responseData.setStatus(true);
        responseData.setPayload(productService.save(product));
        return ResponseEntity.ok(responseData);
        //return productService.create(product);
    }

    //delete byId
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        productService.removeOne(id);
    }
}
