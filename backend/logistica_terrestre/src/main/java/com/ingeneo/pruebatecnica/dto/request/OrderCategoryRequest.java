package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderCategoryRequest implements Serializable {

	@JsonProperty("nombreCategoriaEnvio")
	private String nombreCategoriaEnvio;
}
