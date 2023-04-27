package com.abstraction;

public class Rectangle extends Shape{
	double w,h;
	public Rectangle(double x, double y, double w, double h) {
		super(x, y);
		this.w=w;
		this.h=h;
	}
	@Override
	public double area() {
		return this.w*this.h;
	}
	
	@Override
	public String toString() {
		return super.toString()+" w"+this.w+" y: "+this.h;
	}
}
