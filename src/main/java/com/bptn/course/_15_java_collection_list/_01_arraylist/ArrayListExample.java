package com.bptn.course._15_java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
				//ArrayList<Integer> arrayList = new ArrayList<>();	
				
				
				//2nd way of declaring ArrayList -- more preferred and accurate
				List<Integer> arrayList = new ArrayList<>();
				
				//Add values into arrayList
				arrayList.add(100);
				arrayList.add(200);
				arrayList.add(300);
				arrayList.add(300);  //ArrayList allow duplicates
				arrayList.add(400);
				arrayList.add(null); //ArrayList allow null values
				arrayList.add(null); //ArrayList allows duplicate null values
				
				
				System.out.println(arrayList);
				
				//The size of the arraylist
				System.out.println("The size of arraylist: "+ arrayList.size());
				
				//Access the first element 
				System.out.println("The first element is: "+ arrayList.get(0));
				
				//Update the element at index 2
				arrayList.set(2, 250);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				arrayList.set(5, 450);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				arrayList.add(7, 500);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				//Remove an element from index 4
				System.out.println("The element removed is: "+ arrayList.remove(4));
				
				
				//The size of the arraylist
				System.out.println("The size of arraylist: "+ arrayList.size());
				
				
				//Accessing the elements using traditional for-loop
				for(int i=0 ; i< arrayList.size() ;i++) {
					
					System.out.println(arrayList.get(i));
				}
				
				//Access the elements using for-each loop
				for(Integer element: arrayList) {
					
					System.out.println(element);
				}

			}



	}

