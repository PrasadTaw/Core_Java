package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super();
		
	}

	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}
	
	public void jam() {
		
		System.out.println("Name: "+ super.getName()+" : Making Jam!");
	}

	@Override
	public String taste() {
		
		return "Sweet and Sour";
	}

	@Override
	public String toString() {
		
		return super.toString() +" "+ this.taste();
	}
	
	
	

}
