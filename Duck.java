package com.demo.day1;

public class Duck {
	
	public void fun() {
		System.out.println("this is fun....");
		f1();
	}
	
	public static void f1() {
		//fun(); //fun doesnt exist but f1 exists
		System.out.println("This is f1()");
	}
	static int duckCount = 0;
	
	public Duck() {
		duckCount++;
	}
	
	

}
