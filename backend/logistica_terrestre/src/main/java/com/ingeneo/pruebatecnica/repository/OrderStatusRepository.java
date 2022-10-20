package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.OrderStatus;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer>{

	@Transactional(readOnly = true)
	Optional<OrderStatus> findByNombreEstadoEnvio(String nombreEstadoEnvio);
	
	@Override
	List<OrderStatus> findAll();
}
