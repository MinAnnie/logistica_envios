package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserTypeRequest implements Serializable{

	@JsonProperty("nombreTipoUsuario")
	private String nombreTipoUsuario;
}
