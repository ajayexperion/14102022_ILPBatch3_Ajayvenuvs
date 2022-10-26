package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q17NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the sentence:");
		sentence = scanner.nextLine();
		int count=0;
		for(int i=0;i< sentence.length()-1;i++)
		{
			if(sentence.charAt(i) == ' ')
				count++;
		}
		System.out.println("Number of word in the sentence is "+ (count+1));

	}

}
