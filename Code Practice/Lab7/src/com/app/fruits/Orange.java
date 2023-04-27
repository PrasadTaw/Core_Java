package com.app.fruits;

public class Orange extends Fruit{

	public Orange() {
		super();
		
	}

	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}
	
	public void juice() {
		
		System.out.println("Name: "+super.getName()+" Weight: "+super.getWeight());
		System.out.println("Extracting Orange juice!");
	}

	@Override
	public String taste() {
		
		return "Sour";
	}

	@Override
	public String toString() {
		
		return super.toString() + " "+this.taste();
	}
	
	

}
