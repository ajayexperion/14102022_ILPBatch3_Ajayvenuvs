package com.experion.utility;



import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mainChoice;
		
		Scanner scanner=new Scanner(System.in);
		//Product productList[]=new Product[3];
		// here instead of creating object array create a ArrayList for multiple object creation
		ArrayList<Product>productList=new ArrayList<Product>();
		do {
			System.out.println("To Add Product:Press One");
			System.out.println("To Display Product:Press two");
			System.out.println("To Buy Product:Press Three");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1: productList.add(Service.createProduct());
			
			break;
			
			case 2: Service.dispalyProductDetails(productList);
			break;
			
			case 3: Service.buyProduct(productList);
			break;
			
			default: System.out.println("Invalid choice");

			}
			System.out.println("Do you want to continue y/n");
			mainChoice=scanner.next().charAt(0);
			
			}
		while(mainChoice=='y');
}
}