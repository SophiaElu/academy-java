package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// Initialize an array with 6 int values
				int[] myArray = { 3, 5, 7, 9, 11, 13 };// index will range from 0-5

				// Print first and second element to the console
				System.out.println("First element: " + myArray[0]);

				System.out.println("Second element: " + myArray[1]);

				// Update the first element to 30
				myArray[0] = 30;

				System.out.println("Updated first element: " + myArray[0]);

				// Update the last element using length without directly referencing the index
				myArray[myArray.length - 1] = 130;

				System.out.println("Updated last element: " + myArray[myArray.length - 1]);

				// Print the elements of the array one by one using for-loop
				for (int i = 0; i < myArray.length; i++) {
		           System.out.println("The element at index " + i + " is " + myArray[i]);
				}
				
				//Print the elements of the array in reverse one by one using for-loop
				for(int i= myArray.length-1; i >=0 ; i--) {
					
					System.out.println("The element at index " + i + " is " + myArray[i]);
				}
				
				//Print the elements of the array using for-each(enhanced) loop
				for(int element : myArray) {
					System.out.println(element);
				}
				
				//Print all values of the myArray
				System.out.println(Arrays.toString(myArray));
				

			}

		
		//int[] myArray = { 3, 5, 7, 9, 11, 13 };

		//for(int element: myArray){
		//System.out.println(element);
		//}

	}


