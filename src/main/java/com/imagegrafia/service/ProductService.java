package com.imagegrafia.service;

import java.util.Arrays;
import java.util.List;

import com.imagegrafia.model.Product;

public class ProductService {

	public List<Product> productList(){
		Product product = new Product();
		product.setId(0);
		product.setName("Laptop");
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		return Arrays.asList(product,product1,product2,product3);
	}
}
