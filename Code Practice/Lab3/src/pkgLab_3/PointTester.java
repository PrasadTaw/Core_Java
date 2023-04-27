package pkgLab_3;

import java.util.Scanner;

public class PointTester {

	public static void main(String[] args) {
		
		System.out.println("---This is a tester for Points class---");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of point x and y");
		Point p = new Point(sc.nextInt(), sc.nextInt());
		
		System.out.println("---Using Display function---");
		p.displayPoints();
		

	}

}
