package com.bptn.course.big_coding;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Display the calculator menu
        System.out.println("/…Calculator Menu…/");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
        
        // Get user choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        // If-else statement to handle operations
        if (choice == 1) {
            // Addition
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("The sum of " + num1 + " and " + num2 + " is = " + (num1 + num2));

        } else if (choice == 2) {
            // Subtraction
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("The difference between " + num1 + " and " + num2 + " is = " + (num1 - num2));

        } else if (choice == 3) {
            // Multiplication
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));

        } else if (choice == 4) {
            // Division
            System.out.print("Enter the dividend: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the divisor: ");
            double num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2));
                System.out.println("The remainder is " + (num1 % num2));
            }

        } else if (choice == 5) {
            // Square
            System.out.print("Enter the number to find Square: ");
            double num = scanner.nextDouble();
            System.out.println("The Square of the number " + num + " is = " + (num * num));

        } else if (choice == 6) {
            // Square Root
            System.out.print("Enter the number to find Square Root: ");
            double num = scanner.nextDouble();
            System.out.println("The Square Root of the number " + num + " is = " + Math.sqrt(num));

        } else if (choice == 7) {
            // Reciprocal
            System.out.print("Enter the number to find Reciprocal: ");
            double num = scanner.nextDouble();
            if (num == 0) {
                System.out.println("Reciprocal of zero is not defined.");
            } else {
                System.out.println("The Reciprocal of the number " + num + " is = " + (1 / num));
            }

        } else {
            // Invalid choice
            System.out.println("Invalid choice! Please make a valid choice.");
        }

        // Prompt the user if they want to continue or exit
        System.out.print("To continue calculation Press 1, else press any other number to exit: ");
        int continueCalculation = scanner.nextInt();

        // Add an if-else block to decide whether to continue or exit
        if (continueCalculation == 1) {
            main(args); // Recursively call the main method to continue the calculation
        } else {
            System.out.println("Thank you for using the calculator. Goodbye!");
        }
        // Close scanner
        scanner.close();

	}

}
