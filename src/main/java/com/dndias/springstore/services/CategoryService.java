package com.dndias.springstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dndias.springstore.domain.Category;
import com.dndias.springstore.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category search(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
