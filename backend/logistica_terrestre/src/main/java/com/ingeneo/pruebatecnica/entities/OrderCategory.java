package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "categoriaenvio")
public class OrderCategory {

	@Id
	@Column(name = "idCategoriaEnvio")
	private int idCategoriaEnvio;
	@Column(name = "nombreCategoriaEnvio")
	private String nombreCategoriaEnvio;
}
