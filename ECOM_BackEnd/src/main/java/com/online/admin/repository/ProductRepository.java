package com.online.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.online.entity.Product;

import jakarta.transaction.Transactional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Transactional 
	@Modifying
	@Query("Delete from Product p where p.name=:name")
	public int isDeleteByName(@Param("name") String name);
}
