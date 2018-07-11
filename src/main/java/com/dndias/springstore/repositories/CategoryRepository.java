package com.dndias.springstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dndias.springstore.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
