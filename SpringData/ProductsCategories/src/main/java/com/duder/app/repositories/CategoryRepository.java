package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Category;
import com.duder.app.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
