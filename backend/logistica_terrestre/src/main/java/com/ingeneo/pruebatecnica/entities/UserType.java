package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipousuario")
public class UserType {

	@Id
	@Column(name = "idTipoUsuario")
	private int idTipoUsuario;
	@Column(name = "nombreTipoUsuario")
	private String nombreTipoUsuario;
}
