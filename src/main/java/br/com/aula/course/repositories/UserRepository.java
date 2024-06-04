package br.com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
