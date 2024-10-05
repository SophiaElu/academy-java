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
