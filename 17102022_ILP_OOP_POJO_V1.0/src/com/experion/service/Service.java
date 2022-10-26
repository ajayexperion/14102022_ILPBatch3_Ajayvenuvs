package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	 
	
	public static Product createProduct() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode = scanner.nextLine();
		

		System.out.println("Enter the product name");
		String productName = scanner.nextLine();
		
		
		System.out.println("Enter the product description");
		 String productDescription = scanner.nextLine();
		 
		 
		 Product product=new Product(productCode,productName,productDescription);
		 return product;
		 
//		 product.setProductCode(productCode);
//		 product.setProductName(productName);
//		 product.setProductDescription(productDescription);
	}

	public static void  dispalyProductDetails(Product productList[]) {
		System.out.println("productName" + "		" + "productDescription" + "		" + "productPrice" + "		"
				+ "openDate" + "		" + "expiryDate");
		for(Product product:productList)
			if(product!=null) {
	
				System.out.println(product.getProductCode() + "		" + product.getProductName() + "		" + product.getProductDescription() );
			}
}}
