package org.capg.springrest.controller;

import java.util.List;

import org.capg.springrest.entities.Product;
import org.capg.springrest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping(value = "/products", consumes = {"application/json"},produces = {"application/json"})
	public Product addProduct(@RequestBody Product product)
	{
		return productservice.addProduct(product);
	}
	
@GetMapping(value = "/products/{id}" , produces = {"application/json"})
public Product getproduct(@PathVariable("id") int id)
{
	Product product= productservice.getProduct(id);
	
    return product;
}

@GetMapping(value = "/products", produces = {"application/json"})
public List<Product> getAllProducts()
{
	return productservice.getAllProduct();
	}
}
