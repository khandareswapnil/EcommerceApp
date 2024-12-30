package com.online.admin.service;

import java.util.List;

import com.online.entity.Category;

public interface CategoryService {
	public boolean isAddCategory(Category category);
	public List<Category> isGetCategory();

}
