package com.app.org;

public class Employee {
	
	private int empid;
	private String firstName;
	private String lastName;
	private int deptid;
	protected double basic;
	public static int id;
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName, int deptid, double basic) {
		super();
		id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptid = deptid;
		this.basic = basic;
		this.empid = id;
	}
	
	public double netSalary() {
		return basic;
	}
	
	
	
	
	
	public int getEmpid() {
		return empid;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		
		return "Emp ID: "+this.empid+" Name: "+this.firstName+" "+this.lastName+"Dept ID: "+this.deptid;
	}
	
	
	

}
