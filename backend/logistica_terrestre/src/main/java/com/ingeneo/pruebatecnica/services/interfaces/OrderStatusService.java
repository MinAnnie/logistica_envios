package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderStatusDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderStatusRequest;

@Service
public interface OrderStatusService {

	List<OrderStatusDTO> findAll();
	
	OrderStatusDTO findByNombreEstadoEnvio(String nombreEstadoEnvio);
	
	OrderStatusDTO findByIdEstadoEnvio(int idEstadoEnvio);
	
	void save(OrderStatusRequest orderStatus);
	
	void saveAll(List<OrderStatusRequest> orderStatus);
	
	void update(OrderStatusRequest orderStatus, int idEstadoEnvio);
	
	void deleteById(int idEstadoEnvio);
}
