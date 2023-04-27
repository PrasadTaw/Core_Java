package pkgPractice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y = 1, i, pow = 1;
		
		System.out.println("Please enter the two number for x raised to the power y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(i = 1; i <= y; i++) {
			
			pow = pow * x;
		}
		
		System.out.println(x+" raised to the power "+y+" is: "+pow);
		

	}

}
