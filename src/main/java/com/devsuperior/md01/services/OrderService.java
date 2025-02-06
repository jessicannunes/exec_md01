package com.devsuperior.md01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.md01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		
		this.shippingService = shippingService;
	}
	
	public Double total(Order order) {
		
		Double valortotal = order.getBasic() - ((order.getDiscount()*order.getBasic()/100)) + shippingService.shipment(order);
		return valortotal;
	}

}
