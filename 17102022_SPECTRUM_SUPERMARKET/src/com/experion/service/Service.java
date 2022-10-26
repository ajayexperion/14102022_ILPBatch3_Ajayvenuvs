package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	Product productList[]=new Product[3];
	//Product product = new Product();
	int i=0;
	
	public void stockUpdation() {
		
		  for (int n = 0; n < productList.length; n++) {
			  productList[n] = new Product(); 
			  }
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		
		
		productList[i].setProductCode(productCode);
		productList[i].setProductName(productName);
		productList[i].setProductDescription(productDescription);
		productList[i].setProductPrice(productPrice);
		productList[i].setExpiryDate(expiryDate);
		i++;

	}

	public void stockDisplay() {
		for(i=0;i<3;i++) {
			if(productList[i]!=null) {

		System.out.println("the productCode is:"+productList[i].getProductCode());
		System.out.println("the productname is:"+productList[i].getProductName());
		System.out.println("the productDescription is:"+productList[i].getProductDescription());
		System.out.println("the productPrice is:"+productList[i].getProductPrice());
		System.out.println("the productExpiryDate is:"+productList[i].getExpiryDate());
			}
	}

	}
	
	

}
