package com.example.springboot.springboot.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

@Entity
@Table(name = "product_ü")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", updatable = false,insertable = true,nullable = false,unique = true)
    private Long id;
    @Column(name = "product_name", length = 100, columnDefinition = "varchar(255) 'You did not enter the product name!'")
    private String name;
    @Column(name = "product_price")
    private String price;

    //persistent field
    @Transient
    private String justJavaDataSpecial;
    @Lob
    private String bigData;
    @Column(name = "created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
