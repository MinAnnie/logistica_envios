package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.OrderDTO;
import com.ingeneo.pruebatecnica.dto.request.OrderRequest;
import com.ingeneo.pruebatecnica.entities.Order;
import com.ingeneo.pruebatecnica.repository.OrderRepository;
import com.ingeneo.pruebatecnica.services.interfaces.OrderService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class OrderImplementation implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<OrderDTO> findAll() {
		List<OrderDTO> dto = new ArrayList<>();
		List<Order> order = this.orderRepository.findAll();
		
		for(Order o: order) {
			OrderDTO orderDTO = OrderDTO.builder()
					.idEntrega(o.getIdEntrega())
					.idBodega(o.getIdBodega())
					.idCamion(o.getIdCamion())
					.fechaEntrega(o.getFechaEntrega())
					.build();
			dto.add(orderDTO);
		}
		return dto;
	}

	@Override
	public OrderDTO findByFechaEntrega(Date fechaEntrega) {
		
		Optional<Order> order = this.orderRepository.findByFechaEntrega(fechaEntrega);
		
		if(!order.isPresent()) {
			return null;
		}
		
		Order o = order.get();
		
		return OrderDTO.builder()
				.idEntrega(o.getIdEntrega())
				.idCamion(o.getIdCamion())
				.idBodega(o.getIdBodega())
				.fechaEntrega(o.getFechaEntrega())
				.build(); 
	}

	@Override
	public OrderDTO findIdEntrega(int idEntrega) {
		Optional<Order> order = this.orderRepository.findById(idEntrega);
		
		if(!order.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(order.get(), OrderDTO.class);
	}

	@Override
	public void save(OrderRequest order) {
		Order o = Helpers.modelMapper().map(order, Order.class);
		
		this.orderRepository.save(o);
		
	}

	@Override
	public void saveAll(List<OrderRequest> order) {
		List<Order> o = new ArrayList<>();
		
		for(OrderRequest orderR: order) {
			Order or = Helpers.modelMapper().map(orderR, Order.class);
			o.add(or);
		}
		this.orderRepository.saveAll(o);
	}

	@Override
	public void update(OrderRequest order, int idEntrega) {
		Optional<Order> o = this.orderRepository.findById(idEntrega);
		
		if(o.isPresent()) {
			Order orders = o.get();
			
			orders.setIdCamion(order.getIdCamion());
			orders.setIdBodega(order.getIdBodega());
			orders.setFechaEntrega(order.getFechaEntrega());
			
			this.orderRepository.save(orders);
		}
		
	}

	@Override
	public void deleteById(int idEntrega) {
		this.orderRepository.deleteById(idEntrega);
		
	}

}
