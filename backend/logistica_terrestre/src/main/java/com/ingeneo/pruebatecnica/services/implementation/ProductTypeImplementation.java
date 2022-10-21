package com.ingeneo.pruebatecnica.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeneo.pruebatecnica.dto.ProductTypeDTO;
import com.ingeneo.pruebatecnica.dto.request.ProductTypeRequest;
import com.ingeneo.pruebatecnica.entities.ProductType;
import com.ingeneo.pruebatecnica.repository.ProductTypeRepository;
import com.ingeneo.pruebatecnica.services.interfaces.ProductTypeService;
import com.ingeneo.pruebatecnica.utilities.helpers.Helpers;

@Service
public class ProductTypeImplementation implements ProductTypeService{

	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@Override
	public List<ProductTypeDTO> findAll() {
		List<ProductTypeDTO> product = new ArrayList<>();
		List<ProductType> pt = this.productTypeRepository.findAll();
		
		for(ProductType productT: pt) {
			ProductTypeDTO pdt = ProductTypeDTO.builder()
					.idTipoProducto(productT.getIdTipoProducto())
					.nombreTipoProducto(productT.getNombreTipoProducto())
					.build();
			product.add(pdt);
		}
		return product;
	}

	@Override
	public ProductTypeDTO findByNombreTipoProducto(String nombreTipoProducto) {
		Optional<ProductType> pdt = this.productTypeRepository.findByNombreTipoProducto(nombreTipoProducto);
		
		if(!pdt.isPresent()) {
			return null;
		}
		
		ProductType product = pdt.get();
		
		return ProductTypeDTO.builder()
				.idTipoProducto(product.getIdTipoProducto())
				.nombreTipoProducto(product.getNombreTipoProducto())
				.build();
	}

	@Override
	public ProductTypeDTO findByIdTipoProducto(int idTipoProducto) {
		Optional<ProductType> pdt = this.productTypeRepository.findById(idTipoProducto);
		
		if(!pdt.isPresent()) {
			return null;
		}
		return Helpers.modelMapper().map(pdt.get(), ProductTypeDTO.class);
	}

	@Override
	public void save(ProductTypeRequest productType) {
		ProductType pdt = Helpers.modelMapper().map(productType, ProductType.class);
		
		this.productTypeRepository.save(pdt);
		
	}

	@Override
	public void saveAll(List<ProductTypeRequest> productType) {
		List<ProductType> pdt = new ArrayList<>();
		
		for(ProductTypeRequest product: productType) {
			ProductType pt = Helpers.modelMapper().map(product, ProductType.class);
			pdt.add(pt);
		}
		this.productTypeRepository.saveAll(pdt);
		
	}

	@Override
	public void update(ProductTypeRequest productType, int idTipoProducto) {
		Optional<ProductType> pdt = this.productTypeRepository.findById(idTipoProducto);
		
		if(pdt.isPresent()) {
			ProductType product = pdt.get();
			
			product.setNombreTipoProducto(productType.getNombreTipoProducto());
			
			this.productTypeRepository.save(product);
		}
		
	}

	@Override
	public void deleteById(int idTipoProducto) {
		this.productTypeRepository.deleteById(idTipoProducto);
		
	}

}
