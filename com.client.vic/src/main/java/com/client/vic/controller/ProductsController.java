package com.client.vic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.vic.entity.Product;
import com.client.vic.repository.ProductsRepository;
import com.client.vic.util.Httpclase;

@RestController
@RequestMapping("/api")
public class ProductsController {

	@GetMapping
	public String getHealht() {
		return "servicio ok";
	}
	
	
private String urlBase = "http://localhost:8090/products/3";
	
	@Autowired
	private ProductsRepository productsRepository;
	
	Httpclase obj1= new Httpclase();
	
	@GetMapping("/test/{id}")
	public String getProducts(@PathVariable String id) {
		
	
	
		Product obj2 = obj1.getGson(urlBase);
		
	    System.out.println("_Entrando al metodo getProducts_");
	   System.out.println("producto" + obj2.getName());
	   
	   productsRepository.save(obj2);
		
		return "servicio ok, se  insert registro a BD Copia";
	}
	
}
