package com.experion.service;

import com.experion.entity.Account;

public class  SavingsMaxAccount extends Account implements CashDeposite,Atmwithdraw,OnlineBanking  {

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

	@Override
	public void onlineBankingSystem() {
		// TODO Auto-generated method stub
		System.out.println("Online banking intiated");
	}

	@Override
	public void atmBanking() {
		// TODO Auto-generated method stub
		System.out.println("Atm withdraw intiated");
	}

}
