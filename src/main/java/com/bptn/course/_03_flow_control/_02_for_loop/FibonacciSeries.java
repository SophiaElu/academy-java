package com.bptn.course._03_flow_control._02_for_loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Predefined numbers for starting the fibonacci sequence
		int num1 = 0;
		int num2 = 1;
        int num3;
        
        System.out.println(num1);
        System.out.println(num2);
        
        for (int i = 0; i < 8; i++) {
        	
        	num3 = num1 + num2; //num3= 0+1=1
        	
        	System.out.println(num3);
        	num1 = num2;
        	num1 = num3;
        }
	}

}
