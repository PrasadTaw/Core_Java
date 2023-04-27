package pkgPractice;

import java.util.Scanner;

public class CharAdder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two characters to be added:");
		
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		
		int c = a + b;
		
		System.out.println("The sum of ASCII values of "+a+" and "+b+" is "+c);
		System.out.println("---End of Program---");

	}

}
