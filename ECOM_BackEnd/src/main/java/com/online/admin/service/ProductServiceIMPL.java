package com.online.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.admin.repository.CategoryRepository;
import com.online.admin.repository.ProductRepository;
import com.online.entity.Category;
import com.online.entity.Product;

@Service
public class ProductServiceIMPL implements Productservice {
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CategoryRepository catRepo;
	@Override
	public boolean isAddProduct(Product product) {
	
		String catName=product.getCategory();
		Category category=catRepo.findCategoryByName(catName);
		
		product.setCategoryid(category);
			Product p=productRepo.save(product);
		if(p!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	
	List<Product> list;
	public List<Product> isGetProductData()
	{
		return list=productRepo.findAll();
	}
	@Override
	public int isDeleteByName(String name) {
		int res=productRepo.isDeleteByName(name);
		return res;
		
	}
}
