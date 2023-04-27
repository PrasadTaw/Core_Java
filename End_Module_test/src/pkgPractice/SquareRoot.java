package pkgPractice;

import java.util.Scanner;

public class SquareRoot {
	
	public static double squareRoot(int num) {
		
		double temp;
		
		double sqrt = num / 2;
		
		do {
			
			temp = sqrt;
			sqrt = (temp + num/temp) / 2.0;
		} while ((temp - sqrt) != 0);
		
		return sqrt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sqrt;
		System.out.println("Please enter a number to find sqaure root");
		int num = sc.nextInt();
		
		sqrt = squareRoot(num);
		
		System.out.println("The square root of "+num+" is: "+sqrt);
		
		
		
		

	}

}
