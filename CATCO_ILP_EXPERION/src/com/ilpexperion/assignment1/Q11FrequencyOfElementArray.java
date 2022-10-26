package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q11FrequencyOfElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int element,frequency=0;
		int numberArray[]=new int[7];
		
		System.out.println("Enter the 7 elements of the array: ");
		for(int i=0;i<numberArray.length;i++)
			numberArray[i]=scanner.nextInt();
		
		System.out.println("Enter the element whose frequency is to be found: ");
		element = scanner.nextInt();
		
		for(int i=0;i<numberArray.length;i++)
		{
			if(numberArray[i]==element)
				frequency++;
		}
		
		System.out.println("The frequency of the element "+element+" is "+frequency);

	}

}
