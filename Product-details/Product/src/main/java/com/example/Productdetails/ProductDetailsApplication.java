package com.example.Productdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Productdetails.dao.ProductRepository;
import com.example.Productdetails.model.Product;

@SpringBootApplication
public class ProductDetailsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
	}
	
	@Autowired
	ProductRepository productRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		productRepo.save(new Product("Laptop",40000,"Electronic Device"));
		productRepo.save(new Product("Hard disk",6000,"Electronic Device"));
		productRepo.save(new Product("Mobile Phones",15000,"Electronic Device"));
		productRepo.save(new Product("Tablets",25000,"Electronic Device"));
		productRepo.save(new Product("Notebook Computers",60000,"Electronic Device"));
		
		
	}

}

