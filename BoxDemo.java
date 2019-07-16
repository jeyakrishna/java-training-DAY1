package com.demo.day1;

public class BoxDemo {

	public static void main(String[] args) {
		
		//Box b = new Box(); //no argument or default constructor
		// b  is located in stack & b is a reference to a object
		
		//box1
		Box b1 = new Box(10,20,30);
		double vol = b1.getVolume();
		System.out.println(vol);
		System.out.println(b1.getColor());
		
		//box2
		Box b2 = new Box(100,170,300,"blue");
		double vol2 = b2.getVolume();
		System.out.println(vol2);
		System.out.println(b2.getColor());
		
		//box3
		Box b3 = new Box(100,170,300,"red",100);
		double vol3 = b3.getVolume();
		System.out.println(vol3);
		System.out.println(b3.getColor());
		System.out.println(b3.getWeight());
		
	}

}
