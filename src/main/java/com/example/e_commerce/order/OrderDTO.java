package com.example.e_commerce.order;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderDTO {

	private Long productId;
	private Double totalAmount;
	private Long numberofItem;
}
