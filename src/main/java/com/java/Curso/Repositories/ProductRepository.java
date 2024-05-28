package com.java.Curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
