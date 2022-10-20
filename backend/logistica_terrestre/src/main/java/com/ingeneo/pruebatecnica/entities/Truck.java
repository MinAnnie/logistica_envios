package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "camion")
public class Truck {

	@Id
	@Column(name = "idCamion")
	private int idCamion;
	@Column(name = "placaCamion")
	private String placaCamion;
}
