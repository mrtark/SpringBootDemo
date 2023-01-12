package com.example.springboot.springboot.data.repository;

import com.example.springboot.springboot.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
}
