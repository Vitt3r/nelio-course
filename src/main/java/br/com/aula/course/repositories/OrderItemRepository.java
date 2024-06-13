package br.com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.course.entities.OrderItem;
import br.com.aula.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}