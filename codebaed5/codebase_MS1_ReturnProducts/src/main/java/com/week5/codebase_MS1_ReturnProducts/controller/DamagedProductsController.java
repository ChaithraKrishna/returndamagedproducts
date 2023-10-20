package com.week5.codebase_MS1_ReturnProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.week5.codebase_MS1_ReturnProducts.entity.DamagedProducts;
import com.week5.codebase_MS1_ReturnProducts.repository.DamagedProductsrepo;

@RequestMapping("/dps")
@RestController
public class DamagedProductsController {
	
	
	
		
				
				//CRUD with Customer care
				
				@Autowired
				       DamagedProductsrepo DamagedProductsRepository;
				
				@GetMapping("/getDamagedProducts")
				public List< DamagedProducts> getDamagedProducts() {

					return DamagedProductsRepository.findAll(); // select * from <TableName>;
				}
					
					@PostMapping("/addDamagedProducts")
					public DamagedProducts createuser(@RequestBody DamagedProducts dps) {
						return DamagedProductsRepository.save(dps);
					}
					
				
					@DeleteMapping("/deleteDamagedProducts/{id}")
					public void deleteDamagedProducts(@PathVariable("id") Integer id  ) {

				 

						DamagedProductsRepository.deleteById(id); // select * from <TableName>;

					}
					@PutMapping("/DamagedProducts/{id}")

					public ResponseEntity<Object> updateShipping(@RequestBody DamagedProducts  damagedproducts, @PathVariable long id) {

				 

				Optional<DamagedProducts> damagedproductsOptional = DamagedProductsRepository.findById((int) id);

				 

					if (damagedproductsOptional .isEmpty())

					return ResponseEntity.notFound().build();

				 

					damagedproducts.setId(id);

					

					DamagedProductsRepository.save(damagedproducts);

				 

					return ResponseEntity.noContent().build();

					}
					
					
				}

			



			



