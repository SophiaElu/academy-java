package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		//Step 1: Create an object from Scanner class
		Scanner myObj = new Scanner(System.in);

		//Step 2: Prompt message to the user to enter an input
		System.out.println("Enter the number: ");
		
		//Step 3: Read an input and store it inside a variable
		int number = myObj.nextInt();
		
		//Step 4: Check if the number is positive or negative or zero
		if(number > 0) {
			System.out.println(number + " is positive");
		} else if (number < 0) {
			System.out.println(number + " is negative");
		} else {
			System.out.println(number + " is zero");
		}
		
		myObj.close();
	}

}
//if and else-if has condition within ()
//else do not have a condition