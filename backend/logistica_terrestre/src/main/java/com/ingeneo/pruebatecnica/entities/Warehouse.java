package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bodega")
public class Warehouse {

	@Id
	@Column(name = "idBodega")
	private int idBodega;
	@Column(name = "nombreBodega")
	private String nombreBodega;
	@Column(name = "direccionBodega")
	private String direccionBodega;
}
