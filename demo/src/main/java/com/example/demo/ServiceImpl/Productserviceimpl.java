package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enity.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.Productservice;
@Service
public class Productserviceimpl  implements Productservice{
	@Autowired
	ProductRepo productRepo;

	@Override
	public Product saveProducts(Product product) {
	Product	 prod=productRepo.save(product);
		return prod ;
	}

}
