package com.app.basket;

public abstract class Fruit {
	
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	
	
	
	public Fruit() {
		super();
	}

	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public String isfresh(boolean b) {
		if(b)
			return "Fresh";
		else
			return "Stale";
	}
	
	public abstract String taste();

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", fresh=" + this.isfresh(fresh) + "]";
	}
	
	
	
	
	

}
