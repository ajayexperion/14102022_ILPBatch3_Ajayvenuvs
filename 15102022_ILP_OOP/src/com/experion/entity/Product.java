package com.experion.entity;

import java.util.Scanner;

public class Product {
	String productCode;
	public String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;

	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product code");
		productCode = scanner.nextLine();

		System.out.println("Enter the product name");
		productName = scanner.nextLine();

		System.out.println("Enter the product description");
		productDescription = scanner.nextLine();

		System.out.println("Enter the product Price");
		productPrice = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the product open date");
		openDate = scanner.nextLine();
		

		System.out.println("Enter the product Validity date");
		validityDate = scanner.nextLine();
		

		System.out.println("Enter the product Experiy date");
		expiryDate = scanner.nextLine();
		

		System.out.println("Enter the product Active(true or false)");
		active = scanner.nextBoolean();
	}

	public void dispalyProductDetails() {
		System.out.println("productName" + "		" + "productDescription" + "		" + "productPrice" + "		"
				+ "openDate" + "		" + "expiryDate");
		System.out.println(productName + "		" + productDescription + "		" + productPrice+ "		"
				+ openDate + "		" + expiryDate);
	}

}
