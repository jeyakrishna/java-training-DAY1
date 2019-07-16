package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			double d = a/b;
			String []names = new String[10];
			names[0].length();
			System.out.println("No Exception....");
		}
		catch (ArithmeticException ex) {
			System.out.println("In catch block.....APE");
			ex.printStackTrace();	
		}
		catch(NullPointerException ex) {
			System.out.println("In catch block....NPE");
			ex.printStackTrace();
		}
		finally {
			System.out.println("Finally execution always ...");
		}

		System.out.println("Normal Code Flow....");
	}

}
