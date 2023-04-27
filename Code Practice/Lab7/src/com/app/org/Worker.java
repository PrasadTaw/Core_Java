package com.app.org;

public class Worker extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;
	public Worker() {
		super();
	}
	public Worker(String firstName, String lastName, int deptid, double basic, int hoursWorked, double hourlyRate) {
		super(firstName, lastName, deptid, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	}
	
	
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	@Override
	public double netSalary() {
		double salary = super.basic + (this.hoursWorked * this.hourlyRate);
		return salary;
	}
	@Override
	public String toString() {
		return "Worker [toString()=" + super.toString() + ", basic=" + basic + ", netSalary()=" + netSalary() + "]";
	}
	
	
	
	
	
	

}
