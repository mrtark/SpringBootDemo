package com.example.springboot.springboot.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

//@RequiredArgsConstructer - //for inject

@Entity
@Table(name = "product_ü")
public class ProductEntity extends BaseEntity implements Serializable {
    public static final Long serialVersionUID=1L;
    @Column(name = "product_name", length = 100, columnDefinition = "varchar(255) 'You did not enter the product name!'")
    private String name;
    @Column(name = "product_price")
    private String price;
    //persistent field
    @Transient
    private String justJavaDataSpecial;
    @Lob
    private String bigData;
    @Column(name = "product_codes")
    private String codes;
    @Column(name = "product_emailAddres")
    private String emailAddres;

}
