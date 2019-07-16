package com.inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Employee e = new Employee(100,"John",45000);
		System.out.println(e.getDetails());
		
		Person p1 = new TraineeEmp(101, "Scott", 55000, "Good");
		System.out.println(p1.getDetails());
		
		Object o = new TraineeEmp(101, "Scott", 55000, "Good");
		System.out.println(o.getClass().getName());
	}

}
