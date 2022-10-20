package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.Delivery;

@Repository
public interface DeliveryRepository extends  CrudRepository<Delivery, Integer>{

	@Transactional(readOnly = true)
	Optional<Delivery> findByNumeroGuia(String numeroGuia);
	
	@Override
	List<Delivery> findAll();
}
