package com.experionen.entity;

import com.experion.service.AccountCardServices;

public class Card extends Product implements AccountCardServices{
	
	
private String cardNumber;
private double cardBalance;
public Card(String productName, String cardNumber, double cardBalance) {
	super(productName);
	this.cardNumber = cardNumber;
	this.cardBalance = cardBalance;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public double getCardBalance() {
	return cardBalance;
}
public void setCardBalance(double cardBalance) {
	this.cardBalance = cardBalance;
}
@Override
public void checkProductValidity() {
	// TODO Auto-generated method stub
	System.out.println("validity check of card class");
}
@Override
public void checkBalance() {
	// TODO Auto-generated method stub
	System.out.println("CArd Balance is intiated");
}
@Override
public void cashWithdrwal() {
	// TODO Auto-generated method stub
	System.out.println("CArd CashWithdrawl is intiated");
}






}
