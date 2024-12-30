package com.online.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.admin.service.CategoryService;
import com.online.entity.Category;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	private List list;
	
	@PostMapping("/isAddCategory")
	public String isAddCategory(@RequestBody Category category)
	{
		boolean b=categoryService.isAddCategory(category);
		if(b)
		{
			return "sucess";
		}
		else
		{
			return "UnSucess";
		}
	}
	
	@GetMapping("/isGetCategory")
	public List<Category> isGetCategory()
	{
		return list=categoryService.isGetCategory();
	}

}
