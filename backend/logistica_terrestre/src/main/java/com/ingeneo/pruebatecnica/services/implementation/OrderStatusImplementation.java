package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderStatusDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderStatusRequest;
import com.ingeneo.pruebatecnica.entities.OrderStatus;
import com.ingeneo.pruebatecnica.repository.OrderStatusRepository;
import com.ingeneo.pruebatecnica.services.interfaces.OrderStatusService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class OrderStatusImplementation implements OrderStatusService{

	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	@Override
	public List<OrderStatusDTO> findAll() {
		List<OrderStatusDTO> dto = new ArrayList<>();
		List<OrderStatus> orderS = this.orderStatusRepository.findAll();
		
		for(OrderStatus os: orderS) {
			OrderStatusDTO osdto = OrderStatusDTO.builder()
					.idEstadoEnvio(os.getIdEstadoEnvio())
					.nombreEstadoEnvio(os.getNombreEstadoEnvio())
					.build();
			dto.add(osdto);
		}
		return dto;
	}

	@Override
	public OrderStatusDTO findByNombreEstadoEnvio(String nombreEstadoEnvio) {
		Optional<OrderStatus> order = this.orderStatusRepository.findByNombreEstadoEnvio(nombreEstadoEnvio);
		
		if(!order.isPresent()) {
			return null;
		}
		
		OrderStatus os = order.get();
		return OrderStatusDTO.builder()
				.idEstadoEnvio(os.getIdEstadoEnvio())
				.nombreEstadoEnvio(os.getNombreEstadoEnvio())
				.build();
	}

	@Override
	public OrderStatusDTO findByIdEstadoEnvio(int idEstadoEnvio) {
		Optional<OrderStatus> order = this.orderStatusRepository.findById(idEstadoEnvio);
		
		if(!order.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(order.get(), OrderStatusDTO.class);
	}

	@Override
	public void save(OrderStatusRequest orderStatus) {
		OrderStatus order = Helpers.modelMapper().map(orderStatus, OrderStatus.class);
		
		this.orderStatusRepository.save(order);
		
	}

	@Override
	public void saveAll(List<OrderStatusRequest> orderStatus) {
		List<OrderStatus> order = new ArrayList<>();
		
		for(OrderStatusRequest ordersr: orderStatus) {
			OrderStatus os = Helpers.modelMapper().map(ordersr, OrderStatus.class);
			order.add(os);
		}
		
		this.orderStatusRepository.saveAll(order);
		
	}

	@Override
	public void update(OrderStatusRequest orderStatus, int idEstadoEnvio) {
		Optional<OrderStatus> order = this.orderStatusRepository.findById(idEstadoEnvio);
		
		if(order.isPresent()) {
			OrderStatus orders = order.get();
			
			orders.setNombreEstadoEnvio(orderStatus.getNombreEstadoEnvio());
			
			this.orderStatusRepository.save(orders);
		}
		
	}

	@Override
	public void deleteById(int idEstadoEnvio) {
		this.orderStatusRepository.deleteById(idEstadoEnvio);
		
	}

}
