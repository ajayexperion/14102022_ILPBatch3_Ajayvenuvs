package com.experion.utility;



import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mainChoice;
		int index =0;
		Scanner scanner=new Scanner(System.in);
		Product productList[]=new Product[3];
		do {
			System.out.println("1 create  product 2 display Product");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1: productList[index]=Service.createProduct();
			index++;
			case 2: Service.dispalyProductDetails(productList);
			}
			System.out.println("Do you want to continue y/n");
			mainChoice=scanner.next().charAt(0);
			}
		while(mainChoice=='y');
}
}