package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerName;
    private ArrayList<Account> AccountList;
	private String cutomerID;
	
	public Customer(String customerName, ArrayList<Account> accountList, String cutomerID) {
		super();
		this.customerName = customerName;
		AccountList = accountList;
		this.cutomerID = cutomerID;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getAccountList() {
		return AccountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		AccountList = accountList;
	}
	public String getCutomerID() {
		return cutomerID;
	}
	public void setCutomerID(String cutomerID) {
		this.cutomerID = cutomerID;
	}
	

	
	
}
