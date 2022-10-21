package com.ingeneo.pruebatecnica.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

	@Transactional(readOnly = true)
	Optional<Order> findByFechaEntrega(Date fechaEntrega);
	
	@Override
	List<Order> findAll();
}
