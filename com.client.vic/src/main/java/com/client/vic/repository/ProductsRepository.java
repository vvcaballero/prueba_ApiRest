package com.client.vic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.vic.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Long>{

}
