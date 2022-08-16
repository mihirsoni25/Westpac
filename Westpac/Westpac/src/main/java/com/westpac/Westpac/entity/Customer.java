package com.westpac.Westpac.entity;

public class Customer {
	
public Customer() {
		super();
	}
public Customer(int Id, String name, long number) {
		super();
		this.Id = Id;
		this.name = name;
		this.number = number;
	}
private long Id;
public long getId() {
	return Id;
}
public void setId(int Id) {
	this.Id = Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
private String name;
private long number;
public static long getDetail() {
	// TODO Auto-generated method stub
	return 0;
}
//public int deleteCustomer() {
//	// TODO Auto-generated method stub
//	return 0;
}


