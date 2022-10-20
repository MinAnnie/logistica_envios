package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipoproducto")
public class ProductType {

	@Id
	@Column(name = "idTipoProducto")
	private int idTipoProducto;
	@Column(name = "nombreTipoProducto")
	private String nombreTipoProducto;
}
