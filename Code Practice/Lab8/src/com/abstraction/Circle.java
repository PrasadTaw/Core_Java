package com.abstraction;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius=radius;
	}

	@Override
	public double area() {
		return 3.14*radius*radius;
	}

	@Override
	public String toString() {
		return super.toString()+" radius: "+radius;
	}
	
	
}

