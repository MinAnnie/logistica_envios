package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderRequest implements Serializable{

	@JsonProperty("idCamion")
	private int idCamion;
	@JsonProperty("idBodega")
	private int idBodega;
	@JsonProperty("fechaEntrega")
	private Date fechaEntrega;
}
