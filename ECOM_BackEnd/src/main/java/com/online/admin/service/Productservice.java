package com.online.admin.service;

import com.online.entity.Product;

public interface Productservice {
	public boolean isAddProduct(Product product);

	public java.util.List<Product> isGetProductData();
	public int isDeleteByName(String name);

}
