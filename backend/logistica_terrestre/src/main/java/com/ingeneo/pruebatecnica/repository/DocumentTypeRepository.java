package com.ingeneo.pruebatecnica.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ingeneo.pruebatecnica.entities.DocumentType;

@Repository
public interface DocumentTypeRepository extends CrudRepository<DocumentType, Integer>{

	@Transactional(readOnly = true)
	Optional<DocumentType> findByNombreTipoDocumento(String nombreTipoDocumento);
	
	@Override
	List<DocumentType>findAll();
}
