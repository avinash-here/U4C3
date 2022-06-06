package com.question2;

public class Loan {
		
	private Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Loan getALoanObject() {
		Loan l1 = new Loan();
		return l1;
	}

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj != null) {
			if(employeeObj instanceof PermanentEmployee) {
				double loan = (employeeObj.salary*15)/100;
				return loan;
			}
			else {
				double loan = (employeeObj.salary*10)/100;
				return loan;
			}
		}
		else {
			//System.out.println("The Object you have supplied is null");
			return 0;
		}
		
	}

}
