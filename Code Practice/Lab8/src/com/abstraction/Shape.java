package com.abstraction;

public abstract class Shape {
	private double x, y;

	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public abstract double area();


	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	
}

































