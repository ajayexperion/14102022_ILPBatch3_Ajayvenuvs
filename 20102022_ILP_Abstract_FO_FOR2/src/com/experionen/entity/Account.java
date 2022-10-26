package com.experionen.entity;

import com.experion.service.AccountCardServices;

public class Account extends Product implements AccountCardServices{
	
	
private String accountNumber;
private double accountBalance;
public Account(String productName, String accountNumber, double accountBalance) {
	super(productName);
	this.accountNumber = accountNumber;
	this.accountBalance = accountBalance;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
@Override
public void checkProductValidity() {
	// TODO Auto-generated method stub
	System.out.println("validity check of account class");
}
@Override
public void checkBalance() {
	// TODO Auto-generated method stub
	System.out.println("checkbalanvce of account class is intiated");
}
@Override
public void cashWithdrwal() {
	// TODO Auto-generated method stub
	System.out.println("cashwithdrawl of account class is intiated");
}






}
