package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapTwoNumberWithTempVar {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int variableOne;
		int variableTwo;
		int variableTemp;
		System.out.println("Enter the first number-");
		variableOne=scanner.nextInt();
		System.out.println("Enter the second number-");
		variableTwo=scanner.nextInt();
		System.out.println("****NUMBER BEFORE SWAP******");
		System.out.println("variableOne="+variableOne);
		System.out.println("variableTwo="+variableTwo);
		variableTemp=variableOne;
		variableOne=variableTwo;
		variableTwo=variableTemp;
		System.out.println("****NUMBER AFTER SWAP******");
		System.out.println("variableOne="+variableOne);
		System.out.println("variableTwo="+variableTwo);

	}

}
