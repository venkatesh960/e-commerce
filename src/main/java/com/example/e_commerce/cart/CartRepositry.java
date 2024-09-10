package com.example.e_commerce.cart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.e_commerce.entities.Cart;

public interface CartRepositry extends JpaRepository<Cart,Long> {


}