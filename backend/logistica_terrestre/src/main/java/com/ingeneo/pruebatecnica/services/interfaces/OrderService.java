package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderRequest;

@Service
public interface OrderService {

	List<OrderDTO> findAll();
	
	OrderDTO findByFechaEntrega(Date fechaEntrega);
	
	OrderDTO findIdEntrega(int idEntrega);
	
	void save(OrderRequest order);
	
	void saveAll(List<OrderRequest> order);
	
	void update(OrderRequest order, int idEntrega);
	
	void deleteById(int idEntrega);
}
