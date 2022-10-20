package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer>{

	@Transactional(readOnly = true)
	Optional<ProductType> findByNombreTipoProducto(String nombreTipoProducto);
	
	@Override
	List<ProductType> findAll();
}
