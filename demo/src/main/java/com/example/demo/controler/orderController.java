package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Orderenity.Order;
import com.example.demo.service.Oderservice;

@RestController
@RequestMapping("orders")
public class orderController {
	
	@Autowired
	Oderservice oderservice;
	
	@PostMapping("save")
	public ResponseEntity<Order> saveOrders(@RequestBody Order order){
		
	 Order	ord=oderservice.saveOrders(order);
		return new ResponseEntity<>(ord,HttpStatus.OK);
		
	}

}
