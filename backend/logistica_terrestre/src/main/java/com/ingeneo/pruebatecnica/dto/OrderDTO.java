package com.ingeneo.pruebatecnica.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEntrega;
	private int idCamion;
	private int idBodega;
	private Date fechaEntrega;
}
