package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

	private int idUsuario;
	private String nombreUsuario;
	private String correo;
	private int telefono;
	private int numeroDocumento;
	private int idTipoDocumento;
	private String direccion;
	private int idTipoUsuario;
}
