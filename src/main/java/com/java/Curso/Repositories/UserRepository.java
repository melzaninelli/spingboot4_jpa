package com.java.Curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
