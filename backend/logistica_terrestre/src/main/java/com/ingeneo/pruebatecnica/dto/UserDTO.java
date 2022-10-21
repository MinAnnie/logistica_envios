package com.ingeneo.pruebatecnica.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUsuario;
	private String nombreUsuario;
	private String correo;
	private int telefono;
	private int numeroDocumento;
	private int idTipoDocumento;
	private String direccion;
	private int idTipoUsuario;
}
