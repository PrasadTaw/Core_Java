package pkgPractice;

import java.util.Scanner;


public class BinaryAdder {
	
	public static String addStrings(String a, String b) {
		
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		
		int sum = n1 + n2;
		String s = Integer.toBinaryString(sum);
		return s;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two binary numbers");
		String a = sc.next();
		String b = sc.next();
		String sum = addStrings(a, b);
		
		System.out.println("The binary sum of "+a+" and "+b+" is "+sum+".");
		

	}

}
