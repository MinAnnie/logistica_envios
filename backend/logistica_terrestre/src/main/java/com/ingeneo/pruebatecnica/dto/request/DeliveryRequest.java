package com.ingeneo.pruebatecnica.dto.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeliveryRequest implements Serializable{

	@JsonProperty("idTipoProducto")
	private int idTipoProducto;
	@JsonProperty("fechaRegistro")
	private Date fechaRegistro;
	@JsonProperty("precioEnvio")
	private int precioEnvio;
	@JsonProperty("idCategoriaEnvio")
	private int idCategoriaEnvio;
	@JsonProperty("idEstadoEnvio")
	private int idEstadoEnvio;
	@JsonProperty("numeroGuia")
	private String numeroGuia;
	@JsonProperty("descuento")
	private int descuento;
	@JsonProperty("cantidadProductos")
	private int cantidadProductos;
	@JsonProperty("idUsuario")
	private int idUsuario;
	@JsonProperty("idEntrega")
	private int idEntrega;
}
