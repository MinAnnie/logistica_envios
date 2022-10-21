package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.UserDTO;
import com.ingeneo.pruebatecnica.dto.request.UserRequest;
import com.ingeneo.pruebatecnica.entities.User;
import com.ingeneo.pruebatecnica.repository.UserRepository;
import com.ingeneo.pruebatecnica.services.interfaces.UserService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class UserImplementation implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDTO> findAll() {
		List<UserDTO> dto = new ArrayList<>();
		List<User> user = this.userRepository.findAll();
		
		for(User u: user) {
			UserDTO userdto = UserDTO.builder()
					.idUsuario(u.getIdUsuario())
					.nombreUsuario(u.getNombreUsuario())
					.correo(u.getCorreo())
					.telefono(u.getTelefono())
					.numeroDocumento(u.getNumeroDocumento())
					.idTipoDocumento(u.getIdTipoDocumento())
					.direccion(u.getDireccion())
					.idTipoUsuario(u.getIdTipoUsuario())
					.build();
			
			dto.add(userdto);
		}
		return dto;
	}

	@Override
	public UserDTO findByNombreUsuario(String nombreUsuario) {
		Optional<User> user = this.userRepository.findByNombreUsuario(nombreUsuario);
		
		if(!user.isPresent()) {
			return null;
		}
		
		User u = user.get();
		return UserDTO.builder()
				.idUsuario(u.getIdUsuario())
				.nombreUsuario(u.getNombreUsuario())
				.correo(u.getCorreo())
				.telefono(u.getTelefono())
				.numeroDocumento(u.getNumeroDocumento())
				.idTipoDocumento(u.getIdTipoDocumento())
				.direccion(u.getDireccion())
				.idTipoUsuario(u.getIdTipoUsuario())
				.build();
	}

	@Override
	public UserDTO findByNumeroDocumento(int numeroDocumento) {
		Optional<User> user = this.userRepository.findByNumeroDocumento(numeroDocumento);
		
		if(!user.isPresent()) {
			return null;
		}
		
		User u = user.get();
		
		return UserDTO.builder()
				.idUsuario(u.getIdUsuario())
				.nombreUsuario(u.getNombreUsuario())
				.correo(u.getCorreo())
				.telefono(u.getTelefono())
				.numeroDocumento(u.getNumeroDocumento())
				.idTipoDocumento(u.getIdTipoDocumento())
				.direccion(u.getDireccion())
				.idTipoUsuario(u.getIdTipoUsuario())
				.build();
	}

	@Override
	public UserDTO findByCorreo(String correo) {
		Optional<User> user = this.userRepository.findByCorreo(correo);
		
		if(!user.isPresent()) {
			return null;
		}

		User u = user.get();
		
		return UserDTO.builder()
				.idUsuario(u.getIdUsuario())
				.nombreUsuario(u.getNombreUsuario())
				.correo(u.getCorreo())
				.telefono(u.getTelefono())
				.numeroDocumento(u.getNumeroDocumento())
				.idTipoDocumento(u.getIdTipoDocumento())
				.direccion(u.getDireccion())
				.idTipoUsuario(u.getIdTipoUsuario())
				.build();
	}

	@Override
	public UserDTO findByIdUsuario(int idUsuario) {
		Optional<User> user = this.userRepository.findById(idUsuario);
		
		if(!user.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(user.get(), UserDTO.class);
	}

	@Override
	public void save(UserRequest user) {
		User u = Helpers.modelMapper().map(user, User.class);
		
		this.userRepository.save(u);
		
	}

	@Override
	public void saveAll(List<UserRequest> user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserRequest user, int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

}
