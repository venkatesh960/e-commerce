package com.example.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "product")
@Getter @Setter
public class Product extends BaseEntity {

	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "category")
	private String productCategroy;
	
	@Column(name = "price")
	private Double productPrice;
	
	@Column(name = "stock")
	private Long stock;
	
	
	
}
