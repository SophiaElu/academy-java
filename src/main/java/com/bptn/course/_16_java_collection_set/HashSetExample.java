package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Create an object of HashSet
		
				Set<String> hashSet = new HashSet<>();
				
				hashSet.add("apple");
				hashSet.add("banana");
				hashSet.add("cherry");
				hashSet.add("mango");
				hashSet.add("apple"); 
				hashSet.add(null); 
				
				System.out.println("The HashSet of fruits: "+ hashSet );
				

			}

	}


