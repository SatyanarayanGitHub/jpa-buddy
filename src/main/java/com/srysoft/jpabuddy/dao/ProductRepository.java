package com.srysoft.jpabuddy.dao;

import com.srysoft.jpabuddy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}