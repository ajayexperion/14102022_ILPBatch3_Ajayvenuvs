package com.experion.entity;

import java.time.LocalDate;

public class Product {
//	private int SerialNoOg;
	private String productCode;
	private String productName;
	private double productPrice;
	private String openDate;
	private String validityDate;
	private String expiryDate;
	private boolean active=true;
//	private static int serialNO;
	public Product(String productCode, String productName, double productPrice, String openDate, String validityDate,
			String expiryDate, boolean active) {
		
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
		this.active = active;
	}
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
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

	
	}