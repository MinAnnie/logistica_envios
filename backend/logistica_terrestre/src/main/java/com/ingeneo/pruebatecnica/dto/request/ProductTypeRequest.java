package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductTypeRequest implements Serializable{

	@JsonProperty("nombreTipoProducto")
	private String nombreTipoProducto;
}
