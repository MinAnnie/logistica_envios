package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "estadoenvio")
public class OrderStatus {

	@Id
	@Column(name = "idEstadoEnvio")
	private int idEstadoEnvio;
	@Column(name = "nombreEstadoEnvio")
	private String nombreEstadoEnvio;
}
