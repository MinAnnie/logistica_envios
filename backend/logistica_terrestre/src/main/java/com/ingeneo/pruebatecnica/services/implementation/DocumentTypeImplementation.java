package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.DocumentTypeDTO;
import com.ingeneo.pruebatecnica.dto.request.DocumentTypeRequest;
import com.ingeneo.pruebatecnica.entities.DocumentType;
import com.ingeneo.pruebatecnica.repository.DocumentTypeRepository;
import com.ingeneo.pruebatecnica.services.interfaces.DocumentTypeService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class DocumentTypeImplementation implements DocumentTypeService{

	@Autowired
	private DocumentTypeRepository documentTypeRepository;
	
	@Override
	public List<DocumentTypeDTO> findAll() {
		List<DocumentTypeDTO> dto = new ArrayList<>();
		List<DocumentType> documentType = this.documentTypeRepository.findAll() ;
		
		for(DocumentType dt: documentType) {
			DocumentTypeDTO dtDTO = DocumentTypeDTO.builder()
					.idTipoDocumento(dt.getIdTipoDocumento())
					.nombreTipoDocumento(dt.getNombreTipoDocumento())
					.build();
			
			dto.add(dtDTO);
		}
		return dto;
	}

	@Override
	public DocumentTypeDTO findByNombreTipoDocumento(String nombreTipoDocumento) {
		Optional<DocumentType> dt = this.documentTypeRepository.findByNombreTipoDocumento(nombreTipoDocumento);
		
		if(!dt.isPresent()) {
			return null;
		}
		
		DocumentType documentType = dt.get();
		
		return DocumentTypeDTO.builder()
				.idTipoDocumento(documentType.getIdTipoDocumento())
				.nombreTipoDocumento(documentType.getNombreTipoDocumento())
				.build();	
		}

	@Override
	public DocumentTypeDTO findByIdTipoDocumento(int idTipoDocumento) {
		Optional<DocumentType> dt = this.documentTypeRepository.findById(idTipoDocumento);
		
		if(!dt.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(dt.get(), DocumentTypeDTO.class);
	}

	@Override
	public void save(DocumentTypeRequest documentType) {
		DocumentType dt = Helpers.modelMapper().map(documentType, DocumentType.class);
		
		this.documentTypeRepository.save(dt);
		
	}

	@Override
	public void saveAll(List<DocumentTypeRequest> documentType) {
		List<DocumentType> dt = new ArrayList<>();
		
		for(DocumentTypeRequest dtRequest: documentType) {
			DocumentType docT = Helpers.modelMapper().map(dtRequest, DocumentType.class);
			dt.add(docT);
		}
		
	}

	@Override
	public void update(DocumentTypeRequest documentType, int idTipoDocumento) {
		Optional<DocumentType> dt = this.documentTypeRepository.findById(idTipoDocumento);
		
		if(dt.isPresent()) {
			DocumentType docT = dt.get();
			
			docT.setNombreTipoDocumento(documentType.getNombreTipoDocumento());
		
			this.documentTypeRepository.save(docT);
		}
		
	}

	@Override
	public void deleteById(int idTipoDocumento) {
		this.documentTypeRepository.deleteById(idTipoDocumento);
		
	}

}
