package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.common.PDRectangle;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Service;

public class BankService  {
	
	public static ArrayList<Service> createServices() {

		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		allServiceList.add(new Service("Online Banking"));

		return allServiceList;

	}

	

	private static Account createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)) {
				loanServiceList.add(service);
			}
		}
		System.out.println("Following Services are available in this accaount");
		for(Service service :loanServiceList )
		{
			
		System.out.println(service.getServiceName());
		}
		Account account = new Account("PRDLOAN100", "***********LOAN ACCOUNT***********", loanServiceList, 10000);
		return account;

	}

	private static Account createCurrentAccount(ArrayList<Service> allServiceList) {
		// TODO Auto-generated method stub

		ArrayList<Service> currentServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Online Banking") == 0)
					|| (service.getServiceName().compareTo("Mobile Banking") == 0)) {
				currentServiceList.add(service);
			}
		}
		System.out.println("Following Services are available in this accaount");
		for(Service service :currentServiceList )
		{
			
		System.out.println(service.getServiceName());
		}
		
		Account account = new Account("PRDCURRENT100", "************CURRENT ACCOUNT***********", currentServiceList, 10000);
		return account;

	}

	private static Account createSavingsMaxAccount(ArrayList<Service> allServiceList) {
		// TODO Auto-generated method stub
		ArrayList<Service> savingsMaxList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Online Banking") == 0)) {
				savingsMaxList.add(service);
			}
		}
		System.out.println("Following Services are available in this accaount");
		for(Service service :savingsMaxList )
		{
			
		System.out.println(service.getServiceName());
		}
		
		Account account = new Account("PRDSAVING100", "*******SAVING MAX ACCOIUNT*******", savingsMaxList, 10000);
		return account;
	}
	public static Customer createAccount(ArrayList<Service> allServicesList) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		char mainChoice;
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the customer name");
		String customerName=scanner.nextLine();
		
		System.out.println("Enter the customer ID");
		String customerID=scanner.nextLine();
		
		
		do {
			System.out.println("1.Savings Max Account");
			System.out.println("2.Current Account");
			System.out.println("3.Loan Account");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: accountList.add(createSavingsMaxAccount(allServicesList));
			System.out.println("Savings Max Account created for " + customerName);
			break;
			
			case 2: accountList.add(createCurrentAccount(allServicesList));
			System.out.println("Current Account created for " + customerName);
			break;
			
			
			case 3: accountList.add(createLoanAccount(allServicesList));
			System.out.println("Loan Account created for " + customerName);
			break;
			
			}
			
			System.out.println("Do you want to continue creating other accounts? (y/n)");
			 mainChoice = scanner.next().charAt(0);
		}while(mainChoice=='y');
		
		
		Customer customer=new Customer(customerName,accountList,customerID);
		return customer;
		
	}
	
	

	
	
	
	
	
	
	
	public static void  displayCustomer(Customer customer) {
		for(Account account:customer.getAccountList())
		System.out.println(customer.getCustomerName()+"      "+customer.getCutomerID()+"   "+account.getProductName()+"     ");
		
			
	}

	
	public static  void  manageAccount(Customer customerList) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Account actionAccount=null;
		String accChoice;
		int actionChoice;
		int i = 1;
		accountList=customerList.getAccountList();
		for (Account account : accountList) {
			System.out.println(i + ". " + account.getProductName());
			i++;
		}
		System.out.println("Enter your choice: (ex:Current Account)");
		accChoice = scanner.nextLine();
		for(Account account:accountList)
		{
			if(accChoice.compareTo(account.getProductName())==0)
				actionAccount = account;
		}
		
		if((accChoice.compareTo("Savings Max Account")==0)||(accChoice.compareTo("Current Account")==0))
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display");
			System.out.println("Enter your choice:");
			actionChoice = scanner.nextInt();
			
			switch(actionChoice)
			{
			case 1: deposit(actionAccount);
					break;
			case 2: withdraw(actionAccount);
					break;
			case 3: displayAccounts(customerList);
					break;
			default: System.out.println("Invalid Choice");

			}
		}
		else if((accChoice.compareTo("Loan Account")==0))
		{
			System.out.println("1.Deposit");
			System.out.println("2.Display");
			System.out.println("Enter your choice:");
			actionChoice = scanner.nextInt();
			
			switch(actionChoice)
			{
			case 1: deposit(actionAccount);
					break;
			case 2: displayAccounts(customerList);
					break;
			default: System.out.println("Invalid Choice");
			}
		}
		
		else
			System.out.println("Invalid choice");			
		
	}
	
	private static void withdraw(Account account) {
		double amount;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the amount to deposite");
		amount = scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()-amount);
		System.out.println(amount+"RS"+"Withdrwa");
		System.out.println("Your account balance is"+account.getAccountBalance());
		
	}
	
	private static void deposit(Account account) {
		double amount;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the amount to deposite");
		amount = scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+amount);
		System.out.println(amount+"RS"+"Deposite");
		System.out.println("Your account balance is"+account.getAccountBalance());

	}

	private static void displayAccounts(Customer customerList) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList=customerList.getAccountList();
		System.out.println("Displaying account details of "+customerList.getCustomerName()+" ("+customerList.getCutomerID()+")");
		System.out.println("AccountType"+"				"+"Account Balance");
		
		for(Account account:accountList)
		{
			System.out.println(account.getProductName()+"			"+account.getAccountBalance());	
		}
		
		
	}
	
}
