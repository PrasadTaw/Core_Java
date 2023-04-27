package com.app.basket;

public class Mango extends Fruit{

	
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	@Override
	public String taste() {
		
		return "Sweet";
	}
	
	public String pulp() {
		
		return super.toString() + "Making Mango Pulp";
	}
	
	

}
