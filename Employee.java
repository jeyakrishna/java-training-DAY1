package com.inheritance;

public class Employee extends Person {
	
	protected double salary;
	
	public Employee(int id, String name, double salary) {
		super(id,name);
		this.salary = salary;
	}
	
	@Override //to enforce that you are writing the correct method
	public String getDetails() {
		
		return super.getDetails() + " " + salary;
	}
}
