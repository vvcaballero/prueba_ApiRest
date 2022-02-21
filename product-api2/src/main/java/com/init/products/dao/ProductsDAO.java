package com.init.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.init.products.entitys.Product;
// #################REPOSITORIO##########################3
//   ################  JPA   permite acceder a los datos ######
public interface ProductsDAO extends JpaRepository<Product,Long> {

}
