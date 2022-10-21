package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.ProductTypeDTO;
import com.ingeneo.pruebatecnica.dto.request.ProductTypeRequest;

@Service
public interface ProductTypeService {

	List<ProductTypeDTO> findAll();
	
	ProductTypeDTO findByNombreTipoProducto(String nombreTipoProducto);
	
	ProductTypeDTO findByIdTipoProducto(int idTipoProducto);
	
	void save(ProductTypeRequest productType);
	
	void saveAll(List<ProductTypeRequest> productType);
	
	void update(ProductTypeRequest productType, int idTipoProducto);
	
	void deleteById(int idTipoProducto);
}
