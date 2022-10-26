package com.experion.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	 
	
	public static Product createProduct() {

		

			Scanner scanner = new Scanner(System.in);

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();

			System.out.println("Enter the product code");
			String productCode = scanner.nextLine();

			System.out.println("Enter the product name");
			String productName = scanner.nextLine();

			System.out.println("Enter the product price");
			double productPrice = scanner.nextDouble();

			System.out.println("Enter the expiry date");
			LocalDate expiryDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

			System.out.println("Enter the open date");
			LocalDate openDate =LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

			System.out.println("Enter the validity date");
			LocalDate validityDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
//			System.out.println("Enter product active");
//			boolean active = scanner.nextBoolean();

			
			
			
		 
		Product product = new Product(productCode,productName,productPrice,openDate,validityDate,expiryDate,active);
		 
//		 product.setSerialNO(product.getSerialNO()+1);
//		 product.setSerialNoOg(product.getSerialNO());
		 return product;
		 
//		 product.setProductCode(productCode);
//		 product.setProductName(productName);
//		 product.setProductDescription(productDescription);
	}

	
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
//				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
//				LocalDateTime now = LocalDateTime.now();
//				Date currentDate = dtf.format(now);
				
				
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

