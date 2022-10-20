package com.ingeneo.pruebatecnica.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TruckDTO {

	private int idCamion;
	private String placaCamion;
}
