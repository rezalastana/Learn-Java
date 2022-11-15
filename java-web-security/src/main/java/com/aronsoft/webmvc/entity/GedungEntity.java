package com.aronsoft.webmvc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "gedung_tab")
public class GedungEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "code", length = 20, unique = true)
    private String code;
    @Column(name = "name", length = 225)
    private String name;
    @Column(name = "jmlLantai", length = 36)
    private String jmlLantai;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "created_by", length = 20)
    private String createdBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "updated_by", length = 20)
    private String updatedBy;
    @OneToMany(mappedBy = "gedung", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RuangEntity> ruangan = new HashSet<>();
}
