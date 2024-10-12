package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {
		
		//Create LinkedHashSet object
				Set<String> linkedHashSet = new LinkedHashSet<>();
				
				linkedHashSet.add("banana");
				linkedHashSet.add("apple");
				linkedHashSet.add("mango");
				linkedHashSet.add("cherry");
				
				linkedHashSet.add("banana");  
				
				
				linkedHashSet.add(null);
				
				System.out.println("The LinkedHashSet is: "+ linkedHashSet);

			}

	}


