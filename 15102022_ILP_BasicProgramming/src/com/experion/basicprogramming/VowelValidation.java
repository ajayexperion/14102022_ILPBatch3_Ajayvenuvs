package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char letter;
		System.out.println("Enter the alphabet letter");
		letter=scanner.next().charAt(0);
switch(letter) {
case'a':System.out.println("yes it is a vowel");
break;
case'e':System.out.println("yes it is a vowel");
break;
case'i':System.out.println("yes it is a vowel");
break;
case'o':System.out.println("yes it is a vowel");
break;
case'u':System.out.println("yes it is a vowel");
break;
case'A':System.out.println("yes it is a vowel");
break;
case'E':System.out.println("yes it is a vowel");
break;
case'I':System.out.println("yes it is a vowel");
break;
case'O':System.out.println("yes it is a vowel");
break;
case'U':System.out.println("yes it is a vowel");
break;
default:System.out.println("invalid");
break;
}
	}

}
