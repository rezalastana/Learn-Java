package com.tech.api.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "product_tab")
public class ProductEntity implements Serializable {

    @Id //primaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment primary key
    private Long id;

    //annotation @NotEmpty
    @NotEmpty(message = "Name is required")
    @Column(name = "product_name",length = 100) //konfigurasi column pada DB
    private String name;

    @NotEmpty(message = "Description is required")
    @Column(name = "product_desc",length = 500)
    private String description;
    private double price;

    //Constructor
    //default constructor
    ProductEntity(){

    }

    ProductEntity(Long id, String name, String description, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //setter getter use lombok
}
