package pkgTester;

import java.util.Scanner;

import pkgAssignment.Student;

public class TesterStudent {

	public static void main(String[] args) {
		
		Student[] s = new Student[50];
		int op, i;
		int index = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to IACSD: DAC 2023 batch");		
		System.out.println("1: Register Student  2: Get Student Details  3: Update Student Name  4: Update Student Address  5: See Vacancy  6: Exit");
		
		do {
			flag = false;
			
			System.out.println("Enter choice");
			op = sc.nextInt();
			switch(op) {
			
			case 1:
				System.out.println("Please enter Student name and Address");
				if(index < s.length) {
					s[index] = new Student(sc.next(), sc.next());
					System.out.println("Registration successful for:");
					s[index].displayStudent();
					index++;									
				}
				else {
					System.out.println("Batch full. Please contact administration.");
				}
				break;
			case 2:
				System.out.println("Please enter student rollno to get details");				
				int id = sc.nextInt();
				for(i = 0; i < index; i++) {
					if(id == s[i].getRollno()) {
						s[i].displayStudent();
						flag = true;
						break;
					}
				}
				if(flag)
					System.out.println("---------------------------------");
				else
					System.out.println("Student Rollno doesn't exist");
				break;
			case 3:
				System.out.println("Please enter student rollno to get update name");				
				id = sc.nextInt();
				
				for(i = 0; i < index; i++) {
					if(id == s[i].getRollno()) {
						System.out.println("Enter name to update");
						s[i].setName(sc.next());
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("Name updated successfully");
					s[i].displayStudent();
					
				}
				else {
					System.out.println("Roll number doesn't exist.");
				}
				
				break;
			case 4:
				System.out.println("Please enter student rollno to get update address");				
				id = sc.nextInt();
				
				for(i = 0; i < index; i++) {
					if(id == s[i].getRollno()) {
						System.out.println("Enter address to update");
						s[i].setAddress(sc.next());
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("Address updated successfully");
					s[i].displayStudent();
					
				}
				else {
					System.out.println("Roll number doesn't exist.");
				}
				break;
			case 5:
				
				System.out.println("Total number of seats: " + s.length);
				System.out.println("Seats filled: " + Student.getCount());
				int vacant_seats = s.length - Student.getCount();
				System.out.println("Seats remaining: " + vacant_seats);
				break;
				
			case 6:
				System.out.println("-----------end of program----------");
				break;
			default: System.out.println("Invalid choice. Try again.");
			
			}//end of switch
			
		}while(op != 6);
		
		System.out.println("------end of main--------");

	}

}
