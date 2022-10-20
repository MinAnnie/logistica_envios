package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WarehouseRequest implements Serializable{

	@JsonProperty("nombreBodega")
	private String nombreBodega;
	@JsonProperty("direccionBodega")
	private String direccionBodega;
}
