package com.app.org;

public class Manager extends Employee{
	
	private double perfBonus;

	public Manager() {
		super();
	}

	public Manager(String firstName, String lastName, int deptid, double basic, double perfBonus) {
		super(firstName, lastName, deptid, basic);
		this.perfBonus = perfBonus;
		
	}
	
	
	
	public double getPerfBonus() {
		return perfBonus;
	}

	@Override
	public double netSalary() {
		double salary = super.basic + perfBonus;
		return salary;
	}

	@Override
	public String toString() {
		return "Manager [toString()=" + super.toString() + ", perfBonus=" + perfBonus + ", basic=" + basic
				+ ", netSalary()=" + netSalary() + "]";
	}

	

	
	
	
	
	

}
