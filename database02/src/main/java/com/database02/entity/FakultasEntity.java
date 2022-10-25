package com.database02.entity;

import com.database02.model.FakultasModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "fakultas_tab")
public class FakultasEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "kode_fakultas", length = 20, unique = true)
    private String code;

    @Column(name = "nama_fakultas", length = 225)
    private String name;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

    @OneToMany(mappedBy = "fakultas", fetch = FetchType.EAGER)
    private Set<JurusanEntity> jurusans;

    //constructor
    public FakultasEntity(){

    }
    public FakultasEntity(String id){
        this.id = id;
    }
    public FakultasEntity(FakultasModel data){
        BeanUtils.copyProperties(data, this);
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.createdBy = "SYSTEM";
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "SYSTEM";
    }
}
