package com.experion.entity;

import java.util.Scanner;

public class Account {
	
	public static BankProducts account() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the product code");
		String costumerID = scanner.nextLine();

		System.out.println("Enter the product name");
		double customerName = scanner.nextDouble();
		
		System.out.println("Enter the intial deposite");
		String amount = scanner.nextLine();
		
		BankProducts accountDetails=new BankProducts(amount,costumerID,customerName);
		
		return accountDetails;
		
	}

}
