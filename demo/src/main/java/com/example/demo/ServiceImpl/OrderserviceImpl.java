package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Orderenity.Order;
import com.example.demo.Orderrepository.Orderrepository;
import com.example.demo.service.Oderservice;
@Service
public class OrderserviceImpl implements Oderservice {
	
	@Autowired
	Orderrepository orderrepository;

	@Override
	public Order saveOrders(Order order) {
		Order orr=orderrepository.save(order);
		
		return orr;
	}

}
