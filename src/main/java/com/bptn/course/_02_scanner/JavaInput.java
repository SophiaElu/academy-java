package com.bptn.course._02_scanner;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		//create myObj which is ythe object of Scanner class
		Scanner myObj= new Scanner(System.in);
		
		//Create a variable "userNmae which is used to store the String data type
		String userName;
		
		//Ask the user to enter the username by printing "Enter Username" and read the input given by the user
		//fill in the code for the above part below
		System.out.println("Enter the username :");
		userName = myObj.nextLine();
		
		//print the username on the console
		System.out.println("The username is "+ userName);
		
		//close the scanner
		myObj.close();
		

	}

}
