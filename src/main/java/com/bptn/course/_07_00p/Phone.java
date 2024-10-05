package com.bptn.course._07_00p;

public class Phone {
	
	//declare instance variables- properties/attributes
	//weight, height, width, color
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//constructor
	//has the same name as the ClassName (phone)
	//does not have any return type
	//default constructor - does not have any parameters passed
	public Phone() {
		
		//default values
		weight= 150;
		height= 140;
		width= 70;
		color = "Black";
	}
	
	//parameterized constructor - which has parameters passed

	//declare instance methods-behaviour/functionality
	public void makePhonecall() {
		
		System.out.println("Make a phone call");
	}
		
		public void sendTextMessage(){
		
		System.out.println("sendTextMessage");
		}
		
		public static void main(String[] args) {
			
			//create an object of the phone class using default constructor
			Phone myObj1 = new Phone();
			
			System.out.println("Default Phone: " + " Weight: " + myObj1.weight 
		            + " Height: " + myObj1.height + " Width: " + myObj1.width 
		            + " Color: " + myObj1.color);
		
		  

	}

}
//instance variables are always declared as private - because we want to encapsulate this from being assessed by anaothe//
//instance methods are always declared as public because we want it to be accessible//