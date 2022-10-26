package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q18FebanociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int lastNumber;
		int firstNumber=1;
		int secondNumber=1;
		int thirdNumber;
		int sum=0;
		System.out.println("Enter the Nth number: ");
		lastNumber=scanner.nextInt();
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int index=2;index<lastNumber;index++) {
			thirdNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			//sum=sum+(thirdNumber)*(thirdNumber)*(thirdNumber);
			System.out.println(thirdNumber);
		}
		
		

	}

}
