package org.capg.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PageController {

	@RequestMapping("/showPage")
	public String showPage()
	{
		return "register-product";
	}
	
	@RequestMapping("/viewPage")
	public String viewPage()
	{
		return "find-product";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product,ModelMap modelMap)
	{
	String uri = "http://localhost:8095/SpringRest/products";
	RestTemplate restTemplate = new RestTemplate();
	Product savedProduct=restTemplate.postForObject(uri, product, Product.class);
    modelMap.addAttribute("mssg","Product is added successfully with id "+savedProduct.getId());
    return "register-product";
	}
	
	@RequestMapping("/viewProduct")
	public String viewProduct(@ModelAttribute("productId") Product productId,ModelMap modelMap)
	{
	String uri = "http://localhost:8095/SpringRest/products";
	RestTemplate restTemplate = new RestTemplate();
	Product product=restTemplate.getForObject(uri+"/" +productId, Product.class);
    modelMap.addAttribute("Product" +product);
    return "show-product";
	}
	
}
