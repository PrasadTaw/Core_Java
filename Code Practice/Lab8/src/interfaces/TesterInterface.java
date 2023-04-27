package interfaces;

import java.util.Scanner;

public class TesterInterface {
	
	//Adding static method to be used in tester main
	
	public static void display(Iprintable prn) {
		
		prn.print();
	}

	public static void main(String[] args) {
		
		System.out.println("---Program to test interfaces---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Employee Id, name and Basic salary for EMployee class object");
		Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		
		System.out.println("Please enter day, month and year for Date class object");
		Date d = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("Please enter radius of a circle, lenght and breadth of a rectangle for area");
		Shape s = new Shape(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("---Calling toString method---");
		System.out.println(e);
		System.out.println(d);
		System.out.println(s);
		System.out.println("-------------------------------------------");
		
		System.out.println("---Testing interface---");
		
		display(e);
		display(d);
		display(s);
		
		System.out.println("---End of Main---");
		
		

	}

}
