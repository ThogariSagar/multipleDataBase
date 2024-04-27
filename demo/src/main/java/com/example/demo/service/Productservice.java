package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.enity.Product;

@Service
public interface Productservice {

	Product saveProducts(Product product);

}
