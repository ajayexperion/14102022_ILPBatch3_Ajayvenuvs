package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		int choice;
		char ch;
		
		do
		{
			System.out.println("********* SUPERMARKET******** ");
			System.out.println("IF YOU WANT TO ADD STOCK PLEASE PRESS 1");
			System.out.println("IF YOU WANT TO DISPLAY PRESS 2");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1: service.stockUpdation();
			        break;
			case 2: service.stockDisplay();
			        break;
			default: System.out.println("Invalid choice");
			
			
			}
			scanner.nextLine();
			System.out.println("Do you want to continue- yes or no");
			ch=scanner.next().charAt(0);
			
		}
		while(ch=='y');
		

	}

}
