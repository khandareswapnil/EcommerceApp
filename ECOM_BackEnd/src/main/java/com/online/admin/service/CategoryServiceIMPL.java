package com.online.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.admin.repository.CategoryRepository;
import com.online.entity.Category;
@Service
public class CategoryServiceIMPL implements CategoryService {

	@Autowired
	private CategoryRepository categoryService;
	@Override
	public boolean isAddCategory(Category category) {
		Category c=categoryService.save(category);
		return c!=null?true:false;
	}
	
	private List list;
	@Override
	public List<Category> isGetCategory() {
		
		return list=categoryService.findAll();
	}

}
