package com.ilpexperion.assignment1;

import java.util.Scanner;

public class Q16ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			String sentence;
			char oldChar;
			char newChar;
			int count=0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the sentence:");
			sentence = scanner.nextLine();
			System.out.println("Enter the character to be replaced:");
			oldChar = scanner.next().charAt(0);	
			System.out.println("Enter the new character:");
			newChar = scanner.next().charAt(0);	
			
			for(int i=0;i< sentence.length()-1;i++)
			{
				if(sentence.charAt(i) == oldChar)
					count++;
			}
			
			String replaceString = sentence.replace(oldChar, newChar);
			System.out.println(replaceString);

	}

}
