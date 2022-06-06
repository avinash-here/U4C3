package com.question2;

public class PermanentEmployee extends Employee{
		
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		// TODO Auto-generated constructor stub
	}

	private double basicPay;

	@Override
	void calculateSalary() {
		double PFamount = (basicPay*12)/100;
		this.salary = basicPay - PFamount;		
	}

}
