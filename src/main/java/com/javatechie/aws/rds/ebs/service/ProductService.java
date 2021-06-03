package com.javatechie.aws.rds.ebs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.aws.rds.ebs.entity.Product;
import com.javatechie.aws.rds.ebs.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product product) {
		return repository.save(product);				
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}

}
