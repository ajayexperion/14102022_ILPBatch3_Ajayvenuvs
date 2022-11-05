package com.experion.service;

import com.experion.intity.Address;
import com.experion.intity.Employee;

public class Service {

	public static Employee createEmployee() {
		// TODO Auto-generated method stub
		
		Address address =new Address("tvm");
		Employee employee= new Employee("ajay",address);
		return employee;
		
	}

	public static void displayEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("name"+"  "+"Address");
		System.out.println(employee.getName()+"  "+employee.getAddress().getCity());
	
	}

}
