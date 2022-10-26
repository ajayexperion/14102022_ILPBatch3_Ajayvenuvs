package com.experion.basicprogramming;

import java.util.Scanner;

public class IntegerWithDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char letter;
		System.out.println("Enter the day");
		letter=scanner.next().charAt(0);
switch(letter) {
case'1':System.out.println(" monday");
break;
case'2':System.out.println(" tuesday");
break;
case'3':System.out.println(" wednesday");
break;
case'4':System.out.println(" thursday");
break;
case'5':System.out.println(" friday");
break;
case'6':System.out.println(" saturday");
break;
case'7':System.out.println(" sunday");
break;
default:System.out.println("invalid");
break;
}
	}

}
