package pkgAssignment;

public class Student {

	private int rollno;
	private String name;
	private String address;
	private static int count;
	static {
		count = 0;
	}

	private static int roll;
	static {
		roll = 233000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public static int getCount() {
		return count;
	}

	public static int getRoll() {
		return roll;
	}

	public Student(String name, String address) {
		super();
		count++;
		roll++;
		this.rollno = roll;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		count++;
		roll++;
		this.rollno = roll;
		this.name = "Default_Name";
		this.address = "Default_Address";
	}

	public void displayStudent() {
		System.out.println("Student Rollno: " + getRollno());
		System.out.println("Student Name: " + getName());
		System.out.println("Student Address: " + getAddress());
	}

}
