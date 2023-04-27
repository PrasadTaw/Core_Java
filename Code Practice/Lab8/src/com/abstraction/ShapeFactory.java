package com.abstraction;

import java.util.Random;

public class ShapeFactory {
	public static String generateShape() {
		//generate random integer between 1 and 3(3 shapes)
        Random rand = new Random();
		int ch=rand.nextInt(3);
		switch(ch) {
		case 0:
			return "Circle";
		case 1:
			return "Square";
		case 2: 
			return "Rectangle";
		default:
			return "";
		}
	}
}
