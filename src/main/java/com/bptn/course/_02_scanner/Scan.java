package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		 // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read an integer from the user

        // Ask the user to input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read another integer from the user

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();

	}
}
