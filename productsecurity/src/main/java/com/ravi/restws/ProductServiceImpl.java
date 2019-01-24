package com.ravi.restws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products=new ArrayList<>();
	private long id=123;
	ProductServiceImpl(){
		Product product=new Product();
		product.setId(id++);
		product.setDiscription("Hi");
		products.add(product);
	}
	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public  List<Product> addProduct(Product product) {
		product.setId(++id);
		products.add(product);
		return products;
	}

}
