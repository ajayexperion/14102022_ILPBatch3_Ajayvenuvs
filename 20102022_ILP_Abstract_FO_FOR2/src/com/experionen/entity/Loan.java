package com.experionen.entity;

import com.experion.service.LoanServices;

public class Loan extends Product implements LoanServices	 {
	
	
private String loanNumber;
private double loanAmount;
public Loan(String productName, String loanNumber, double loanAmount) {
	super(productName);
	this.loanNumber = loanNumber;
	this.loanAmount = loanAmount;
}
public String getLoanNumber() {
	return loanNumber;
}
public void setLoanNumber(String loanNumber) {
	this.loanNumber = loanNumber;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
@Override
public void checkProductValidity() {
	// TODO Auto-generated method stub
	System.out.println("validity check of Loan class");
}
@Override
public void checkDueDAte() {
	// TODO Auto-generated method stub
	System.out.println(" check of Loan class");
}
@Override
public void loanApproval() {
	// TODO Auto-generated method stub
	System.out.println("loanApproval check of Loan class");
}




}
