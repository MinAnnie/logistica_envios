package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.WarehouseDTO;
import com.ingeneo.pruebatecnica.dto.request.WarehouseRequest;

@Service
public interface WarehouseService {

	List<WarehouseDTO> findAll();
	
	WarehouseDTO findByNombreBodega(String nombreBodega);
	
	WarehouseDTO findByIdBodega(int idBodega);
	
	void save(WarehouseRequest warehouse);
	
	void saveAll(List<WarehouseRequest> warehouse);
	
	void update(WarehouseRequest warehouse, int idBodega);
	
	void deleteById(int idBodega);
}
