package com.ingeneo.pruebatecnica.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.DocumentTypeDTO;
import com.ingeneo.pruebatecnica.dto.request.DocumentTypeRequest;

@Service
public interface DocumentTypeService {

	List<DocumentTypeDTO> findAll();
	
	DocumentTypeDTO findByNombreTipoDocumento(String nombreTipoDocumento);
	
	DocumentTypeDTO findByIdTipoDocumento(int idTipoDocumento);
	
	void save(DocumentTypeRequest documentType);
	
	void saveAll(List<DocumentTypeRequest> documentType);
	
	void update(DocumentTypeRequest documentType, int idTipoDocumento);
	
	void deleteById(int idTipoDocumento);
}
