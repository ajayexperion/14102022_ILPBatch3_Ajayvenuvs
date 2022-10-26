package com.experion.entity;

public class BankProducts  {

	private String customerName;

	private String costumerID;
	private double amount;
	public BankProducts(String customerName, String costumerID, double amount) {
		super();
		this.customerName = customerName;
		this.costumerID = costumerID;
		this.amount = amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCostumerID() {
		return costumerID;
	}
	public void setCostumerID(String costumerID) {
		this.costumerID = costumerID;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	

}
