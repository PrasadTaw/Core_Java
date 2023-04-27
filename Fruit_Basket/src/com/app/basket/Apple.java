package com.app.basket;

public class Apple extends Fruit{

	
	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	@Override
	public String taste() {
		
		return "Sweet and Sour";
		
	}
	
	public String jam() {
		
		return toString() + "Making apple jam!";
	}
	
	

}
