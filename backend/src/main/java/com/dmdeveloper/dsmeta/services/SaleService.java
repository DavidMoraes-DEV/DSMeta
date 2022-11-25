package com.dmdeveloper.dsmeta.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.dsmeta.DTO.SaleDTO;
import com.dmdeveloper.dsmeta.entities.Sale;
import com.dmdeveloper.dsmeta.repositories.SaleRepository;
import com.dmdeveloper.dsmeta.services.exceptions.ResourceNotFoundException;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Transactional(readOnly = true)
	public List<SaleDTO> findAll() {
		List<Sale> sales = repository.findAll();
		return sales.stream().map(sale -> new SaleDTO(sale)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public SaleDTO findById(Long id) {
		Optional<Sale> obj = repository.findById(id);
		Sale sale = obj.orElseThrow(() -> new ResourceNotFoundException("Entity Not Found"));
		return new SaleDTO(sale);
	}
}
