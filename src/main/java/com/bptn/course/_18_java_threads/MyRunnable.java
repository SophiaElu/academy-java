package com.bptn.course._18_java_threads;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		 
		for(int i=0; i<100; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Interuppted exception has occurred: "+ e.getMessage());
			}
		}
		
	}

}
