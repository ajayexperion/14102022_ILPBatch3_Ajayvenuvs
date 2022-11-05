package com.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {

	public static Service createService() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following details to create service");
		System.out.println("service code: ");
		String serviceCode = scanner.nextLine();

		System.out.println("serviceName: ");
		String serviceName = scanner.nextLine();

		System.out.println("service Description: ");
		String serviceDescription = scanner.nextLine();

		System.out.println("Open Date: ");
		String openDate = scanner.nextLine();

		System.out.println("validty date: ");
		String validityDate = scanner.nextLine();

		System.out.println("experiy date: ");
		String expiryDate = scanner.nextLine();

		Date openDateConverted = stringToDate(openDate);
		Date validityDateConverted = stringToDate(validityDate);
		Date expiryDateConverted = stringToDate(expiryDate);

		Service service = new Service(serviceCode, serviceName, serviceDescription, openDateConverted,
				validityDateConverted, expiryDateConverted);
		return service;
	}

	public static void createRateCard(Service service) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();

		System.out.println("Enter the rate card for" + service.getServiceName());
		System.out.println("Enter the number of tiers you want to add  : ");
		int noOfTirs = scanner.nextInt();
		int[] min = new int[noOfTirs];
		int[] max = new int[noOfTirs];
		double[] fees = new double[noOfTirs];

		for (int tier = 0; tier < noOfTirs; tier++) {
			System.out.println("Enter the MIN   MAX   and    RATE for the " + (tier + 1) + "tier");
			min[tier] = scanner.nextInt();
			max[tier] = scanner.nextInt();
			fees[tier] = scanner.nextDouble();
			System.out.println("Sucessfully added " + (tier + 1) + "tier");
			if(tier<noOfTirs) {
			System.out.println("do you want to add more tires(y/n)");
			char ch = scanner.next().charAt(0);
			if (ch == 'y') {
				continue;
			} else {
				break;
			}
		}

		}

		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		System.out.println("Sucessfully created");
	}

	public static void dipalyServiceDetails(Service service) {
		// TODO Auto-generated method stub
		System.out.println("*********************Service Details*********************");
		System.out.println("Service code" + "    " + "Service name" + "        " + "Service discription" + "        "
				+ "Open Date" + "    " + "validty date" + "      " + "expiry date");
		System.out.println(service.getServiceCode() + "   " + service.getServiceName() + "     "
				+ service.getServiceDesc() + "     " + service.getOpenDate() + "    " + service.getValidityDate()
				+ "     " + service.getExpiryDate());
		System.out.println("***********************rate card for the service**********8");
		System.out.println("MIN      MAX      RATE");
		for(int index=0;index<service.getRate().getMin().length;index++) {
			if((service.getRate().getMax()[index]<=99999)&&(service.getRate().getMax()[index]!=0)){
				System.out.println(service.getRate().getMin()[index]+"   "+service.getRate().getMax()[index]+"    "+service.getRate().getRate()[index] );
			}
		}

		

	}

	public static Date stringToDate(String dateString) {

		Date convertDate = null;
		try {
			convertDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return convertDate;
	}

}
