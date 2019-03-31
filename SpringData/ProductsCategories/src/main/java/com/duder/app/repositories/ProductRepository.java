package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Category;
import com.duder.app.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
