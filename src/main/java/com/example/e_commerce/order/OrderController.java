package com.example.e_commerce.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/e-commerece/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/createOrder")
	private Boolean createOrder(@RequestBody OrderDTO orderDTO) {
	
		return orderService.createOrder(orderDTO);
	}
	

	
}
