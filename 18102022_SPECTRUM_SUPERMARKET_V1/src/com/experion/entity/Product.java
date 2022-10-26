package com.experion.entity;

import java.time.LocalDate;

public class Product {
//	private int SerialNoOg;
	private String productCode;
	private String productName;
	private double productPrice;
	private LocalDate openDate;
	private LocalDate validityDate;
	private LocalDate expiryDate;
	private boolean active=true;
//	private static int serialNO;
	
	
	
	
	
	
	public Product( String productCode, String productName, double productPrice, LocalDate openDate,
			LocalDate validityDate, LocalDate expiryDate, boolean active) {
	
//		SerialNoOg = serialNoOg;
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
		this.active = active;
	}
//	public int getSerialNoOg() {
//		return SerialNoOg;
//	}
//	public void setSerialNoOg(int serialNoOg) {
//		SerialNoOg = serialNoOg;
//	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public LocalDate getOpenDate() {
		return openDate;
	}
	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}
	public LocalDate getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(LocalDate validityDate) {
		this.validityDate = validityDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
//	public static int getSerialNO() {
//		return serialNO;
//	}
//	public static void setSerialNO(int serialNO) {
//		Product.serialNO = serialNO;
//	}

	

//	public Product(String productCode, String productName, String productDescription) {
//		super();
//		this.productCode = productCode;
//		this.productName = productName;
//		this.productDescription = productDescription;
//	}
	

	
	}


