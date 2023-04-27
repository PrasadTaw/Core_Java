package pkgStudent;

import java.util.Scanner;

public class TesterStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the student details as:");
		System.out.println("Roll no -- Name -- Marks1 -- Marks2 -- Marks3");
		Student s = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		s.displayData();
		
		System.out.println("---End of Main---");

	}

}
