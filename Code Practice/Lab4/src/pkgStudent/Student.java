package pkgStudent;

public class Student {
	
	private int roll;
	private String name;
	private int marks1, marks2, marks3;
	private int total;
	private double perc;
	private String grade;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, int marks1, int marks2, int marks3) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.total = this.marks1 + this.marks2 + this.marks3;
		this.perc = (double)this.total / 3;
		
		if(this.perc >= 90)
			this.grade = "A+";
		else if (this.perc >= 80) {
			this.grade = "A";
		}
		else if (this.perc >= 70) {
			this.grade = "B";
		}
		else if (this.perc >= 60) {
			this.grade = "C";
		}
		else if (this.perc >= 40) {
			this.grade = "D";
		}
		else {
			this.grade = "F";
		}
	}
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public int getTotal() {
		return total;
	}

	public double getPerc() {
		return perc;
	}

	public String getGrade() {
		return grade;
	}

	public void displayData() {
		
		System.out.println("Student details are:");
		System.out.println("Roll no: " + this.roll + " Name: " + this.name);
		System.out.println("Marks_1: "+this.marks1+" Marks_2: "+this.marks2+" Marks_3: "+this.marks3);
		System.out.println("Percentage: "+this.perc+" Grade: "+this.grade);
		System.out.println("----------------------------------------------------");
		
	}
	
	

}
