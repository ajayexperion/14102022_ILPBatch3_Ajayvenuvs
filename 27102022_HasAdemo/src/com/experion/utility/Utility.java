package com.experion.utility;

import com.experion.intity.Address;
import com.experion.intity.Employee;
import com.experion.service.Service;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Employee employee=Service.createEmployee();
		Service.displayEmployee(employee);
		
	}

}
