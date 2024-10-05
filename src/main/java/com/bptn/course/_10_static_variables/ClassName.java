package com.bptn.course._10_static_variables;

public class ClassName {
	
	// Static variable (class variable)
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter;

    // Constructor
    public ClassName() {
        instanceCounter = 0; // Initialize instanceCounter
    }

    // Static method to increment the staticCounter
    public static void incrementStaticCounter() {
        staticCounter++;
        System.out.println("Static Counter: " + staticCounter);
    }

    // Instance method to increment the instanceCounter
    public void incrementInstanceCounter() {
        instanceCounter++;
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        // Incrementing static counter without creating an object
        ClassName.incrementStaticCounter(); // Output: Static Counter: 1
        ClassName.incrementStaticCounter(); // Output: Static Counter: 2

        // Creating an object of ClassName
        ClassName obj1 = new ClassName();
        obj1.incrementInstanceCounter(); // Output: Instance Counter: 1

        // Creating another object of ClassName
        ClassName obj2 = new ClassName();
        obj2.incrementInstanceCounter(); // Output: Instance Counter: 1

        // Checking static counter from both objects
        System.out.println("Final Static Counter from obj1: " + ClassName.staticCounter); // Output: 2
        System.out.println("Final Static Counter from obj2: " + ClassName.staticCounter); // Output: 2
    }
}


