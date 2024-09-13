package com.example.restApi.repository;

import com.example.restApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
