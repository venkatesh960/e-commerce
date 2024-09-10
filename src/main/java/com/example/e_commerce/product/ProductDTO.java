package com.example.e_commerce.product;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {

    private String productName;
    private Double price;
    private Long stock;
    private String category;

}
