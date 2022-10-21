package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.UserDTO;
import com.ingeneo.pruebatecnica.dto.request.UserRequest;

@Service
public interface UserService {

	List<UserDTO> findAll();
	
	UserDTO findByNombreUsuario(String nombreUsuario);
	
	UserDTO findByNumeroDocumento(int numeroDocumento);
	
	UserDTO findByCorreo(String correo);
	
	UserDTO findByIdUsuario(int idUsuario);
	
	void save(UserRequest user);
	
	void saveAll(List<UserRequest>user);
	
	void update(UserRequest user, int idUsuario);
	
	void deleteById(int idUsuario);
}
