package com.experion.service;

import com.experion.entity.Account;

public class  CurrentAccount extends Account implements CashDeposite  {

//	private double amount;
//	
//	public SavingsMaxAccount(double amount) {
//		super();
//		this.amount = amount;
//	}
//
//
//	public double getAmount() {
//		return amount;
//	}
//
//
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}


	
	
	@Override
	public  void cashDeposite() {
		// TODO Auto-generated method stub
			System.out.println("Cash deposited intiated");
		
	}

}
