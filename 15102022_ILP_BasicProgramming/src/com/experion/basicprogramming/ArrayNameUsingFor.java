package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayNameUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String productNames[]=new String[5];
		System.out.println("enter the product name");
		for(int index=0;index<productNames.length;index++) {
			productNames[index]=scanner.nextLine();
		}
		System.out.println("*********** Product In Stock ******************* ");
		for (int index = 0; index < productNames.length; index++) {
		System.out.println(productNames[index]);

		}

	}

}
