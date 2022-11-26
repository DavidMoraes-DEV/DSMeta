package com.dmdeveloper.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<SaleDTO> findSalesDate(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		
		Page<Sale> sales = repository.findSalesDate(
				minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate),
				maxDate.equals("") ? today : LocalDate.parse(maxDate),
				pageable
		);
		
		return sales.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public SaleDTO findById(Long id) {
		Optional<Sale> obj = repository.findById(id);
		Sale sale = obj.orElseThrow(() -> new ResourceNotFoundException("Entity Not Found"));
		return new SaleDTO(sale);
	}
}
