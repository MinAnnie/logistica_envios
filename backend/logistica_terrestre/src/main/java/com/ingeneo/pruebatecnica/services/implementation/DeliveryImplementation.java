package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.DeliveryDTO;
import com.ingeneo.pruebatecnica.dto.DeliveryDTO.DeliveryDTOBuilder;
import com.ingeneo.pruebatecnica.dto.request.DeliveryRequest;
import com.ingeneo.pruebatecnica.entities.Delivery;
import com.ingeneo.pruebatecnica.repository.DeliveryRepository;
import com.ingeneo.pruebatecnica.services.interfaces.DeliveryService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class DeliveryImplementation implements DeliveryService{
	
	@Autowired
	private DeliveryRepository deliveryRepository;

	@Override
	public List<DeliveryDTO> findAll() {
		List<DeliveryDTO> dto = new ArrayList<>();
		List<Delivery> delivery = this.deliveryRepository.findAll();
		
		for(Delivery d: delivery) {
			DeliveryDTO deliveryDTO = DeliveryDTO.builder()
					.idEnvio(d.getIdEnvio())
					.idTipoProducto(d.getIdTipoProducto())
					.fechaRegistro(d.getFechaRegistro())
					.precioEnvio(d.getPrecioEnvio())
					.idCategoriaEnvio(d.getIdCategoriaEnvio())
					.idEstadoEnvio(d.getIdEstadoEnvio())
					.numeroGuia(d.getNumeroGuia())
					.descuento(d.getDescuento())
					.cantidadProductos(d.getCantidadProductos())
					.idUsuario(d.getIdUsuario())
					.idEntrega(d.getIdEntrega())
					.build();
			dto.add(deliveryDTO);
			}
		return dto;
	}

	@Override
	public DeliveryDTO findByNumeroGuia(String numeroGuia) {
		Optional<Delivery> delivery = this.deliveryRepository.findByNumeroGuia(numeroGuia);
		
		if(!delivery.isPresent()) {
			return null;
		}
		
		Delivery d = delivery.get();
		return DeliveryDTO.builder()
				.idEnvio(d.getIdEnvio())
				.idTipoProducto(d.getIdTipoProducto())
				.fechaRegistro(d.getFechaRegistro())
				.precioEnvio(d.getPrecioEnvio())
				.idCategoriaEnvio(d.getIdCategoriaEnvio())
				.idEstadoEnvio(d.getIdEstadoEnvio())
				.numeroGuia(d.getNumeroGuia())
				.descuento(d.getDescuento())
				.cantidadProductos(d.getCantidadProductos())
				.idUsuario(d.getIdUsuario())
				.idEntrega(d.getIdEntrega())
				.build();
	}

	@Override
	public DeliveryDTO findByIdEnvio(int idEnvio) {
		Optional<Delivery> delivery = this.deliveryRepository.findById(idEnvio);
		
		if(!delivery.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(delivery.get(), DeliveryDTO.class);
	}

	@Override
	public void save(DeliveryRequest delivery) {
		Delivery d = Helpers.modelMapper().map(delivery, Delivery.class);
		
		this.deliveryRepository.save(d);
		
	}

	@Override
	public void saveAll(List<DeliveryRequest> delivery) {
		List<Delivery> d = new ArrayList<>();
		
		for(DeliveryRequest deliveryR: delivery) {
			Delivery de = Helpers.modelMapper().map(deliveryR, Delivery.class);
			d.add(de);
		}
		
		this.deliveryRepository.saveAll(d);
	}

	@Override
	public void update(DeliveryRequest delivery, int idEnvio) {
		Optional<Delivery> deliver = this.deliveryRepository.findById(idEnvio);
		
		if(deliver.isPresent()) {
			Delivery d = deliver.get();
			
			d.setIdTipoProducto(delivery.getIdTipoProducto());
			d.setFechaRegistro(delivery.getFechaRegistro());
			d.setPrecioEnvio(delivery.getPrecioEnvio());
			d.setIdCategoriaEnvio(delivery.getIdCategoriaEnvio());
			d.setIdEstadoEnvio(delivery.getIdEstadoEnvio());
			d.setNumeroGuia(delivery.getNumeroGuia());
			d.setDescuento(delivery.getDescuento());
			d.setCantidadProductos(delivery.getCantidadProductos());
			d.setIdUsuario(delivery.getIdUsuario());
			d.setIdEntrega(delivery.getIdEntrega());
			
			this.deliveryRepository.save(d);
			}
		
	}

	@Override
	public void deleteById(int idEnvio) {
		this.deliveryRepository.deleteById(idEnvio);
		
	}

}
