package com.app.fruits;

public class Mango extends Fruit{

	public Mango() {
		super();
		
	}

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}
	
	public void pulp() {
		
		System.out.println("Name: "+super.getName()+" Color: "+super.getColor());
		System.out.println("Creating Mango Pulp!");
	}

	@Override
	public String taste() {
		
		return "Sweet";
	}

	@Override
	public String toString() {
		
		return super.toString() + " "+this.taste();
	}

}
