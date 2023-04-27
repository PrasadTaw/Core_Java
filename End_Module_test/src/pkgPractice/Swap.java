package pkgPractice;

import java.util.Scanner;

public class Swap {

	public static int num1, num2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the two number to swap");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Numbers before swap: x = "+num1+" and y = "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("The numbers after swap: x = "+num1+" and y = "+num2);
		

	}

}
