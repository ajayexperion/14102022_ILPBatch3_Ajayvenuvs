package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondLargestamongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		System.out.println("Enter the first number-");
		firstNumber=scanner.nextInt();
		System.out.println("Enter the second number-");
		secondNumber=scanner.nextInt();
		System.out.println("Enter the third number-");
		thirdNumber=scanner.nextInt();
		if((firstNumber>secondNumber)&&(firstNumber>thirdNumber)){
			if(secondNumber>thirdNumber){
					System.out.println("the second largest number is"+secondNumber);
				}
			else {
				System.out.println("the second largest number is"+thirdNumber);
			}
		}
		else if((secondNumber>firstNumber)&&(secondNumber>thirdNumber)) {
			
				if(firstNumber>thirdNumber) {
			System.out.println("the second largest number is"+firstNumber);
		
				
			}
				else {
					System.out.println("the second largest number is"+thirdNumber);
				}
		}
		
		else if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)) {
			if(firstNumber>secondNumber) {
				System.out.println("the second largest number is"+firstNumber);
			
					
				}
					else {
						System.out.println("the second largest number is"+secondNumber);
					}
		}
	}

}
	
