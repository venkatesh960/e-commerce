package com.example.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "order")
@Getter @Setter
public class Order extends BaseEntity{

	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "total_amount")
	private Double totalAmount;
	
	@Column(name = "number_of_item")
	private Long numberofItem;
	
	
}
