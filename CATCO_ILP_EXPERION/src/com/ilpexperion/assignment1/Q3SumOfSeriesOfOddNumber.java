package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q3SumOfSeriesOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int limit,position=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of the sum of series: ");
		limit = scanner.nextInt();
		
		for(int i=1;i<=limit;i+=2)
		{
			if(position%2==0)
				sum=sum-i;
			else
				sum=sum+i;
			position++;
		}
		System.out.println("Sum of the series = "+sum);

	}

}
