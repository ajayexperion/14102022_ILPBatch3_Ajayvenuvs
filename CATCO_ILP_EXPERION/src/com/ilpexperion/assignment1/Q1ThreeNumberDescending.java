package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q1ThreeNumberDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int temp;
		System.out.println("enter the numbers: ");
		firstNumber=scanner.nextInt();
		secondNumber=scanner.nextInt();
		thirdNumber=scanner.nextInt();
		if((firstNumber<secondNumber)&&(firstNumber<thirdNumber)) {
			temp=thirdNumber;
			thirdNumber=firstNumber;
			firstNumber=temp;
			if(firstNumber<secondNumber) {
				temp=firstNumber;
				firstNumber=secondNumber;
				secondNumber=temp;
				
			}
		}
		if((secondNumber<thirdNumber)&&(secondNumber<firstNumber)) {
			temp=thirdNumber;
			thirdNumber=secondNumber;
			secondNumber=temp;
			if(secondNumber>firstNumber) {
				temp=firstNumber;
				firstNumber=secondNumber;
				secondNumber=temp;
				
			}
		}
		if((thirdNumber<secondNumber)&&(thirdNumber<firstNumber)) {
//			temp=secondNumber;
//			secondNumber=thirdNumber;
//			thirdNumber=temp;
			if(secondNumber>firstNumber) {
				temp=firstNumber;
				firstNumber=secondNumber;
				secondNumber=temp;
				
			}
		}
		
	
		System.out.println("******Descending order of tnree number*********");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		
		}

}
