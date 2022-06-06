package com.question4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Username (min 3 and max 8 characcters)");
		String user = scan.next();
		System.out.println("Enter Password (min 3 and max 8 alpha-numeric characcters)");
		String pswd = scan.next();
		System.out.println("Enter Mobile Number");
		String mobile = scan.next();
		System.out.println("Enter a valid E-mail address");
		String email = scan.next();
		
		if(user.length() >= 3 && user.length() <= 8 && pswd.length() >= 3 && pswd.length() <= 8) {
			Customer c1 = new Customer();
			c1.setUsername(user);
			c1.setPassword(pswd);
			c1.setMobileNumber(mobile);
			c1.setEmail(email);
			
			System.out.println("Customer's UserName : "+ c1.getUsername());
			System.out.println("Customer's Password : "+ c1.getPassword());
			System.out.println("Customer's Mobile Number : "+ c1.getMobileNumber());
			System.out.println("Customer's E-mail : "+ c1.getEmail());
		}
		else {
			System.out.println("Your Username and Password must be 3-8 characters long!");
		}

	}

}
