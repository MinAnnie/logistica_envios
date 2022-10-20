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
@Table(name = "entrega")
public class Order {

	@Id
	@Column(name = "idEntrega")
	private int idEntrega;
	@Column(name = "idCamion")
	private int idCamion;
	@Column(name = "idBodega")
	private int idBodega;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaEntrega")
	private Date fechaEntrega;
}
