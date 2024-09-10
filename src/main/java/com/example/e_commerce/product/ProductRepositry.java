package com.example.e_commerce.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entities.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product,Long> {

    List<Product> findByProductCategroy(String category);

    List<Product> findByProductPriceLessThan(Double price);

}
