package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.TruckDTO;
import com.ingeneo.pruebatecnica.dto.request.TruckRequest;

@Service
public interface TruckService {

	List<TruckDTO> findAll();
	
	TruckDTO findByPlacaCamion(String placaCamion);
	
	TruckDTO findByIdCamion(int idCamion);
	
	void save(TruckRequest truck);
	
	void saveAll(List<TruckRequest> truck);
	
	void update(TruckRequest truck, int idCamion);
	
	void deleteById(int idCamion);
}
