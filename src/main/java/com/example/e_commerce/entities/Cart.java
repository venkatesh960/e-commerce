package com.example.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="cart")
@Getter @Setter
public class Cart extends BaseEntity {

    @Column(name="product_name")
    private String productName;

    @Column(name="number_of_items")
    private String numberofItem;

}
