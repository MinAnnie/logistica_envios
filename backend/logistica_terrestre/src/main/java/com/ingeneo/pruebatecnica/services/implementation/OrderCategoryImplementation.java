package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderCategoryDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderCategoryRequest;
import com.ingeneo.pruebatecnica.entities.OrderCategory;
import com.ingeneo.pruebatecnica.repository.OrderCategoryRepository;
import com.ingeneo.pruebatecnica.services.interfaces.OrderCategoryService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class OrderCategoryImplementation implements OrderCategoryService {

	@Autowired
	private OrderCategoryRepository orderCategoryRepository;
	
	@Override
	public List<OrderCategoryDTO> findAll() {
		List<OrderCategoryDTO> dto = new ArrayList<>();
		List<OrderCategory> orderCategory = this.orderCategoryRepository.findAll();
		
		for(OrderCategory oc: orderCategory) {
			OrderCategoryDTO ocDTO = OrderCategoryDTO.builder()
					.idCategoriaEnvio(oc.getIdCategoriaEnvio())
					.nombreCategoriaEnvio(oc.getNombreCategoriaEnvio())
					.build();
			
			dto.add(ocDTO);
		}
		return dto;
	}

	@Override
	public OrderCategoryDTO findByNombreCategoriaEnvio(String nombreCategoriaEnvio) {
		Optional<OrderCategory> oc = this.orderCategoryRepository.findByNombreCategoriaEnvio(nombreCategoriaEnvio);
		
		if(!oc.isPresent()) {
			return null;
		}
		
		OrderCategory orderCategory = oc.get();
		
		return OrderCategoryDTO.builder()
				.idCategoriaEnvio(orderCategory.getIdCategoriaEnvio())
				.nombreCategoriaEnvio(orderCategory.getNombreCategoriaEnvio())
				.build();
	}

	@Override
	public OrderCategoryDTO findByIdCategoriaEnvio(int idCategoriaEnvio) {
		Optional<OrderCategory> orderCategory = this.orderCategoryRepository.findById(idCategoriaEnvio);
		
		if(!orderCategory.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(orderCategory.get(), OrderCategoryDTO.class);
	}

	@Override
	public void save(OrderCategoryRequest orderCategory) {
		OrderCategory oc = Helpers.modelMapper().map(orderCategory, OrderCategory.class);
		
		this.orderCategoryRepository.save(oc);
	}

	@Override
	public void saveAll(List<OrderCategoryRequest> orderCategory) {
		List<OrderCategory> oc = new ArrayList<>();
		
		for(OrderCategoryRequest ocr: orderCategory) {
			OrderCategory orderC = Helpers.modelMapper().map(ocr, OrderCategory.class);
			oc.add(orderC);
		}
		
		this.orderCategoryRepository.saveAll(oc);
		
	}

	@Override
	public void update(OrderCategoryRequest orderCategory, int idCategoriaEnvio) {
		Optional<OrderCategory> oc = this.orderCategoryRepository.findById(idCategoriaEnvio);
		
		if(oc.isPresent()) {
			OrderCategory order = oc.get();
			
			order.setNombreCategoriaEnvio(orderCategory.getNombreCategoriaEnvio());
			
			this.orderCategoryRepository.save(order);
		}
		
	}

	@Override
	public void deleteById(int idCategoriaEnvio) {
		this.orderCategoryRepository.deleteById(idCategoriaEnvio);
		
	}

}
