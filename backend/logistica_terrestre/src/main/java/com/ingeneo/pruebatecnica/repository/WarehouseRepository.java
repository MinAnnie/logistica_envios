package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.Warehouse;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Integer>{

	@Transactional(readOnly = true)
	Optional<Warehouse> findByNombreBodega(String nombreBodega);
	
	@Override
	List<Warehouse> findAll();
}
