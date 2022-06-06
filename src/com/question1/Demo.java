package com.question1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(array));
		
		System.out.println("Enter the index of the array element you want to access");
		//int ind = sc.nextInt();
		
		try {
			int ind = sc.nextInt();
			System.out.println("The array element at index " + ind + " = " +  array[ind]);
			System.out.println("The array element successfully accessed");
		}
		catch(InputMismatchException ime) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException outOfBound) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
		
		
	}
	

}
