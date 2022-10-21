package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.DeliveryDTO;
import com.ingeneo.pruebatecnica.dto.request.DeliveryRequest;

@Service
public interface DeliveryService {

	List<DeliveryDTO> findAll();
	
	DeliveryDTO findByNumeroGuia(String numeroGuia);
	
	DeliveryDTO findByIdEnvio(int idEnvio);
	
	void save(DeliveryRequest delivery);
	
	void saveAll(List<DeliveryRequest> delivery);
	
	void update(DeliveryRequest delivery, int idEnvio);
	
	void deleteById(int idEnvio);
}
