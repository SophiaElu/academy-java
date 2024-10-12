package com.bptn.course._18_java_threads;

public class CountdownTimer implements Runnable {
	
	private int startValue;

	public CountdownTimer(int startValue) {

		// Assign the startValue parameter to the instance variable
		this.startValue = startValue;
	}

	@Override
	public void run() {

		// Complete the functionality of run() method. Complete Steps 2,3,4
		for (int i = startValue; i >= 1; i--) {

			System.out.println(i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}