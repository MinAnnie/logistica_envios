package com.ingeneo.pruebatecnica.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDTO {

	private int idEntrega;
	private int idCamion;
	private int idBodega;
	private Date fechaEntrega;
}
