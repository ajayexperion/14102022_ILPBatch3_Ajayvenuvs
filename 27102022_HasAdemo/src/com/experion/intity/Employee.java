package com.experion.intity;

public class Employee {
private String name;
private Address address;
public Employee(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
