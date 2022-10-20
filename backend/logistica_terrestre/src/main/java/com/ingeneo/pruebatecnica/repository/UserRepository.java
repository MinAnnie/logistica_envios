package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	@Transactional(readOnly = true)
	Optional<User> findByNombreUsuario(String nombreUsuario);
	
	@Override
	List<User> findAll();
}
