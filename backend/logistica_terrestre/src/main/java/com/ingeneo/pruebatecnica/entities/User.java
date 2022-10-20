package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class User {

	@Id
	@Column(name = "idUsuario")
	private int idUsuario;
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	@Column(name = "correo")
	private String correo;
	@Column(name = "telefono")
	private int telefono;
	@Column(name = "contraseña")
	private String pass;
	@Column(name = "numeroDocumento")
	private int numeroDocumento;
	@Column(name = "idTipoDocumento")
	private int idTipoDocumento;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "idTipoUsuario")
	private int idTipoUsuario;
}
