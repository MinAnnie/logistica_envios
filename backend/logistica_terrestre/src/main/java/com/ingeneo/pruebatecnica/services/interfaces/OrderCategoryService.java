package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderCategoryDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderCategoryRequest;

@Service
public interface OrderCategoryService {

	List<OrderCategoryDTO> findAll();
	
	OrderCategoryDTO findByNombreCategoriaEnvio(String nombreCategoriaEnvio);
	
	OrderCategoryDTO findByIdCategoriaEnvio(int idCategoriaEnvio);
	
	void save(OrderCategoryRequest orderCategory);
	
	void saveAll(List<OrderCategoryRequest> orderCategory);
	
	void update(OrderCategoryRequest orderCategory, int idCategoriaEnvio);
	
	void deleteById(int idCategoriaEnvio);
}
