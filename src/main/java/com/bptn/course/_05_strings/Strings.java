package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		//explore String methods
		
		String s ="Hello World";
		
		String reversedWord="";
		
		//count the total length of the string
		int stringLength=s.length();  //11
		
		System.out.println("The length of the string is: "+stringLength);
		
		//substring() method to get part of a string
		String sub= s.substring(0,5);
		
		System.out.println("The substring with start and end index is: "+sub);
		String sub1= s.substring(4);
		
		System.out.println("The substring with start index up to the end is: "+sub1);
		
		String lowerCase= s.toLowerCase();   //converts string to all lower case letters
		System.out.println("The lowercase of the string is: "+ lowerCase);
		
		String upperCase= s.toUpperCase();   //converts string to all upper case letters
		System.out.println("The uppercase of the string is: "+ upperCase);
		
		int index= s.indexOf("World"); //returns the index within this string of the first occurrence of the specified substring
		
		System.out.println("Index of substring is: "+ index);
		
		char c = s.charAt(3);
		
		System.out.println("The character at position 3 is: "+ c); //returns the char value at the specified index
		
		for(int i= stringLength-1 ; i>=0 ; i--) {
			reversedWord +=s.charAt(i);
		}
		
		System.out.println("Reversed word "+ reversedWord);
		
		
		
		
		
	}
}
