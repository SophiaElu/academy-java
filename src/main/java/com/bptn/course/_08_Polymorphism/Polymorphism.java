package com.bptn.course._08_Polymorphism;

//parent class
class Animal{
	void makeSound() {
		System.out.println("Animal makes ac sound");
	}
}

// sub class
class Dog extends Animal {
	
	//has its own methods
	@Override
	void makeSound() {
		System.out.println("Dog barks");	
}
}
public class Polymorphism {

	public static void main(String[] args) {
		// create an object of Animal class
		Animal a1 = new Animal();
		a1.makeSound();
		
		//createcan object from dog class
		Dog d1 = new Dog();
		d1.makeSound();

	}

}




//major key takeaways
//methods overriding
//Method overriding
//1. Scenario- it occurs when a sub-class overrides an existing method in the parent class
//2. Name of the method, return type of the method and number of parameters should exactly match
//3. By convention overridden methods contains @Override annotation above the method signature
//4. Methods with final keyword in the parent class cannot be overridden
//5. Static method in the parent class cannot be overridden
//6. Also known as run-time polymorphism
