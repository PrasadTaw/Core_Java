package com.cdac.geometry;


import java.util.Scanner;

public class TestPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double d = 0;
		System.out.println("Please enter the total of points to be plot");
		n = sc.nextInt();
		Points2D[] arr = new Points2D[n];
		
		System.out.println("Please enter the "+n+" x and y coordinates to plot the points");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Points2D(sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("All the entered points are as follows:");
		for (Points2D p : arr) {
			System.out.println(p.show());
		}
		
		System.out.println("Please choose any two indices of entered points");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(arr[i].isEqual(arr[j])) {
			System.out.println("Both points are the same");
		}
		else {
			System.out.println("Both points are not the same");
			d = arr[i].calculateDistance(arr[j]);
		}
		
		System.out.println("The didstance between the two points is: " +d);

	}

}
