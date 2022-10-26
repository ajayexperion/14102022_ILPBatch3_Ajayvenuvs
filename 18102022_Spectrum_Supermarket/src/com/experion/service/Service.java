package com.experion.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	
	public static Product createProduct() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product code: ");
		String productCode = scanner.nextLine();
		
		
		System.out.println("Enter the product name: ");
		String productName = scanner.nextLine();
		 
		
		System.out.println("Enter the product description: ");
		String productDescription = scanner.nextLine();
		
		
		System.out.println("Enter the product price: ");
		double productPrice = scanner.nextDouble();
		
		
		scanner.nextLine();
		
		System.out.println("Enter the openDate: ");
		String openDate = scanner.nextLine();
		
		
		System.out.println("Enter the validityDate: ");
		String validityDate = scanner.nextLine();
		
		
		System.out.println("Enter the expiryDate: ");
		String expiryDate = scanner.nextLine();
		
		
		System.out.println("Active (ture/false): ");
		boolean active = scanner.nextBoolean();
		
		
		Product product = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		product.setSerialNo(product.getSerialNo()+1);
		product.setSerialNoOrginal(product.getSerialNo());
		return product;		
	}
	
	

//	public static void displayProductDetails(ArrayList <Product> productList) {
//
//		System.out.println("Sl No." + "			"+"Product Name" + "			" + "Product Decription" + "				" + "Product Price"
//				+ "		" + "Open Date" + "		" + "Expiry Date");
//		
//		for(Product product:productList) {
//			if(product!=null)
//			System.out.println(product.getSerialNoOrginal() + "		" +product.getProductName() + "		" + product.getProductDescription() + "			" + product.getProductPrice() + "		"
//					+ product.getOpenDate() + "		" + product.getExpiryDate());
//		}}
		
		public static void buyProduct(ArrayList <Product> productList)
		{
			String productCode;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the product code:");
			productCode = scanner.nextLine();
			
			for(Product product:productList)
			{
				if(product.getProductCode() == productCode)
				{
//					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
//					LocalDateTime now = LocalDateTime.now();
//					Date currentDate = dtf.format(now);
					
					
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
				    Date date = new Date();  
					if((formatter.format(date).isAfter(product.getOpenDate()))&&(formatter.format(date).isBefore(product.getValidityDate)))
						System.out.println("You can purchase the product with product code "+productCode);
					else
						System.out.println("Sorry!! You cannot purchase the product with product code "+productCode);
				}
				
			}
			
			
			
		}
		

	}

