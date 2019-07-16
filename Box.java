package com.demo.day1;

public class Box {
	
	
	
	private int length; //blue color indicates the scope
	private int breadth; //instance variables - variables available throughout the class 
	private int height;
	private String color = "colorless";
	private double weight;
	
	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public Box(int length, int breadth, int height, String color) {
		this(length,breadth,height);
		this.color = color;
	}
	
	public Box(int length, int breadth, int height, String color, double weight) {
		this(length,breadth,height, color);
		this.weight = weight;
	}
	
	public double getVolume() {
		return length * breadth * height;
	}
	
	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
}
