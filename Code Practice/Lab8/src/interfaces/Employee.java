package interfaces;

public class Employee implements Iprintable{
	
	private int empid;
	private String name;
	private double basic;
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String name, double basic) {
		super();
		this.empid = empid;
		this.name = name;
		this.basic = basic;
	}
	
	@Override
	public void print() {
		
		System.out.println("Employee Details are:");
		System.out.println("Emp Id: "+this.empid+" Name: "+this.name+" Basic Salary: "+this.basic);
	}


	@Override
	public String toString() {
		return "Employee [empid= " + empid + ", name= " + name + ", basic= " + basic +" ]";
	}


}
