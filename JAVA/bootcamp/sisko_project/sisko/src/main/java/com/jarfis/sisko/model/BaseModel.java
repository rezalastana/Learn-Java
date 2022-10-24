package com.jarfis.sisko.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    @Type(type = "pg-uuid")
    private UUID id;

    @JsonIgnore
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @JsonIgnore
    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @JsonIgnore
    @Column(name = "updated_date", insertable = false)
    private Date updatedDate;

    @JsonIgnore
    @Column(name = "updated_by", insertable = false)
    private String updatedBy;

    @JsonIgnore
    @Column(name = "deleted_date", insertable = false)
    private Date deletedDate;

    @JsonIgnore
    @Column(name = "deleted_by", insertable = false)
    private String deletedBy;

    @Column(name = "active")
    private Boolean active;

    @PrePersist
    protected void onCreated() {
        this.createdDate = new Date();
        this.active = true;
        Authentication principal = SecurityContextHolder.getContext().getAuthentication();
        if (principal != null) {
            Object p = principal.getPrincipal();
            if (p instanceof UserDetails) {
                this.createdBy = ((UserDetails) p).getUsername();
            } else {
                this.createdBy = p.toString();
            }
        }
    }

    @PreUpdate
    protected void onUpdated() {
        this.updatedDate = new Date();
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal != null) {
            if (principal instanceof UserDetails) {
                this.updatedBy = ((UserDetails) principal).getUsername();
            } else {
                this.updatedBy = principal.toString();
            }
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
