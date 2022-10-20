package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserTypeDTO {

	private int idTipoUsuario;
	private String nombreTipoUsuario;
}
