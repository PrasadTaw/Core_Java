package com.app.org;

import java.util.Scanner;

public class TestOrganization {
	
	static {
		
		Employee.id = 233000;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, index = 0, ch, eid;
		Employee[] e = new Employee[50];
		
		System.out.println("1. Hire Manager 2. Hire Worder 3. Get all emplyee details 4. Update Basic Salary 5. Exit");
		
		
		do {
			System.out.println("Enter choice");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				if(index < e.length) {
					System.out.println("Please enter manager details as below:");
					System.out.println("First name, Last Name, Dept Id, Basic Salary, Perf. Bonus");
					e[index] = new Manager(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
					index++;
					(Employee.id)++;
				}
				else
					System.out.println("Positions filled. No vacancy.");
				
				
				break;
				
			case 2:
				if(index < e.length) {
					System.out.println("Please enter Worker details as below:");
					System.out.println("First name, Last Name, Dept Id, Basic Salary, Hours Worked, Hourly Rate");
					e[index] = new Worker(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
					index++;
					(Employee.id)++;
				}
				else
					System.out.println("Positions filled. No vacancy.");
				
				break;
				
			case 3:
				System.out.println("Employee Details are:");
				for (Employee emp : e) {
					if(emp != null) {
						if(emp instanceof Manager)
							System.out.println((Manager)emp);
						else if(emp instanceof Worker)
							System.out.println((Worker)emp);
					}
				}
				break;
				
			case 4:
				System.out.println("Enter emplyee id");
				eid = sc.nextInt();
				for(i = 0; i < e.length; i++) {
					if(e[i] != null && (e[i].getEmpid() == eid)) {
						System.out.println("Enter updated basic salary");
						e[i].setBasic(sc.nextDouble());
						System.out.println("Salary Updated");
						System.out.println(e[i]);
					}
				}
				break;
				
			case 5:
				System.out.println("---Operations CLosed---");
				break;
				
			default:
				System.out.println("Invalid choice. Try again");
				break;

			} //End of Switch
			
		}while(ch != 5); //End of do-while
		
		System.out.println("---End of Program---");

	}

}
