package com.dmdeveloper.dsmeta.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.dsmeta.DTO.SaleDTO;
import com.dmdeveloper.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findSalesDate(
			@RequestParam(value="minDate", defaultValue = "") String minDate,
			@RequestParam(value="maxDate", defaultValue = "") String maxDate,
			Pageable pageable) {
		
		Page<SaleDTO> sales = service.findSalesDate(minDate, maxDate, pageable);
		return ResponseEntity.ok().body(sales);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SaleDTO> findById(@PathVariable Long id) {
		SaleDTO sale = service.findById(id);
		return ResponseEntity.ok().body(sale);
	}
}
