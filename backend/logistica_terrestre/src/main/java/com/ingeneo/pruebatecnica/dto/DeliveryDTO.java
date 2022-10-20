package com.ingeneo.pruebatecnica.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeliveryDTO {

	private int idEnvio;
	private int idTipoProducto;
	private Date fechaRegistro;
	private int precioEnvio;
	private int idCategoriaEnvio;
	private int idEstadoEnvio;
	private String numeroGuia;
	private int descuento;
	private int cantidadProductos;
	private int idUsuario;
	private int idEntrega;
}
