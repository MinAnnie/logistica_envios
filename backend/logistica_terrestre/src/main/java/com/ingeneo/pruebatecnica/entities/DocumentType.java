package com.ingeneo.pruebatecnica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipodocumento")
public class DocumentType {

	@Id
	@Column(name = "idTipoDocumento")
	private int idTipoDocumento;
	@Column(name = "nombreTipoDocumento")
	private String nombreTipoDocumento;
}
