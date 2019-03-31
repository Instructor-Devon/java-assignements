package com.duder.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duder.app.models.Association;
import com.duder.app.models.Category;
import com.duder.app.models.Product;
import com.duder.app.repositories.AssociationRepoistory;
import com.duder.app.repositories.CategoryRepository;
import com.duder.app.repositories.ProductRepository;

@Service
public class AppService {
	private final ProductRepository pRepo;
	private final CategoryRepository cRepo;
	private final AssociationRepoistory aRepo;
	public AppService(ProductRepository pRepo, CategoryRepository cRepo, AssociationRepoistory aRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
		this.aRepo = aRepo;
	}
	public List<Product> findProducts() {
		return this.pRepo.findAll();
	}
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Category> findCategories() {
		return this.cRepo.findAll();
	}
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Association createAssociation(Association ass) {
		return this.aRepo.save(ass);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
}
