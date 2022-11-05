package com.ilpexperion.assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q20ProductPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        
        



String productName;
String productCode;
String validityDate;
String expiryDate;
String purchaseDate;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the product details:-");
System.out.println("Product code:");
productCode = scanner.nextLine();
System.out.println("Product name:");
productName = scanner.nextLine();
System.out.println("Validity date:");
validityDate = scanner.nextLine();
System.out.println("Expiry date:");
expiryDate = scanner.nextLine();
System.out.println("Purchase date:");
purchaseDate = scanner.nextLine();


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate purchaseLocalDate = LocalDate.parse(purchaseDate, formatter);
LocalDate validityLocalDate = LocalDate.parse(validityDate, formatter);
LocalDate expiryLocalDate = LocalDate.parse(expiryDate, formatter);

if(purchaseLocalDate.isAfter(validityLocalDate))
    System.out.println("Cannot be purchased");
else
    System.out.println("Purchased");
		

	}

}
