package com.ilpexperion.assignment1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Q19NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate bday = LocalDate.of(1955, Month.MAY, 19);
		LocalDate today = LocalDate.now();
		Period age = Period.between(bday, today);
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();

		System.out.println("number of days: " + days);
		System.out.println("number of years: " + years);
		System.out.println("number of months: " + months);

	}

}
