package com.ingeneo.pruebatecnica.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "envio")
public class Delivery {

	@Id
	@Column(name = "idEnvio")
	private int idEnvio;
	@Column(name = "idTipoProducto")
	private int idTipoProducto;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaRegistro")
	private Date fechaRegistro;
	@Column(name = "precioEnvio")
	private int precioEnvio;
	@Column(name = "idCategoriaEnvio")
	private int idCategoriaEnvio;
	@Column(name = "idEstadoEnvio")
	private int idEstadoEnvio;
	@Column(name = "numeroGuia")
	private String numeroGuia;
	@Column(name = "descuento")
	private int descuento;
	@Column(name = "cantidadProductos")
	private int cantidadProductos;
	@Column(name = "idUsuario")
	private int idUsuario;
	@Column(name = "idEntrega")
	private int idEntrega;
}
