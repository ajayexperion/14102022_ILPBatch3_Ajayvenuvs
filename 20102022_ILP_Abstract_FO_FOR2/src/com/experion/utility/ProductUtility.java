package com.experion.utility;

import java.util.Scanner;

import com.experionen.entity.Account;
import com.experionen.entity.Card;
import com.experionen.entity.Loan;
import com.experionen.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Account account =new Account("womens Saving Account","AC1234",10000);
//		AccountService accountService=new AccountService();
//		accountService.depositeCash(account, 20000);
//		accountService.depositeCash(account,0, "ajay123@gmail.com");
//		accountService.depositeCash(account, "SGDHFKDJ155",20000);
		Product product=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Account  2.card   3.Loan");
		int choice=scanner.nextInt();
		if(choice==1) {
			product =new Account ("womens Saving Account","ASJSS",100000);
			Account account=(Account)product;
			account.cashWithdrwal();
			account.checkBalance();
		}
		else if(choice==2){
			product =new Card ("mastercard","ASDFS",100000);
			Card card =(Card)product;
			card.cashWithdrwal();
			card.checkBalance();
			
		}
		else if(choice==3){
			product =new Loan ("Home loan","ASJ23",100000);
			Loan loan=(Loan)product;
			loan.checkDueDAte();
			loan.loanApproval();
		}
		product.checkProductValidity();
		
}

	

}
