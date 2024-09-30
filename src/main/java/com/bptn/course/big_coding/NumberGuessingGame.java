package com.bptn.course.big_coding;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		


		    
		        // Create a Scanner object to get user input
		        Scanner scanner = new Scanner(System.in);

		        // The target number is set to 23
		        int targetNumber = 23;
		        int guess = 0; // Variable to store the user's guess

		        // Loop until the user guesses the correct number
		        while (guess != targetNumber) {
		            // Prompt the user to guess a number
		            System.out.print("Guess a number between 1 and 100: ");
		            guess = scanner.nextInt(); // Get the user's guess

		            // Input validation: Check if the guess is within the valid range (1 to 100)
		            if (guess < 1 || guess > 100) {
		                System.out.println("Please enter a number between 1 and 100.");
		            } 
		            // Compare the guess with the target number
		            else if (guess < targetNumber) {
		                // If guess is lower than the target number
		                System.out.println("Too low! Try again.");
		            } 
		            else if (guess > targetNumber) {
		                // If guess is higher than the target number
		                System.out.println("Too high! Try again.");
		            } 
		            else {
		                // If the guess is correct
		                System.out.println("Congratulations! You guessed the number correctly!");
		            }
		        }

		        // Close the scanner 
		        scanner.close();

	}

}
