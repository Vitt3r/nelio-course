package br.com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
