package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.Truck;

@Repository
public interface TruckRepository extends CrudRepository<Truck, Integer>{

	@Transactional(readOnly = true)
	Optional<Truck> findByPlacaCamion(String placaCamion);
	
	@Override
	List<Truck> findAll();
}
