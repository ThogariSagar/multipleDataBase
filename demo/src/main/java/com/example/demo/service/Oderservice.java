package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Orderenity.Order;

@Service
public interface Oderservice {

	Order saveOrders(Order order);

}
