package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.TruckDTO;
import com.ingeneo.pruebatecnica.dto.request.TruckRequest;
import com.ingeneo.pruebatecnica.entities.Truck;
import com.ingeneo.pruebatecnica.repository.TruckRepository;
import com.ingeneo.pruebatecnica.services.interfaces.TruckService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class TruckImplementation implements TruckService{

	@Autowired
	private TruckRepository truckRepository;
	
	@Override
	public List<TruckDTO> findAll() {
		List<TruckDTO> dto = new ArrayList<>();
		List<Truck> truck = this.truckRepository.findAll();
		
		for(Truck t: truck) {
			TruckDTO truckDTO = TruckDTO.builder()
					.idCamion(t.getIdCamion())
					.placaCamion(t.getPlacaCamion())
					.build();
			dto.add(truckDTO);
		}
		return dto;
	}

	@Override
	public TruckDTO findByPlacaCamion(String placaCamion) {
		Optional<Truck> truck = this.truckRepository.findByPlacaCamion(placaCamion);
		
		if(!truck.isPresent()) {
			return null;
		}
		
		Truck t = truck.get();
		
		return TruckDTO.builder()
				.idCamion(t.getIdCamion())
				.placaCamion(t.getPlacaCamion())
				.build();
	}

	@Override
	public TruckDTO findByIdCamion(int idCamion) {
		Optional<Truck> truck = this.truckRepository.findById(idCamion);
		
		if(!truck.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(truck.get(), TruckDTO.class);
	}

	@Override
	public void save(TruckRequest truck) {
		Truck t = Helpers.modelMapper().map(truck, Truck.class);
		
		this.truckRepository.save(t);
		
	}

	@Override
	public void saveAll(List<TruckRequest> truck) {
		List<Truck> t = new ArrayList<>();
		
		for(TruckRequest truckRequest: truck) {
			Truck tk  = Helpers.modelMapper().map(truckRequest, Truck.class);
			t.add(tk);
		}
		this.truckRepository.saveAll(t);
		
	}

	@Override
	public void update(TruckRequest truck, int idCamion) {
		Optional<Truck> t = this.truckRepository.findById(idCamion);
		
		if(t.isPresent()) {
			Truck tk = t.get();
			
			tk.setPlacaCamion(truck.getPlacaCamion());
			
			this.truckRepository.save(tk);
		}
		
	}

	@Override
	public void deleteById(int idCamion) {
		this.truckRepository.deleteById(idCamion);
		
	}

}
