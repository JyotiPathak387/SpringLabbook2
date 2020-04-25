package org.capg.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.capg.springrest.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	private static List<Product> products = new ArrayList<>();
	static 
	{
		Product p1=new Product(101, "Laptop", 45678.34);
		Product p2=new Product(102, "IPad", 65678.84);
		Product p3=new Product(103, "IPhone", 84678.34);
		Product p4=new Product(104, "Hard Disk", 5000.34);
		Product p5=new Product(105, "Samsung Tab", 75678.0);
		Product p6=new Product(106, "Adapter", 4000.0);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
	}
	@Override
	public Product addProduct(Product product) {
		products.add(product);
		return product;
	}

	@Override
	public Product getProduct(int id) {
		Product product = null;
		for(Product p : products)
		{
			if(p.getId() == id)
			{
				product = p;
				break;
			}
		}
		
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
	
		return products;
	}

}
