package com.aronsoft.webmvc.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.*;
import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.aronsoft.webmvc.model.MataKuliahModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "matkul_tab")
public class MataKuliahEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "kode_matkul", length = 20, unique = true)
    private String code;

    @Column(name = "nama_matkul", length = 225)
    private String name;

    @Column(name = "sks")
    private Integer sks;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

    public MataKuliahEntity() {

    }

    public MataKuliahEntity(MataKuliahModel model) {
        BeanUtils.copyProperties(model, this);
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.createdBy = "SYSTEM";
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "SYSTEM";
    }


}
