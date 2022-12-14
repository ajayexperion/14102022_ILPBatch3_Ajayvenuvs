package com.experion.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	public static Product createProduct() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the product code"); 
		String productCode = scanner.nextLine();

		System.out.println("Enter the product name");
		String productName = scanner.nextLine();

		System.out.println("Enter the product price");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the expiry date");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter the open date");
		String openDate = scanner.nextLine();
		System.out.println("Enter the validity date");
		String validityDate = scanner.nextLine();
//		System.out.println("Enter product active");
//		boolean active = scanner.nextBoolean();

		Product product = new Product(productCode, productName, productPrice, openDate, validityDate, expiryDate, true);

//		product.setSerialNO(product.getSerialNO() + 1);
//		product.setSerialNoOg(product.getSerialNO());
		return product;

//		 product.setProductCode(productCode);
//		 product.setProductName(productName);
//		 product.setProductDescription(productDescription);
	}

	public static void buyProduct(ArrayList<Product> productList) {
		String productCode;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product code:");
		productCode = scanner.nextLine();

		for (Product product : productList) {
			if (product.getProductCode().equals(productCode)) {

				LocalDate systemDate = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate openDate = LocalDate.parse(product.getOpenDate(), formatter);
				LocalDate validityDate = LocalDate.parse(product.getValidityDate(), formatter);

				if ((openDate.isBefore(systemDate)) && (validityDate.isAfter(systemDate)))
					System.out.println("You can purchase the product with product code " + productCode);
				else
					System.out.println("Sorry!! You cannot purchase the product with product code " + productCode);
			}

		}

	}

	public static void dispalyProductDetails(ArrayList<Product> productList) {
		for (Product product : productList) {
			LocalDate systemDate = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate expiryDate = LocalDate.parse(product.getExpiryDate(), formatter);

			if (systemDate.isAfter(expiryDate)) {
				product.setActive(false);
			} else {
				product.setActive(true);
			}
		}

		System.out.println("productName" + "		" + "productDescription" + "		" + "productPrice" + "		"
				+ "openDate" + "		" + "expiryDate");

		for (Product product : productList)
			if (product != null) {

				System.out.println(product.getProductCode() + "		" + product.getProductName() + "		" + "  "
						+ product.getExpiryDate() + " " + product.isActive());
			}
	}
}
