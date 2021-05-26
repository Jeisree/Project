package com.example.Productdetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Productdetails.dao.ProductRepository;
import com.example.Productdetails.model.Product;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/productslist")
	public List<Product> listOfProducts() {
		
		return productRepo.findAll();
		 			
		
	}

}
