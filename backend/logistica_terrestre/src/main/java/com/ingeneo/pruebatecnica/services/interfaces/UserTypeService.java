package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.UserTypeDTO;
import com.ingeneo.pruebatecnica.dto.request.UserTypeRequest;

@Service
public interface UserTypeService {

	List<UserTypeDTO> findAll();
	
	UserTypeDTO findByNombreTipoUsuario(String nombreTipoUsuario);
	
	UserTypeDTO findByIdTipoUsuario(int idTipoUsuario);
	
	void save(UserTypeRequest userType);
	
	void saveAll(List<UserTypeRequest> userType);
	
	void update(UserTypeRequest userType, int idTipoUsuario);
	
	void deleteById(int idTipoUsuario);
}
