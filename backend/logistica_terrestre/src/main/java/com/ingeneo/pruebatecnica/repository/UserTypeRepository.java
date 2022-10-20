package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.UserType;

@Repository
public interface UserTypeRepository extends CrudRepository<UserType, Integer>{

	@Transactional(readOnly = true)
	Optional<UserType> findByNombreTipoUsuario(String nombreTipoUsuario);
	
	@Override
	List<UserType> findAll();
}
