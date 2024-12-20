package com.bptn.course._22_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort (int[] array) {
		int size = array.length;
		//outer loop for each inded
		for (int i = 1; i<size; i++) {
			int key = array[i];
			int j = i - 1;
		//inner loop to compare and swap
			while(j>=0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {5, 3, -1, 7, 10, 2};
		System.out.print("Before sort: " + Arrays.toString(data));
		insertionSort(data);
		System.out.println();
		System.out.print("After sort: " + Arrays.toString(data));

	}

}
