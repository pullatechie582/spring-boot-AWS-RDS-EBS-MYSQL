package com.javatechie.aws.rds.ebs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.aws.rds.ebs.entity.Product;
import com.javatechie.aws.rds.ebs.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		return service.getProducts();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product){
		return service.addProduct(product);
	
	}

}
