package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q12SortArrayAscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=scanner.nextInt();
		Integer number[] = new Integer[size];
		int temp = 0;
		System.out.println("Enter The Numbers :");
		for (int index = 0; index < size; index++) {
			number[index] = scanner.nextInt();

		}
		for (int j = 0; j < number.length; j++) {
			for (int k = j + 1; k < number.length; k++) {
				if (number[j] < number[k]) {
					temp = number[j];
					number[j] = number[k];
					number[k] = temp;
				}
			}

		}
System.out.println("****Ascending order is******");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			}
		System.out.println("****Decending order is******");
		for(int i=number.length-1;i>=0;i--) {
			System.out.println(number[i]);
		}
	}

	}


