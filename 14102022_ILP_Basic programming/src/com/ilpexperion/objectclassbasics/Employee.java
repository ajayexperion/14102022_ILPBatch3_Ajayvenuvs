package com.ilpexperion.objectclassbasics;

public class Employee {
	String employeeName = "Ajay venu v s";
	int employeeAge = 26;
	char employeeGender = 'M';
	float employeeCgpa = 7.5f;
	
	public void displayEmployeeDetails() {
		System.out.println("*********Wlcome to ILP Program**********");
		System.out.println("Name" + "		" + "Age" + "		" + "Gender" + "		" + "CGPA");
		System.out.println(employeeName + "	" + employeeAge + "	         " + employeeGender + "          	" + employeeCgpa);
	}
	

}
