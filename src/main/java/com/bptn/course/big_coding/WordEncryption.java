package com.bptn.course.big_coding;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		// Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to encrypt: ");
        String word = scanner.nextLine(); // Get the input word from the user

        // Variable to store the encrypted word
        String encryptedWord = "";

        // Iterate through each character of the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i); // Get the current character from the word

            // Check if the character is a lowercase letter (between 'a' and 'z')
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Shift the character by one position, wrap around if it is 'z'
                char encryptedChar = (char) (currentChar == 'z' ? 'a' : currentChar + 1);
                encryptedWord += encryptedChar; // Append encrypted character to the result
            }
            // Check if the character is an uppercase letter (between 'A' and 'Z')
            else if (currentChar >= 'A' && currentChar <= 'Z') {
                // Shift the character by one position, wrap around if it is 'Z'
                char encryptedChar = (char) (currentChar == 'Z' ? 'A' : currentChar + 1);
                encryptedWord += encryptedChar; // Append encrypted character to the result
            }
            // If the character is not alphabetic, leave it unchanged
            else {
                encryptedWord += currentChar; // Append the non-alphabetic character unchanged
            }
        }

        // Print the encrypted word
        System.out.println("Encrypted word: " + encryptedWord);

        // Close the scanner 
        scanner.close();
		

	}

}
