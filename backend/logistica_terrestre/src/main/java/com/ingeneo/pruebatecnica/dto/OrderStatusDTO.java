package com.ingeneo.pruebatecnica.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderStatusDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEstadoEnvio;
	private String nombreEstadoEnvio;
}
