package com.example.springboot.springboot.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter

@MappedSuperclass
public class BaseEntity implements Serializable {
    public static final Long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,insertable = true,nullable = false,unique = true)
    private Long id;
    @Column(name = "created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    //audit
    @CreatedBy
    @Column(name = "created_user")
    private String createdUser;
    @CreatedDate
    @Column(name = "created_user_date")
    private Date createdUserDate;
    @LastModifiedBy
    @Column(name = "updated_user")
    private String updatedUser;
    @LastModifiedDate
    @Column(name = "updated_user_date")
    private String updatedUserDate;
}
