package com.week5.codebase_MS1_ReturnProducts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week5.codebase_MS1_ReturnProducts.entity.DamagedProducts;



public interface DamagedProductsrepo  extends JpaRepository<DamagedProducts, Integer> {
	

}
