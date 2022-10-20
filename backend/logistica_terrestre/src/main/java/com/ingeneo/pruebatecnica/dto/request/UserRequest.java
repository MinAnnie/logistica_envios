package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserRequest implements Serializable{

	@JsonProperty("nombreUsuario")
	private String nombreUsuario;
	@JsonProperty("correo")
	private String correo;
	@JsonProperty("telefono")
	private int telefono;
	@JsonProperty("contraseña")
	private String pass;
	@JsonProperty("numeroDocumento")
	private int numeroDocumento;
	@JsonProperty("idTipoDocumento")
	private int idTipoDocumento;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("idTipoUsuario")
	private int idTipoUsuario;
}
