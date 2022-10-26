package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.service.Service;
import com.experionen.entity.Product;



public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>productList=new ArrayList<Product>();
		
char mainChoice;
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("To Add Card:Press One");
			System.out.println("To Account:Press two");
			System.out.println("To Buy Product:Press Three");
			System.out.println("To Buy Product:Press four");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:productList.add(Service.createProduct("Cards"));
			
			break;
			
			case 2: productList.add(Service.createProduct("Accounts"));
			break;
			
			case 3: Service.buyProduct();
			break;
			
			case 4: Service.displayProduct(productList);
			}
			System.out.println("Do you want to continue y/n");
			mainChoice=scanner.next().charAt(0);
			}
		while(mainChoice=='y');
}

	

}
