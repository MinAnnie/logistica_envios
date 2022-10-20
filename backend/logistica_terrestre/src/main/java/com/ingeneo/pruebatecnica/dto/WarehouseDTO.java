package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WarehouseDTO {

	private int idBodega;
	private String nombreBodega;
	private String direccionBodega;
}
