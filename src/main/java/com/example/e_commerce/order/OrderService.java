package com.example.e_commerce.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_commerce.entities.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry orderRepositry;
	
	public Boolean createOrder(OrderDTO orderDTO) {
		Order newOrder=new Order();
		newOrder.setProductId(orderDTO.getProductId());
		newOrder.setTotalAmount(orderDTO.getTotalAmount());
		newOrder.setNumberofItem(orderDTO.getNumberofItem());
		Order save = orderRepositry.save(newOrder);
		if (save==null) {
			return false;
		}
		
		return true;
	}

}
