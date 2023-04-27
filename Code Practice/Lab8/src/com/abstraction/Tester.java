package com.abstraction;

import java.util.Scanner;

public class Tester {
	
	public static void displayShape(Shape s) {
		System.out.println(s);
		System.out.println(s.area());
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---Start of Random Shape Generator---");
		for(int i=0;i<5;i++) {
			String s=ShapeFactory.generateShape();
			if(s.equals("Circle")) {
				System.out.println("It's a Circle!!");
				System.out.println("Enter radius of the circle.");
				Circle c = new Circle(0, 0, sc.nextDouble()); 
				displayShape(c);
			}
			else if(s.equals("Square")) {
				System.out.println("It's a Square!!");
				System.out.println("Enter side of square.");
				Square sq = new Square(0, 0, sc.nextDouble()); 
				displayShape(sq);
			}
			else {
				System.out.println("It's a Rectangle!!");
				System.out.println("Enter Lenght and Breadth of the rectangle.");
				Rectangle r = new Rectangle(0, 0, sc.nextDouble(), sc.nextDouble()); 
				displayShape(r);
			}
		}
		sc.close();
		
		System.out.println("---End of Tester---");
	}

}
