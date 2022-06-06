package com.question2;

public class Main {

	public static void main(String[] args) {

		Loan l1 = Loan.getALoanObject();
		
		PermanentEmployee PE = new PermanentEmployee(001, "Amar Verma", 50000);
		TemporaryEmployee TE = new TemporaryEmployee(002, "Raghav Vishwa", 100, 400);
		PE.calculateSalary();
		TE.calculateSalary();
		
		double loanOfPE = l1.calculateLoanAmount(PE);
		double loanOfTE = l1.calculateLoanAmount(TE);
		double loanOfNull = l1.calculateLoanAmount(null);
		
		System.out.println("Loan amount of Permanent Employee = "+ loanOfPE);
		System.out.println("Loan amount of Temporary Employee = "+ loanOfTE);
		System.out.println("The Object you have supplied is null and the loan amount is " + loanOfNull);
	}

}
