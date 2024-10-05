package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		
		System.out.println("finding elements of given array occurs at odd position: ");
		
		//declare an array
		int[] myArray = {10,20,20,40,50};   //0,1,2,3,4
		
		//print the elements at odd index positions  //1,3
		//procedure 1
		for(int i= 1; i<myArray.length; i+=2) {
			System.out.println(myArray[i]);
			
		}
		//procedure 2
		//i =0 , 1 ,2, 3, 4
		for(int i=0 ;i<myArray.length; i++) {
			
			if(i % 2!=0) {
				System.out.println(myArray[i]);
			}
		}

	}

}

//12 / 2= 6 --> quotient
//12 % 2= 0 --> remainder
