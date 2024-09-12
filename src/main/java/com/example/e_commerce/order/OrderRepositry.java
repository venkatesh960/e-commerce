package com.example.e_commerce.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entities.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Long> {

}
