package com.bptn.course._07_00p;

public class Phone {
	
	//declare instance variables- properties/attributes
	//weight, height, width, color
	private int weight;
	private int height;
	private int width;
	private String color;

	//declare instance methods-behaviour/functionality
	public void makePhonecall() {
		
		System.out.println("Make a phone call");
	}
		
		public void sendTextMessage(){
		
		System.out.println("sendTextMessage");
		}
		
		public static void main(String[] args) {
		
		  

	}

}
//instance variables are always declared as private - because we want to encapsulate this from being assessed by anaothe//
//instance methods are always declared as public because we want it to be accessible//