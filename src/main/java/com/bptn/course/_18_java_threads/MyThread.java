package com.bptn.course._18_java_threads;

class A extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println("Hi Java");
		}
	}

}

class B extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println("Hello Java");
		}
	}

}

public class MyThread {

	public static void main(String[] args) {
		//Create an object of class A
		
				A myObj = new A();
				
				myObj.start();
				
				B myObj1 = new B();
				
				myObj1.start();
				
				System.out.println("Main thread");
				
				
			}

	}

