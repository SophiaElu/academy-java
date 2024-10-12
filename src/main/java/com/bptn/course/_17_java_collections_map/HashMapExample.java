package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		//create an object 
				Map<String, Integer> hashMap= new HashMap<>();
				
				//K -> Key -> String
				//V- > Value -> Integer
				hashMap.put("Angie", 33);
				hashMap.put("Steve", 34);
				hashMap.put("John", 35);
				hashMap.put("Angie", 32);
				hashMap.put("Jane", 34);
				hashMap.put("Sweytha", 50);
				hashMap.put(null, 20);
				hashMap.put("Sarah", null);
				hashMap.put("Johnson", null);
				
				System.out.println(hashMap);
				
				//keySet() -> return Set view of the keys
				//get(Object k)-> return the value
				for(String key: hashMap.keySet()) {
					
					System.out.println("Name: "+ key + " Age: "+ hashMap.get(key));
				}
				
				
				//retrieve the age of John and print it to the console
				System.out.println("Age of John is: "+ hashMap.get("John"));
				
				//Update a value of existing key
				hashMap.replace("Jane", 40);
				
				System.out.println("The new age of Jane is: "+ hashMap.get("Jane"));
				
				//Check if the key is present in the map using containsKey(Object k) method
				if(hashMap.containsKey("Jane")) {
					
					System.out.println("The key is existing in the map");
				}
				else {
					System.out.println("The key is not existing in the map");
				}
				
				
				//Check if the key is present in the map using containsValue(Object v) method
				if(hashMap.containsValue(34)) {
					System.out.println("The value is existing in the map");
				}
				else {
					System.out.println("The value is not existing in the map");
				}
			
				//putIfAbsent(Object k, OBject v) 
				hashMap.putIfAbsent("Sweytha", 60); 
				
				System.out.println(hashMap);
				
				//Iterating through the HashMap using entrySet() method
				for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
					
					System.out.println("Name: "+ entry.getKey() + " Age: "+ entry.getValue());
				}
				

			}

	

	}

