package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LocalDate systemDate = LocalDate.now();
		System.out.println(systemDate);
		String inputDate = "";
		System.out.println("Enter a date - ");
		inputDate = scanner.nextLine();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate inputLocalDate = LocalDate.parse(inputDate, formatter);
		System.out.println(inputLocalDate.isBefore(systemDate));
		
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

	}

}
