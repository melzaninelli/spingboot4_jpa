package com.java.Curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.Curso.Repositories.UserRepository;
import com.java.Curso.entities.User;

public class UserService {

	
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();
	}
	
	
}
