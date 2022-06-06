package com.question3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		switch (m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year - January");
			break;
			
		case FEB:
			System.out.println("This is the 2nd Month of the Year - February");
			break;
			
		case MAR:
			System.out.println("This is the 3rd Month of the Year - March");
			break;
			
		case APR:
			System.out.println("This is the 4th Month of the Year - April");
			break;
			
		case MAY:
			System.out.println("This is the 5th Month of the Year - May");
			break;
			
		case JUN:
			System.out.println("This is the 6th Month of the Year - June");
			break;
			
		case JUL:
			System.out.println("This is the 7th Month of the Year - July");
			break;
			
		case AUG:
			System.out.println("This is the 8th Month of the Year - August");
			break;
			
		case SEP:
			System.out.println("This is the 9th Month of the Year - September");
			break;
			
		case OCT:
			System.out.println("This is the 10th Month of the Year - October");
			break;
			
		case NOV:
			System.out.println("This is the 11th Month of the Year - November");
			break;
			
		case DEC:
			System.out.println("This is the 12th Month of the Year - December");
			break;

		default:
			break;
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month name like JAN, FEB, MAR, etc.");
		String m_name = sc.next();
		
		Demo d1 = new Demo();
		
		switch (m_name) {
		case "JAN":
			Month l = Month.JAN;
			d1.showDetails(l);
			break;
			
		case "FEB":
			Month m = Month.FEB;
			d1.showDetails(m);
			break;
			
		case "MAR":
			Month n = Month.MAR;
			d1.showDetails(n);
			break;
			
		case "APR":
			Month o = Month.APR;
			d1.showDetails(o);
			break;
			
		case "MAY":
			Month p = Month.MAY;
			d1.showDetails(p);
			break;
			
		case "JUN":
			Month q = Month.JUN;
			d1.showDetails(q);
			break;
			
		case "JUL":
			Month r = Month.JUL;
			d1.showDetails(r);
			break;
			
		case "AUG":
			Month s = Month.AUG;
			d1.showDetails(s);
			break;
			
		case "SEP":
			Month t = Month.SEP;
			d1.showDetails(t);
			break;
			
		case "OCT":
			Month u = Month.OCT;
			d1.showDetails(u);
			break;
			
		case "NOV":
			Month v = Month.NOV;
			d1.showDetails(v);
			break;
			
		case "DEC":
			Month w = Month.DEC;
			d1.showDetails(w);
			break;

		default:
			System.out.println("Invalid Month Name!");
			break;
		}		
		
	}
}
