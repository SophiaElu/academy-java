package com.bptn.course._07_00p;

public class Person {

		
		// Step 1: Declare instance variables (attributes/properties)
	    // We always declare instance variables within a class as private
	    private String name;    
	    private int age;        
	    private String location; 

	    // Step 2: Declaring the constructors - default constructor (no parameters)
	    // Default constructor - no parameters
	    public Person() {
	        this.name = "John Doe";
	        this.age = 20;
	        this.location = "Toronto";
	    }

	    // Parameterized constructor
	    public Person(String name, int age, String location) {
	        this.name = name;
	        this.age = age;
	        this.location = location;
	    }

	    // Step 3: Instance Methods
	    // Define an instance method to print name, age, and location
	    public void printInfo() {
	        // String name below has no influence in the output, as instance variables
	        // are referred to using the "this" keyword
	        String name = "unknown"; // This local variable is not needed for the output
	        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Location: " + this.location);
	    }

	    public static void main(String[] args) {

	        // Create an object of the Person class using the default constructor (no parameters)
	        Person p1 = new Person();
	        p1.printInfo(); // Prints the default person's information

	        // Create another object using the parameterized constructor
	        Person p2 = new Person("Jane Smith", 30, "Vancouver");
	        p2.printInfo(); // Prints the custom person's information

	}

}
