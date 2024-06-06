package br.com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
