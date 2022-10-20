package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentTypeDTO {

	private int idTipoDocumento;
	private String nombreTipoDocumento;
}
