package com.online.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.admin.service.Productservice;
import com.online.entity.Category;
import com.online.entity.Product;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddDataAtHome {
	@Autowired
	private Productservice proService;
	@PostMapping("/addProduct")
	public String isAddProduct(@RequestBody Product product)
	{
		boolean b=proService.isAddProduct(product);
				if(b)
				{
					return "sucess";
				}
				else
				{
					return "unsucess";
				}
	}
	
	@GetMapping("/isGetProductData")
	public List<Product> isGetProductData(){
		return proService.isGetProductData();
	}
	
	@DeleteMapping("/deleteByName/{name}")
	public String isDeletedData(@PathVariable String name)
	{
		int res=proService.isDeleteByName(name);
		if(res>0)
		{
			return "Sucess";
		}
		else
		{
			return "Unsucess";
		}
		
	}
	
	
	
	

}
