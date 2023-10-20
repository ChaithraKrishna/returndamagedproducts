package com.week5.codebase_MS1_ReturnProducts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="DamagedProducts")
public class DamagedProducts {
	
	
	 @Id
      int id;
      String product_name;
      String reason_to_return;
      String customer_name;
	public int getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = (int) id2;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getReason_to_return() {
		return reason_to_return;
	}
	public void setReason_to_return(String reason_to_return) {
		this.reason_to_return = reason_to_return;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public DamagedProducts(int id, String product_name, String reason_to_return, String customer_name) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.reason_to_return = reason_to_return;
		this.customer_name = customer_name;
	}
	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
      
      
}
