package com.bptn.course._18_java_threads;

public class ThreadExample extends Thread {
	
public ThreadExample(String name) {
		
		super(name);
	}
	
	@Override
	public void run() {
		
		
		for(int i=0; i<5;i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
	

}
