package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapTwoNumberWithoutTempVar {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int variableOne;
		int variableTwo;
		
		System.out.println("Enter the first number-");
		variableOne=scanner.nextInt();
		System.out.println("Enter the second number-");
		variableTwo=scanner.nextInt();
		System.out.println("****NUMBER BEFORE SWAP******");
		System.out.println("variableOne="+variableOne);
		System.out.println("variableTwo="+variableTwo);
		variableOne=variableOne+variableTwo;
		variableTwo=variableOne-variableTwo;
		variableOne=variableOne-variableTwo;
		System.out.println("****NUMBER AFTER SWAP******");
		System.out.println("variableOne="+variableOne);
		System.out.println("variableTwo="+variableTwo);

	}

}
