package com.bptn.course._07_00p;

public class Employee {


    // Declare instance variables outside the `main` method (within the class but outside methods)
    private String name;
    private int employeeId;
    private int age;

    // Parameterized constructor with 2 parameters
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Parameterized constructor with 3 parameters
    public Employee(String name, int employeeId, int age) {
        this(name, employeeId); // This refers to the constructor with 2 parameters
        this.age = age;
    }

    // Method to print name and employeeId
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee Id: " + this.employeeId);
    }

    // Method to print name, employeeId, and age
    public void printInfoWithAge() {
        this.printInfo(); // Calls the printInfo method
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        // Create object using the constructor with 2 parameters
        Employee e1 = new Employee("John Doe", 100);
        e1.printInfo(); // Print employee info

        // Create object using the constructor with 3 parameters
        Employee e2 = new Employee("Jane Smith", 200, 25);
        e2.printInfoWithAge(); // Print employee info with age
    }
}
	
	//1. this can be used to call instance variable from current class ("Employee class")
		//2. this can be used to call current class constructor
		//3. this can be used to call instance methods from the current class