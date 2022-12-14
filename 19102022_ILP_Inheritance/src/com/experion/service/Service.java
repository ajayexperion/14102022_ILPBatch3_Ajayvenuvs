package com.experion.service;

import java.util.ArrayList;

import com.experionen.entity.Account;
import com.experionen.entity.BankServices;
import com.experionen.entity.Card;
import com.experionen.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		// TODO Auto-generated method stub
		ArrayList<BankServices> bankServices =new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100", "Online Banking"));
		bankServices.add(new BankServices("SMB100", "MOBILE Banking"));
		bankServices.add(new BankServices("SCD", "CASH deposite"));
		Product product = null;
		if (productType.compareTo("Cards") == 0) {

			product = new Card("MASTERCARD100", "MasterCard", "cards", "Master");
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("PRDWSA100", "Womens Account", "Account", "SavingsAccount", bankServices);
		}
		return product;
	}

	public static void buyProduct() {
		// TODO Auto-generated method stub

	}

	public static void displayProduct(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		System.out.println("Products Code" + "   " + "productname" + "   " + "productType"+"   "+"product"+"    "+"Services");

		Card card = null;
		Account account = null;
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product;
				System.out.println(card.getProductCode() + "   " + card.getProductName() + "     "
						+ card.getProductType() + "  " + card.getCardType());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(
						account.getProductCode() + "   " + account.getProductName() + "     " + account.getProductType()
								+ "  " + account.getAccountType() + "  " );
				System.out.println("The list of Services are given Below");
				for(BankServices bankServices:account.getBankServices()) {
					System.out.println(bankServices.getServiceName());
				}
			}
		}
	}

}
