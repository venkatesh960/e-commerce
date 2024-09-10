package com.example.e_commerce.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entities.Cart;

@Repository
public interface CartRepositry extends JpaRepository<Cart,Long> {


}