package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class LastDigitEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number;
		int lastnumber;
		System.out.println("Enter the number-");
		number=scanner.nextInt();
		lastnumber=number/100;
		if (lastnumber%2==0){
			System.out.println("number is even-");
		}
		else{
			System.out.println("number is odd-");
		}
	}

}
