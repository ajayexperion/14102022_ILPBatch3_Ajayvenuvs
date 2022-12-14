package com.bank.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Service;
import com.bank.service.BankService;
import com.bank.service.CreatePdf;


public class BankUtility {

	public static void main(String[] args) throws IOException {
		
		Customer customerList=null;
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Service> allServicesList = new ArrayList<Service>();
		allServicesList=BankService.createServices();
		Scanner scanner=new Scanner(System.in);
		
		char mainChoice;
		
		do {
			
		System.out.println("************Welcome To Bank***************");
		
		System.out.println("1.CreateAccount   2. ManageAccount   3.DisplayAccount 4.Print AccountDetails");
		int choice=scanner.nextInt();
		switch(choice) {
			case 1:	customerList=BankService.createAccount(allServicesList);
				break;
				
			case 2:
			System.out.println("Enter the customer code: ");
			String customerCode = scanner.next();
		
//			System.out.println(customerCode);
//			scanner.next();
			
			if(customerList !=null) {
				
				if(customerCode.compareTo(customerList.getCutomerID()) == 0) {
					
					System.out.println("enetring to manage");
					BankService.manageAccount(customerList);
					
				}else
					System.out.println("Sorry you dont have an Account...!!!! Please Enter the correct Customer ID or Create A new Account:");
					System.out.println("____________________________________________________________________");
					System.out.println("To create Account Press One");
					System.out.println("To Reenter the customer Id Press Two");
					int press=scanner.nextInt();
					if(press==1) {
						customerList=BankService.createAccount(allServicesList);
					}
					if(press==2) {
						System.out.println("Enter the customer code: ");
						String customerCd = scanner.next();
						if(customerCd.compareTo(customerList.getCutomerID()) == 0) {
							
							System.out.println("enetring to manage");
							BankService.manageAccount(customerList);
						
							}else
								System.out.println("Invalid Id");
								
							
					}
				
				
			}else
				System.out.println("Sorry you dont have an Account...!!!! Please create a Account For Managing Account:");
				System.out.println("____________________________________________________________________");
				System.out.println("To create Account Press One");
				int press=scanner.nextInt();
				if(press==1) {
				customerList=BankService.createAccount(allServicesList);
			}
			break;
				
			
			
			case 3:BankService.displayCustomer(customerList);
			
			break;
			case 4: 
			CreatePdf.main(args);
			
			
		}
		
		
		System.out.println("Do you want to continue to other bank services? (y/n)");
		mainChoice = scanner.next().charAt(0);
		}
		
		while(mainChoice=='y');
		}
}
	
			
				
				
				
			
		
			
		
				
				
				
				
				
			
			
			
			

