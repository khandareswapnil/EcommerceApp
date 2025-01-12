package com.online.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.online.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@Query("select c from Category c where c.category_name = :catName")
	Category findCategoryByName(@Param("catName") String catName);


}
