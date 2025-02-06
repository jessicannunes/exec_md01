package com.devsuperior.md01.services;

import org.springframework.stereotype.Service;

import com.devsuperior.md01.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		Double value = order.getBasic();
		
		if(value < 100.00) {
			return 20.00;
		}
		else if(value >= 100.00 || value <= 200.00) {
			return 12.00;
		}
		else {
			return value;
		}
		
	}

}
