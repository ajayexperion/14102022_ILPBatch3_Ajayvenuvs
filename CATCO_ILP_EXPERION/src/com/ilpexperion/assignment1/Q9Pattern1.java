package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q9Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int noOfRows;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of rows in the pattern: ");
		noOfRows = scanner.nextInt();
		
		for(int i=1;i<=noOfRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(  );
		}

	}

}
