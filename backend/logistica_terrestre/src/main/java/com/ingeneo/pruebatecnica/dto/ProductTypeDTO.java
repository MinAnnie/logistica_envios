package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductTypeDTO {

	private int idTipoProducto;
	private String nombreTipoProducto;
}
