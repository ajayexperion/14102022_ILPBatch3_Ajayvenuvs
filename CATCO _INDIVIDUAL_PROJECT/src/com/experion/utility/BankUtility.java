package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.BankProducts;
import com.experion.service.SavingsMaxAccount;




public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankProducts>productList=new ArrayList<BankProducts>();
		do {
		System.out.println("************Welcome To Bank***************");
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.CreateAccount   2. ManageAccount   3.Exit");
		int choice=scanner.nextInt();
		if(choice==1) {
			
			System.out.println("Which Account would you like to Create");
			System.out.println("1.SAVING MAX ACCOUNT   2. CURRENT ACCOUNT   3.LOAN ACCOUNT");
			int choicetwo=scanner.nextInt();
			if(choicetwo==1) {
				productList.add(Account.account());
				System.out.println("Savings Account created");
			}
			if(choicetwo==2) {
				productList.add(Account.account());
				System.out.println("Current Account Created");
			}
			if(choicetwo==3) {
				productList.add(Account.account());
				System.out.println("Loan Account Created");
			}
		
		}
		if(choice==2) {
			System.out.println("choose your account type");
			System.out.println("1.SAVINGS   2.CURRENT     3.LOAN   ");
			int choicethree=scanner.nextInt();
			if (choice==1){
			
			System.out.println("Which Service would you like to do");
			System.out.println("1.CASH DEPOSIT   2.ATM WITHDRAWL     3.ONLINE BANKING  ");
			int choicefour=scanner.nextInt();
			if(choicethree==1) {
				System.out.println("enter the customer Id");
				String customerId=scanner.nextLine();
				for(BankProducts details:productList) {
				if(details.getCostumerID().compareTo(customerId)==0) {
					SavingsMaxAccount savings=new SavingsMaxAccount();
					savings.cashDeposite();
						
					
				}
			}
			
		}
		
		}
			
		}	
			
			
			
			
			
			
		}
	}

}
