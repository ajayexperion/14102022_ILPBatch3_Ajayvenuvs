package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q7SumOfSeriesFct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int limit;
		double sum=0;
		double factorial;
		
		System.out.println("Enter the limit:");
		limit = scanner.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			factorial = facto(i*i);
			sum = sum + (i/factorial);
		}
		System.out.println("Sum of the series = "+sum);
		
	}
	
	public static double facto(double n) {
		
		double factorial=1;
		for(int i=1;i<=n;i++)
			factorial = factorial*i;
//		System.out.println(factorial);
		return factorial;

	}

}
