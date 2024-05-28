package com.java.Curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Curso.entities.Category;

	
	
	public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}
