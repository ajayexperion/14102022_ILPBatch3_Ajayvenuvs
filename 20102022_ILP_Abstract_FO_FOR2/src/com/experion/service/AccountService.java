package com.experion.service;

import com.experionen.entity.Account;

public class AccountService {

	public void depositeCash(Account account,double amount) {
		
		System.out.println("Deposting money by cash");
		
	}
   public void depositeCash(Account account,String chequeNumber,double amount) {
	   System.out.println("Deposting money by cheque");
//	   System.out.println(account.getAccountBalance()+""+account.getProductName());
		
	}
   
   public void depositeCash(Account account,double amount,String chequeNumber) {
	   
	   System.out.println("Deposting money by Online Transfer");
		
	}

}
