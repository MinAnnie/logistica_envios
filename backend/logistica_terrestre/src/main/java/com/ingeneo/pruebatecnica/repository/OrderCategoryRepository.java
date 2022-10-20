package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.OrderCategory;

@Repository
public interface OrderCategoryRepository extends CrudRepository<OrderCategory, Integer>{

	@Transactional(readOnly = true)
	Optional<OrderCategory> findByNombreCategoriaEnvio(String nombreCategoriaEnvio);
	
	@Override
	List<OrderCategory> findAll();
}
