package com.java.Curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Curso.entities.OrderItem;

	
	public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItem> {

}
