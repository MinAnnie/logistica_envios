package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderStatusDTO {

	private int idEstadoEnvio;
	private String nombreEstadoEnvio;
}
