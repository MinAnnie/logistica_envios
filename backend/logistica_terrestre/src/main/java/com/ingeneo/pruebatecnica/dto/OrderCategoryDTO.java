package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderCategoryDTO {

	private int idCategoriaEnvio;
	private String nombreCategoriaEnvio;
}
