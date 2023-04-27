package com.app.basket;

public class Orange extends Fruit{

	@Override
	public String taste() {
		
		return "Sour";
	}
	
	public Orange(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	public String juice() {
		
		return this.toString() +"Making Orange Juice";
	}
	
	

}
