package com.imagegrafia.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.imagegrafia.model.Product;

public class TestProductService {
	List<Product> list = new ArrayList<Product>();
//	METHOD 1
//	ProductService productService = mock(ProductService.class); 
	
	//METHOD 2
	@Rule public MockitoRule rule=MockitoJUnit.rule();
	@Mock
	ProductService productService;
	
	

	@Before
	public void setUp() {
		Product product = new Product();
		product.setId(0);
		product.setName("Laptop");
		list.add(product);
	}

	@Test
	public void testListProduct() {
		when(productService.productList()).thenReturn(list);
		assertEquals(list, productService.productList());
		verify(productService).productList();
	}
}
